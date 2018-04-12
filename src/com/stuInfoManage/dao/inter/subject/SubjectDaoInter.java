package com.stuInfoManage.dao.inter.subject;

import java.util.List;

import com.stuInfoManage.entity.Subject;

public interface SubjectDaoInter {
	
	int save(String sql,String...Strings);
	int del(String sql,String...Strings);
	void update(String sql,String...Strings);
	List<Subject> query(String sql,String...strings);
}
