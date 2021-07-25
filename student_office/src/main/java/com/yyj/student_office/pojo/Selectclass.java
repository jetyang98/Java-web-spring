package com.yyj.student_office.pojo;

public class Selectclass {
	
    private String class_id;

    private String student_id;
    
    private double score;

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

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
}