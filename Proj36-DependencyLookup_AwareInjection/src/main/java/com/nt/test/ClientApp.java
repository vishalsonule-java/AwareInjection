package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Person;

public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		Person person=ctx.getBean("person",Person.class);
		person.dancing();
		person.eating();
		person.doingOfficeWork();
		person.travllingToUSA();
		
	}

}
