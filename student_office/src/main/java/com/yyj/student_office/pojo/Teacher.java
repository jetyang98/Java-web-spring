package com.yyj.student_office.pojo;

public class Teacher {
    private String teacher_id;

    private String teacher_name;

    private String teacher_pass;

    public String getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(String teacher_id) {
        this.teacher_id = teacher_id == null ? null : teacher_id.trim();
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name == null ? null : teacher_name.trim();
    }

    public String getTeacher_pass() {
        return teacher_pass;
    }

    public void setTeacher_pass(String teacher_pass) {
        this.teacher_pass = teacher_pass == null ? null : teacher_pass.trim();
    }
}