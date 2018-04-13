package com.stuInfoManage.entity;

import com.stuInfoManage.anno.Cloumn;
import com.stuInfoManage.anno.Table;

@Table("student")
public class Student {
	
	//学生id
	@Cloumn("id")
	private int id;
	
	//学生编号
	@Cloumn("stu_num")
	private String num;
	
	//学生姓名
	@Cloumn("stu_name")
	private String name;
	
	//学生性别
	@Cloumn("stu_gender")
	private int gender;
	
	//学生年龄
	@Cloumn("stu_age")
	private int age;
	
	//学生状态 1:正常  2:已删除
	@Cloumn("stu_status")
	private int status;
	
	//学生表备注
	@Cloumn("stu_remark")
	private String remark;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", num=" + num + ", name=" + name + ", gender=" + gender + ", age=" + age
				+ ", status=" + status + ", remark=" + remark + "]";
	}

	public Student(int id, String num, String name, int gender, int age, int status, String remark) {
		super();
		this.id = id;
		this.num = num;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.status = status;
		this.remark = remark;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
