package com.eidiko.niranjana.service;


import java.util.List;

import com.eidiko.niranjana.dto.StudentsDTO;
import com.eidiko.niranjana.entity.StudentsBO;

public interface StudentsService {
	
	
	public StudentsDTO fetchStudentsDetailsByNo(int no);
	
	public List<StudentsBO> fetchTableDetails(String name);
	
	

}
