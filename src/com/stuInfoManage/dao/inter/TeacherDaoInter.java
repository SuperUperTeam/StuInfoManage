package com.stuInfoManage.dao.inter;

import com.stuInfoManage.entity.Teacher;

public interface TeacherDaoInter {
	int save(String sql,String...Strings);
	int del(String sql,String...Strings);
	void update(String sql,String...Strings);
	Teacher	query(String sql,String...strings);
}
