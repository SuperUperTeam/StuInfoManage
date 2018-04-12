package com.stuInfoManage.entity;

import com.stuInfoManage.anno.Cloumn;
import com.stuInfoManage.anno.Table;

@Table("score")
public class Score {
	
	//id
	@Cloumn("id")
	private int id;
	
	//学生编号
	@Cloumn("stu_num")
	private String stuNum;
	
	//课程编号
	@Cloumn("stb_num")
	private String subNum;
	
	//学生该课成绩
	@Cloumn("stu_sub_score")
	private double score;
	
	//该课授课教师
	@Cloumn("sub_teacher")
	private String teacher;
	
	//备注
	@Cloumn("sco_reamark")
	private String reamrk;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStuNum() {
		return stuNum;
	}

	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}

	public String getSubNum() {
		return subNum;
	}

	public void setSubNum(String subNum) {
		this.subNum = subNum;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getReamrk() {
		return reamrk;
	}

	public void setReamrk(String reamrk) {
		this.reamrk = reamrk;
	}

	public Score(int id, String stuNum, String subNum, double score, String teacher, String reamrk) {
		super();
		this.id = id;
		this.stuNum = stuNum;
		this.subNum = subNum;
		this.score = score;
		this.teacher = teacher;
		this.reamrk = reamrk;
	}

	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Score [id=" + id + ", stuNum=" + stuNum + ", subNum=" + subNum + ", score=" + score + ", teacher="
				+ teacher + ", reamrk=" + reamrk + ", getId()=" + getId() + ", getStuNum()=" + getStuNum()
				+ ", getSubNum()=" + getSubNum() + ", getScore()=" + getScore() + ", getTeacher()=" + getTeacher()
				+ ", getReamrk()=" + getReamrk() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
