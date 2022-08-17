package org.cap.demo.controller;

import java.net.URISyntaxException;
import java.util.List;

import org.cap.demo.model.StudentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
public class StudentFeignController {
	
	@Autowired
	private StudentFeignInterface studentFeignInterface;
	
	@GetMapping("/feignstudent")
	public List<StudentVO> getData() throws URISyntaxException
	{
		
		List<StudentVO> students= studentFeignInterface.getAllStudents();
		
		return students;
		
	
	}
	
	

}
