package com.stuInfoManage.entity;

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

	public Info(int id, String content, int proNum) {
		super();
		this.id = id;
		this.content = content;
		this.proNum = proNum;
	}

	public Info() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Info [id=" + id + ", content=" + content + ", proNum=" + proNum + "]";
	}
	
}
