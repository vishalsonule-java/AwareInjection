package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Person implements ApplicationContextAware{
	private String beanId;
	private ApplicationContext ctx=null;
	public Person(String beanId) {
		this.beanId = beanId;
	}
	public void eating() {
		System.out.println("Person.eating()");
	}
	public void dancing() {
		System.out.println("Person:dancing()");
	}
	public void doingOfficeWork() {
		System.out.println("Person:doingOfficeWork()");
	}
public void travllingToUSA() {
	
	USVisa visa=ctx.getBean(beanId,USVisa.class);
	if(visa.isApprovled()) {
		System.out.println("visa is approved travlling to us for vaction and for office work");
		
	}
	else 
		System.out.println("visa is not approved so stayback to india");
}
public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	this.ctx=applicationContext;
	
}
}
