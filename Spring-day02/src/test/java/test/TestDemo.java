package test;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.demo.ValueBean;



public class TestDemo {
	@Test
	public void test(){
			AbstractApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
			ValueBean us = ac.getBean("valueBean", ValueBean.class);
			System.out.println(us);
			ac.close();
		
	}
	
	@Test
	public void test1(){
			AbstractApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
			ValueBean us = ac.getBean("valueBean2", ValueBean.class);
			System.out.println(us);
			ac.close();
		
	}
}
