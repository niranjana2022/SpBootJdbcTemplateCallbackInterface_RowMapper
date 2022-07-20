//package com.eidiko.niranjana.dao;
//														//APPROACH 4:we can use BeanPropertyRowMapper() pre-defined class..So no need to take own Custom class... 
//                                                       
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//import com.eidiko.niranjana.entity.StudentsBO;
//@Repository
//public class StudentsDAOImpl4 implements StudentsDAO {
//	
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
//
//	@Override
//	public StudentsBO getStudentsDetailsByNo(int no) {
//		String retrieveMultipleData = "select sno,sname,saddrs,ssal from Students where sno=?";
//		 StudentsBO bo = null;
//		bo =  jdbcTemplate.queryForObject(retrieveMultipleData, new BeanPropertyRowMapper<StudentsBO>(StudentsBO.class), no);
//				
//		return bo;
//	}
//	
//}
