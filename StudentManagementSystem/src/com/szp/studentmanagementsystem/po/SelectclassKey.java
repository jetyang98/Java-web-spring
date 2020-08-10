package com.szp.studentmanagementsystem.po;

public class SelectclassKey {
    private String class_id;

    private String student_id;

    public String getClass_id() {
        return class_id;
    }

    public void setClass_id(String class_id) {
        this.class_id = class_id == null ? null : class_id.trim();
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id == null ? null : student_id.trim();
    }
}