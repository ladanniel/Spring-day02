package test;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.service.UserService;
import cn.tedu.sington.King;

public class TestKing {
	@Test
	public void test(){
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		King k = ac.getBean("king",King.class);
		King k2 = ac.getBean("king",King.class);
		System.out.println("king k1"+k);//hashcode码（哈希码）
		System.out.println("king k2"+k2);//hashcode码（哈希码）
		ac.close();
	}
	//测试bean的延迟加载
	@Test
	public void test2(){
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		King king = ac.getBean("king",King.class);
		king.sayHello();
		ac.close();
				
	}
	@Test
	public void test3(){
	AbstractApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	UserService us = ac.getBean("userService",UserService.class);
	us.addUser();
	ac.close();
	}
	//带参数的构造方法创建对象，并给成员变量赋值
	@Test
	public void test4(){
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService us = ac.getBean("userService2",UserService.class);
		us.addUser();
		ac.close();
	}
	@Test
	public void test5(){
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService us = ac.getBean("userService3",UserService.class);
		us.addUser();
		ac.close();
	}
	@Test
	public void test6(){
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService us = ac.getBean("userService4",UserService.class);
		us.addUser();
		ac.close();
	}

}
