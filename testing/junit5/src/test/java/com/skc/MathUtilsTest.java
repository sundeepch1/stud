package com.skc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {
	MathUtils mathUtils;
	
	@BeforeEach
	void init() {
		mathUtils=new MathUtils();
		System.out.println("init");
	}
	
	@AfterEach
	void destroy() {
		
		System.out.println("destroy");
	}

	@Test
	void test() {
		int expected = 2;
		int actual = mathUtils.add(1, 1);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void test1() {
		
		int expected = 2;
		int actual = mathUtils.add(1, 1);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void test2() {
		
		int expected = 2;
		int actual = mathUtils.add(1, 1);
		
		assertEquals(expected, actual);
	}
}
