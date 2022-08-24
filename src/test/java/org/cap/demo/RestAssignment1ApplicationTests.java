package org.cap.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.cap.demo.controller.StudentController;
import org.cap.demo.model.StudentVO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;

@AutoConfigureMockMvc
@SpringBootTest
class RestAssignment1ApplicationTests {


	
	@MockBean
	StudentController studentController;
	@MockBean
	private RestTemplate restTemplate;
	
	@Autowired
	private MockMvc mvc;
	@Autowired
	  private WebApplicationContext context;
	
	@BeforeEach
	  public void setup() {
		mvc = MockMvcBuilders.webAppContextSetup(context) .build();
	  }
	
	@Test
	 public void getstudentrest() throws Exception
	 {
		StudentVO student=new StudentVO(1, "sneha", "khatkole", "1234");
		when(restTemplate.getForObject("http://localhost:8089/app1/students/",StudentVO.class)).thenReturn(student);
		mvc.perform(get("/studentapp2")).andExpect(status().isOk());
		assertEquals("sneha", student.getFirstName());
				
	 }
	
	
	
}
