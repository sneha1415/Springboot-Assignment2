package org.cap.demo.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;

import org.cap.demo.model.StudentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/app2")
public class StudentController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Value("${student.url}")
	String url;
	
   
	
	
	@RequestMapping("/studentapp2")
	@CircuitBreaker(name="get_students_data_circuitbreaker",fallbackMethod = "getFallbackMethodCB")
	public ResponseEntity<StudentVO[]> getData() throws URISyntaxException
	{

		StudentVO[] students= restTemplate.getForObject(url, StudentVO[].class);
		return new ResponseEntity<StudentVO[]>(students,HttpStatus.OK);

		
	//hello this is demo github demodemo
	}
	 public ResponseEntity<StudentVO[]> getFallbackMethodCB(Throwable ex){
			
	    	StudentVO[] studentVOs=null;
			return new ResponseEntity("server is down! Please try again after some time",HttpStatus.NOT_FOUND);
					
			
		}
	
	
	
	
	
	@GetMapping("/message")
	public String testMassage() {
		return "message from application 2--------";
	}

}
