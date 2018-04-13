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
	
	//学生姓名
	@Cloumn("stu_name")
	private String stuName;
	
	//课程编号
	@Cloumn("sub_num")
	private String subNum;
	
	//课程名称
	@Cloumn("sub_name")
	private String subName;
	
	//学生该课成绩
	@Cloumn("stu_sub_score")
	private double score;
	
	//课程状态(1:选修  2:必修)
	@Cloumn("sub_status")
	private String subStatus;
	
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


	public String getStuName() {
		return stuName;
	}


	public void setStuName(String stuName) {
		this.stuName = stuName;
	}


	public String getSubNum() {
		return subNum;
	}


	public void setSubNum(String subNum) {
		this.subNum = subNum;
	}


	public String getSubName() {
		return subName;
	}


	public void setSubName(String subName) {
		this.subName = subName;
	}


	public double getScore() {
		return score;
	}


	public void setScore(double score) {
		this.score = score;
	}


	public String getSubStatus() {
		return subStatus;
	}


	public void setSubStatus(String subStatus) {
		this.subStatus = subStatus;
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


	@Override
	public String toString() {
		return "Score [id=" + id + ", stuNum=" + stuNum + ", stuName=" + stuName + ", subNum=" + subNum + ", subName="
				+ subName + ", score=" + score + ", subStatus=" + subStatus + ", teacher=" + teacher + ", reamrk="
				+ reamrk + "]";
	}


	public Score(int id, String stuNum, String stuName, String subNum, String subName, double score, String subStatus,
			String teacher, String reamrk) {
		super();
		this.id = id;
		this.stuNum = stuNum;
		this.stuName = stuName;
		this.subNum = subNum;
		this.subName = subName;
		this.score = score;
		this.subStatus = subStatus;
		this.teacher = teacher;
		this.reamrk = reamrk;
	}


	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
