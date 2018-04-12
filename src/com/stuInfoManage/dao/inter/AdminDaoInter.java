package com.stuInfoManage.dao.inter;

import com.stuInfoManage.entity.Admin;

public interface AdminDaoInter {
	int save(String sql,String...Strings);
	int del(String sql,String...Strings);
	void update(String sql,String...Strings);
	Admin query(String sql,String...strings);
}
