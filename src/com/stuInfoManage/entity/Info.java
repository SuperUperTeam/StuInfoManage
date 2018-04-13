package com.stuInfoManage.entity;

import java.util.Date;

import com.stuInfoManage.anno.Cloumn;
import com.stuInfoManage.anno.Table;

@Table("info")
public class Info {
	
	//id
	@Cloumn("id")
	private int id;
	
	//通知内容
	@Cloumn("info_content")
	private String content;
	
	//发布者编号
	@Cloumn("info_promulgator_num")
	private int proNum;

	//发布时间
	@Cloumn("info_promulgate_date")
	private Date date;
	
	//发布者状态
	@Cloumn("info_promulgator_type")
	private Date type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getProNum() {
		return proNum;
	}

	public void setProNum(int proNum) {
		this.proNum = proNum;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getType() {
		return type;
	}

	public void setType(Date type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Info [id=" + id + ", content=" + content + ", proNum=" + proNum + ", date=" + date + ", type=" + type
				+ "]";
	}

	public Info(int id, String content, int proNum, Date date, Date type) {
		super();
		this.id = id;
		this.content = content;
		this.proNum = proNum;
		this.date = date;
		this.type = type;
	}

	public Info() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
