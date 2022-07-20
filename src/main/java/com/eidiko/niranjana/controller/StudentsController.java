package com.eidiko.niranjana.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eidiko.niranjana.dto.StudentsDTO;
import com.eidiko.niranjana.entity.StudentsBO;
import com.eidiko.niranjana.service.StudentsService;

@RestController
public class StudentsController {
	@Autowired
	private StudentsService stdService; 

	
	@GetMapping("/fetchStudentsDetailsByNo")
	public StudentsDTO fetchStudentsDetailsByStdsNo(@RequestBody StudentsBO input) {
		System.out.println("hi");
		return stdService.fetchStudentsDetailsByNo(input.getSno());
	}
	
	@GetMapping("/fetchAllData")
	public List<StudentsBO> fetchStudentsData(@RequestParam(value="name") String name) {
		System.out.println("hi");
		return stdService.fetchTableDetails(name);
	}
}
