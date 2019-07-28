package com.example.studygreendao.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Unique;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class Teacher {
    @Id(autoincrement = true)
    private Long id;
    @Unique
    private int teacherNo;
    private int age;
    private String telPhone;
    private String sex;
    private String name;
    @Generated(hash = 1885377144)
    public Teacher(Long id, int teacherNo, int age, String telPhone, String sex,
            String name) {
        this.id = id;
        this.teacherNo = teacherNo;
        this.age = age;
        this.telPhone = telPhone;
        this.sex = sex;
        this.name = name;
    }
    @Generated(hash = 1630413260)
    public Teacher() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getTeacherNo() {
        return this.teacherNo;
    }
    public void setTeacherNo(int teacherNo) {
        this.teacherNo = teacherNo;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getTelPhone() {
        return this.telPhone;
    }
    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone;
    }
    public String getSex() {
        return this.sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
