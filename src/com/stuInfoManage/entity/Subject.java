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
	
	//课程状态1：选修课 2必修课
	@Cloumn("sub_status")
	private int status;
	
	//授课教师
	@Cloumn("sub_teacher")
	private String teacher;
	
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Subject(int id, String num, String name, int credit, int hour, int status, String teacher, String remark) {
		super();
		this.id = id;
		this.num = num;
		this.name = name;
		this.credit = credit;
		this.hour = hour;
		this.status = status;
		this.teacher = teacher;
		this.remark = remark;
	}

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + credit;
		result = prime * result + hour;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((num == null) ? 0 : num.hashCode());
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
		result = prime * result + status;
		result = prime * result + ((teacher == null) ? 0 : teacher.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subject other = (Subject) obj;
		if (credit != other.credit)
			return false;
		if (hour != other.hour)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num == null) {
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		if (remark == null) {
			if (other.remark != null)
				return false;
		} else if (!remark.equals(other.remark))
			return false;
		if (status != other.status)
			return false;
		if (teacher == null) {
			if (other.teacher != null)
				return false;
		} else if (!teacher.equals(other.teacher))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Subject [id=" + id + ", num=" + num + ", name=" + name + ", credit=" + credit + ", hour=" + hour
				+ ", status=" + status + ", teacher=" + teacher + ", remark=" + remark + "]";
	}
	
}
