package com.yyj.studentmanagement.po;

public class Class {
    private String class_id;

    private String class_name;

    private String teacher_id;

    private String class_address;

    private String class_time;

    public String getClass_id() {
        return class_id;
    }

    public void setClass_id(String class_id) {
        this.class_id = class_id == null ? null : class_id.trim();
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name == null ? null : class_name.trim();
    }

    public String getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(String teacher_id) {
        this.teacher_id = teacher_id == null ? null : teacher_id.trim();
    }

    public String getClass_address() {
        return class_address;
    }

    public void setClass_address(String class_address) {
        this.class_address = class_address == null ? null : class_address.trim();
    }

    public String getClass_time() {
        return class_time;
    }

    public void setClass_time(String class_time) {
        this.class_time = class_time == null ? null : class_time.trim();
    }
}