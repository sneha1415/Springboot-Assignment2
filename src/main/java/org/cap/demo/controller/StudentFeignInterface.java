package org.cap.demo.controller;

import java.util.List;

import org.cap.demo.model.StudentVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="feigndemo",url = "${student.url}")
public interface StudentFeignInterface {
	@GetMapping("/")
	public List<StudentVO> getAllStudents();
}
