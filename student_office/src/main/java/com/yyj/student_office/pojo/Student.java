package com.yyj.student_office.pojo;

public class Student {
	
    private String student_id;

    private String student_name;

    private String student_pass;

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id == null ? null : student_id.trim();
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name == null ? null : student_name.trim();
    }

    public String getStudent_pass() {
        return student_pass;
    }

    public void setStudent_pass(String student_pass) {
        this.student_pass = student_pass == null ? null : student_pass.trim();
    }
}