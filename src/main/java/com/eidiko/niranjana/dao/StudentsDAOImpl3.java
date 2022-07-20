//package com.eidiko.niranjana.dao;
//														//APPROACH3: Here we use Lambda Expression created and implementes RowMapper<I> and copy RS record to StudentsBO class object
//                                                        // by using "queryForObject(queryForObject(String sql, RowMapper<StudentsBO> rowMapper, @Nullable Object... args) throws DataAccessException
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//import com.eidiko.niranjana.entity.StudentsBO;
//@Repository
//public class StudentsDAOImpl3 implements StudentsDAO {
//	
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
//
//	@Override
//	public StudentsBO getStudentsDetailsByNo(int no) {
//		String retrieveMultipleData = "select sno,sname,saddrs,ssal from Students where sno=?";
//		 StudentsBO bo = null;
//		bo =  jdbcTemplate.queryForObject(retrieveMultipleData,
//				( rs, rowNum ) -> {
//						//copy RS record to StudentsBO class object
//						StudentsBO boo = null;
//						boo = new StudentsBO();
//						boo.setSno(rs.getInt(1));
//						boo.setSname(rs.getString(2));
//						boo.setSaddrs(rs.getString(3));
//						boo.setSsal(rs.getFloat(4));;
//						return boo;
//					},//mapRow(-,-)
//		no );
//		return bo;
//	}
//	
//}
