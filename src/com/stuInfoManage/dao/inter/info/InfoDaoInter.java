package com.stuInfoManage.dao.inter.info;

import java.util.List;

import com.stuInfoManage.entity.Info;

public interface InfoDaoInter {
	
	int save(String sql,String...Strings);
	int del(String sql,String...Strings);
	void update(String sql,String...Strings);
	List<Info> query(String sql,String...strings);
}
