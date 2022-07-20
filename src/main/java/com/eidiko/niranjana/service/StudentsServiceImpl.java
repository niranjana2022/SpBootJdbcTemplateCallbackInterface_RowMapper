package com.eidiko.niranjana.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eidiko.niranjana.dao.StudentsDAO;
import com.eidiko.niranjana.dto.StudentsDTO;
import com.eidiko.niranjana.entity.StudentsBO;
@Service
public class StudentsServiceImpl implements StudentsService{

	@Autowired
	private StudentsDAO stdDao;

	@Override
	public StudentsDTO fetchStudentsDetailsByNo(int no) {
		StudentsBO bo=null;	
       	StudentsDTO dto=null;
		bo = stdDao.getStudentsDetailsByNo(no);
		dto = new StudentsDTO();
		//Convert BO to DTO
		BeanUtils.copyProperties(bo, dto);
		return dto;
		
	}
	
	
	@Override
	public List<StudentsBO> fetchTableDetails(String name) {
	return	stdDao.getTableDetails(name);
	}
	
	

	

	
	
}
