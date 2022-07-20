//package com.eidiko.niranjana.dao;
//														//APPROACH2: Here One Annonymous inner class created and implementes RowMapper<I> and copy RS record to StudentsBO class object
//                                                        // by using "queryForObject(queryForObject(String sql, RowMapper<StudentsBO> rowMapper, @Nullable Object... args) throws DataAccessException
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Repository;
//
//import com.eidiko.niranjana.entity.StudentsBO;
//@Repository
//public class StudentsDAOImpl2 implements StudentsDAO {
//	
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
//
//	@Override
//	public StudentsBO getStudentsDetailsByNo(int no) {
//		String retrieveMultipleData = "select sno,sname,saddrs,ssal from Students where sno=?";
//		 StudentsBO bo = null;
//		bo =  jdbcTemplate.queryForObject(retrieveMultipleData,
//				new RowMapper<StudentsBO>() {
//
//					@Override
//					public StudentsBO mapRow(ResultSet rs, int rowNum) throws SQLException {
//						//copy RS record to StudentsBO class object
//						StudentsBO bo = new StudentsBO();
//						bo.setSno(rs.getInt(1));
//						bo.setSname(rs.getString(2));
//						bo.setSaddrs(rs.getString(3));
//						bo.setSsal(rs.getFloat(4));;
//						return bo;
//					}
//			
//		},
//		no );
//		return bo;
//	}
//	
//}
