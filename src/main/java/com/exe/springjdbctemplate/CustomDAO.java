package com.exe.springjdbctemplate;

import javax.sql.DataSource;

public class CustomDAO {
	
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
}
