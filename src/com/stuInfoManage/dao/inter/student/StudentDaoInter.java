package com.stuInfoManage.dao.inter.student;

import java.util.List;

import com.stuInfoManage.entity.Student;

public interface StudentDaoInter {
	
	int save(String sql,String...Strings);
	int del(String sql,String...Strings);
	void update(String sql,String...Strings);
	List<Student> query(String sql,String...strings);
}
