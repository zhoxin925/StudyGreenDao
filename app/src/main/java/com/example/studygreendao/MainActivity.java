package com.example.studygreendao;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.studygreendao.bean.Student;
import com.example.studygreendao.database.DBManager;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    private Context context;
    private long id = 1;
    private int studentNo = 20111060;

    @OnClick({R.id.insert, R.id.update, R.id.query, R.id.delete})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.insert:
                Student student = new Student();
                student.setId(id++);
                student.setStudentNo(studentNo++);
                student.setAge(26);
                student.setTelPhone("18293872298");
                student.setName("zxxxxxxxxx");
                student.setSex("女");
                student.setAddress("wxxxxxxxxxxxxxx");
                student.setGrade("27");
                student.setSchoolName("毕业啦,再也不是学生了");
                DBManager.getInstance(context).getStudentDao().insert(student);
                //DBManager.getInstance(context).getStudentDao().insertOrReplace(student);
                break;
            case R.id.update:
                break;
            case R.id.delete:
                break;
        }
        Log.i("db:loadAll datas", DBManager.getInstance(context).getStudentDao().loadAll().toString());
        //Log.i("db:queryBuilder datas", DBManager.getInstance(context).getStudentDao().queryBuilder().list()+"");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        context = this;
    }
}
