package com.exe.springjdbctemplate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class CustomDAO2 {
	
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	Connection conn = null;
	
	public void insertDate(CustomDTO dto) {
		
		StringBuilder sql = new StringBuilder();
		
		sql.append("insert into custom(id,name,age) values(?,?,?)");
		
		jdbcTemplate.update(sql.toString(),dto.getId(),dto.getName(),dto.getAge());
		
	}
	
	/*public int updateData(CustomDTO dto) {
		
		int result = 0;
		PreparedStatement pstmt = null;
		String sql;
		
		try {
			
			conn = dataSource.getConnection();
			sql = "update custom set name=?, age=? where id=?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(3, dto.getId());
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getAge());
			
			result = pstmt.executeUpdate();
			
			pstmt.close();
			conn.close();
		
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		
		return result;
	}
	
	public List<CustomDTO> getLists(){
		
		StringBuilder sql = new StringBuilder();
		
		sql.append("select id,name,age from custom");
		
		jdbcTemplate.execute(sql.toString());
			
		
	}
	
	
	public CustomDTO getReadData(int id){
		
		CustomDTO dto = null;
		PreparedStatement pstmt = null;
		String sql = "";
		ResultSet rs = null;
		
		try {
			
			conn = dataSource.getConnection();
			
			sql = "select id,name,age from custom where id = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, id);
			
			rs = pstmt.executeQuery();
			
			
			
			while(rs.next()) {
				
				dto = new CustomDTO();
				
				dto.setId(rs.getInt("id"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
			}
		
			rs.close();
			conn.close();
			pstmt.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		
		return dto;
	}
	
	
	public int deleteData(int id) {
		
		int result = 0;
		PreparedStatement pstmt = null;
		String sql = "";
		
		try {
			
			conn = dataSource.getConnection();
			
			sql = "delete from custom where id=?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, id);
			
			result = pstmt.executeUpdate();
			
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return result;
	}*/
	
	
	
	
	
	
	
}
