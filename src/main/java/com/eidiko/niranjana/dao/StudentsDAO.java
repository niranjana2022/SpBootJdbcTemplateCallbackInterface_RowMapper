package com.eidiko.niranjana.dao;
import java.util.List;


import com.eidiko.niranjana.entity.StudentsBO;

public interface StudentsDAO {
	
	
	public StudentsBO getStudentsDetailsByNo(int no); //Using queryForObject method:- StudentsMapper implements RowMapper
	
	public List<StudentsBO> getTableDetails(String name); //Using query method:-BeanPropertyRowMapper
	

}
