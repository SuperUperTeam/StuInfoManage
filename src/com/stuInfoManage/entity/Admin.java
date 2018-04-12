package com.stuInfoManage.entity;

import com.stuInfoManage.anno.Cloumn;
import com.stuInfoManage.anno.Table;

@Table("admin")
public class Admin {
	
	//管理员id
	@Cloumn("id")
	int id;
	
	//管理员编号
	@Cloumn("admin_num")
	int num;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Admin(int id, int num) {
		super();
		this.id = id;
		this.num = num;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + num;
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
		Admin other = (Admin) obj;
		if (id != other.id)
			return false;
		if (num != other.num)
			return false;
		return true;
	}
	
}
