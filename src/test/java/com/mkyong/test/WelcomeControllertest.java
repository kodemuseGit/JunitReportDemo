package com.mkyong.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
@RunWith(SpringRunner.class)
public class WelcomeControllertest {

	@Autowired
	private MockMvc mvc;

	@Test
	public void welcomeTest() {
		long expected = 1;
		long actual = 2;
		assertEquals(expected, actual);
	}
	
	@Test
	public void welcomeTest1() {
		long expected = 1;
		long actual = 3;
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void welcomeTest2() {
		long expected = 1;
		long actual = 1;
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void welcomeTest3() {
		long expected = 1;
		long actual = 4;
		assertEquals(expected, actual);
	}

}
