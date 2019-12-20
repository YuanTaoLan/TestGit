package com.tao.test;

import org.junit.Test;

import com.tao.pojo.Student;

public class TestDemo01 {
	
	@Test
	public void test01() {
		
		System.out.println("这是测试类01中的test01方法");
		Student student = new Student();
		student.eat();
		
	}

}
