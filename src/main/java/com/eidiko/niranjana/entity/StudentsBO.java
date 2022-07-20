package com.eidiko.niranjana.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentsBO  {
	private  Integer sno;		
	private  String sname;		
	private  String saddrs;		
	private  Float ssal;

	@Override
	public String toString() {
		return "Students [sno=" + sno + ", sname=" + sname + ", saddrs=" + saddrs + ", ssal=" + ssal + "]";
	}
}
