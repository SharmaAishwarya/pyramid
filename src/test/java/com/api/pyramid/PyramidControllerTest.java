package com.api.pyramid;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.api.controllers.PyramidController;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PyramidControllerTest {
	@Autowired
	public PyramidController pyramidController;
	@Autowired
	private MockMvc mockMvc;
	
	String s = "hello ! In order to use this API."+
			 "\n 1. POST a request to localhost:8080/pyramid "+
			 "\n 2. Enter a string value without using quotes and semi quotes \"\"  "+
			 "\n 3. An example of input is banana. Make sure you have no spaces in between or after";
	
	@Test
	public void shouldReturnDefaultMessage() throws Exception {
		this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString(s)));
	}
	

	@Test
	void isPyramidControllerTestIsTrue() throws Exception {
		
		boolean actual = pyramidController.isPyramid("banana");
		assertEquals(true, actual);
	}
	
	@Test
	void isPyramidControllerTestIsFalse() {
		boolean actual = pyramidController.isPyramid("bandana");
		assertEquals(false, actual);
	}
	
}
