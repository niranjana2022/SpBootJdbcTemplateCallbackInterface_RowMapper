package com.eidiko.niranjana.dao;
														//APPROACH1: Here we create our own Mapper class which implements RowMapper<I> and //copy RS record to StudentsBO class object
                                                        // by using "queryForObject(queryForObject(String sql, RowMapper<StudentsBO> rowMapper, @Nullable Object... args) throws DataAccessException


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.eidiko.niranjana.entity.StudentsBO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
@Repository
public class StudentsDAOImpl implements StudentsDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public StudentsBO getStudentsDetailsByNo(int no) {
		String retrieveMultipleData = "select sno,sname,saddrs,ssal from Students where sno=?";
		 StudentsBO bo = null;
		bo =  jdbcTemplate.queryForObject(retrieveMultipleData,new StudentsMapper(),no);
		return bo;
	}
	//nested class
	private static class StudentsMapper implements RowMapper<StudentsBO>{

		@Override
		public StudentsBO mapRow(ResultSet rs, int rowNum) throws SQLException {
			//copy RS record to StudentsBO class object
			StudentsBO bo = new StudentsBO();
			bo.setSno(rs.getInt("sno"));
			//bo.setSname(rs.getString("sname"));
			bo.setSaddrs(rs.getString("saddrs"));
			bo.setSsal(rs.getFloat("ssal"));;
			return bo;
		}
		
	}
	@Override
	public List<StudentsBO> getTableDetails(String name) {
		String retrieveMultipleData = "select sno,saddrs,sname,ssal from students where sname=?";
		 List<StudentsBO> bo = null;
		bo =  jdbcTemplate.query(retrieveMultipleData, new BeanPropertyRowMapper().newInstance(StudentsBO.class),name);
		return bo;
	}
	
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		
		String str = "{\r\n"
				+ "    \"sno\": 3,\r\n"
				+ "    \"sname\": \"ABHINASH\",\r\n"
				+ "    \"saddrs\": \"ODISHA\",\r\n"
				+ "    \"ssal\": 30000.0\r\n"
				+ "}";
		StudentsBO bo = new ObjectMapper().readValue(str, StudentsBO.class);
		System.out.println(bo);
		System.out.println(".............................");
		String str1 = "[\r\n"
				+ "    {\r\n"
				+ "        \"sno\": 2,\r\n"
				+ "        \"sname\": \"KALIA\",\r\n"
				+ "        \"saddrs\": \"CHENNAI\",\r\n"
				+ "        \"ssal\": 25000.0\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "        \"sno\": 5,\r\n"
				+ "        \"sname\": \"KALIA\",\r\n"
				+ "        \"saddrs\": \"MUMBAI\",\r\n"
				+ "        \"ssal\": 35000.0\r\n"
				+ "    }\r\n"
				+ "]";
		StudentsBO[] boo = new ObjectMapper().readValue(str1, StudentsBO[].class);
		List<StudentsBO> list = new ArrayList<>(Arrays.asList(boo));
		System.out.println(list);
	}
	
	
}
