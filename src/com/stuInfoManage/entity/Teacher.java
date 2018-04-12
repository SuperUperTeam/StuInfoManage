package com.stuInfoManage.entity;

import com.stuInfoManage.anno.Cloumn;
import com.stuInfoManage.anno.Table;

@Table("teacher")
public class Teacher {
	
	//教师表id
	@Cloumn("id")
	private int id;
	
	//教师编号
	@Cloumn("tea_num")
	private String num;
	
	//教师姓名
	@Cloumn("tea_name")
	private String name;
	
	//教师性别
	@Cloumn("tea_gender")
	private int gender;
	
	//教师年龄
	@Cloumn("tea_age")
	private int age;
	
	//教师备注
	@Cloumn("tea_remark")
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Teacher(int id, String num, String name, int gender, int age, String remark) {
		super();
		this.id = id;
		this.num = num;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.remark = remark;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
