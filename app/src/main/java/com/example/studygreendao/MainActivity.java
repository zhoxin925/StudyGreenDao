package com.example.studygreendao;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.studygreendao.bean.Student;
import com.example.studygreendao.greendao.DaoSession;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    private DaoSession daoSession;

    @OnClick({R.id.insert, R.id.update, R.id.query, R.id.delete})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.insert:
                daoSession.deleteAll(Student.class);
                for(int i=1;i<6;i++)
                {
                    Student student = new Student();
                    student.setStudentNo(i);
                    student.setAge(10+i);
                    student.setTelPhone("tel:"+i);
                    student.setName("name:"+i);
                    if (i % 2 == 0) {
                        student.setSex("男");
                    } else {
                        student.setSex("女");
                    }
                    student.setAddress("address:"+i);
                    student.setGrade(i + "年纪");
                    student.setSchoolName("schoolName:"+i);
                    daoSession.insert(student);
                }
                break;
            case R.id.update:
                Student student = new Student();
                student.setStudentNo(1);
                student.setAge(10+1);
                student.setTelPhone("tel:"+1);
                student.setName("name:"+1);
                if (1 % 2 == 0) {
                    student.setSex("男");
                } else {
                    student.setSex("女");
                }
                student.setAddress("address:"+1);
                student.setGrade(1 + "年纪哈哈哈哈哈哈哈哈");
                student.setSchoolName("schoolName:"+1);
                daoSession.update(student);
                break;
            case R.id.delete:
                Student student1 = new Student();
                student1.setStudentNo(3);
                student1.setAge(10+3);
                student1.setTelPhone("tel:"+3);
                student1.setName("name:"+3);
                if (3 % 2 == 0) {
                    student1.setSex("男");
                } else {
                    student1.setSex("女");
                }
                student1.setAddress("address:"+3);
                student1.setGrade(3 + "年纪哈哈哈哈哈哈哈哈");
                student1.setSchoolName("schoolName:"+3);
                daoSession.delete(student1);
                break;
        }
        Log.i("loadAll datas = ", daoSession.loadAll(Student.class).toString());
        Log.i("queryBuilder datas = ", daoSession.queryBuilder(Student.class).list().toString());
        Log.i("queryBuilder datas = ", daoSession.queryBuilder(Student.class).list()+"");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        daoSession = ((DaoApplication)getApplication()).getDaoSession();
    }
}
