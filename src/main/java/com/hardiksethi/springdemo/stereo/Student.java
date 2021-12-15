package com.hardiksethi.springdemo.stereo;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("stu")
@Scope("prototype")
public class Student {
	
	@Value("hardiksethi")
	private String studentName;
	
	@Value("delhi")
	private String city;
	@Value("#{places}")
	private List<String> list;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", list=" + list + "]";
	}
		
	
	
}
