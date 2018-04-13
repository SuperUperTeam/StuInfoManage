package com.stuInfoManage.entity;

import com.stuInfoManage.anno.Cloumn;
import com.stuInfoManage.anno.Table;

@Table("subject")
public class Subject {
	
	//id
	@Cloumn("id")
	private int id;
	
	//课程编号
	@Cloumn("sub_num")
	private String num;
	
	//课程名称
	@Cloumn("sub_name")
	private String name;
	
	//课程学分
	@Cloumn("sub_credit")
	private int credit;
	
	//课时
	@Cloumn("sub_hour")
	private int hour;
	
	//课程类型  ：1 选修课 2必修课
	@Cloumn("sub_type")
	private int type;
	
	//授课教师
	@Cloumn("sub_teacher")
	private String teacher;
	
	//课程状态1:正常 2已删除
	@Cloumn("sub_status")
	private int status;
	
	//备注
	@Cloumn("sub_reamark")
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

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
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
		return "Subject [id=" + id + ", num=" + num + ", name=" + name + ", credit=" + credit + ", hour=" + hour
				+ ", type=" + type + ", teacher=" + teacher + ", status=" + status + ", remark=" + remark + "]";
	}

	public Subject(int id, String num, String name, int credit, int hour, int type, String teacher, int status,
			String remark) {
		super();
		this.id = id;
		this.num = num;
		this.name = name;
		this.credit = credit;
		this.hour = hour;
		this.type = type;
		this.teacher = teacher;
		this.status = status;
		this.remark = remark;
	}

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
