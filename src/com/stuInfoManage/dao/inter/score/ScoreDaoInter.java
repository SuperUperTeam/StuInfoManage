package com.stuInfoManage.dao.inter.score;

import java.util.List;

import com.stuInfoManage.entity.Score;

public interface ScoreDaoInter {
	
	int save(String sql,String...Strings);
	int del(String sql,String...Strings);
	void update(String sql,String...Strings);
	List<Score> query(String sql,String...strings);
	int queryStuCount(String sql,String...strings);
}
