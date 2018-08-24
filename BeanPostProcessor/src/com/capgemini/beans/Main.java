package com.capgemini.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("Xml.xml");
	context.registerShutdownHook();
	HelloWorld obj=(HelloWorld) context.getBean("helloworld");
	obj.getMessage();
	
}
}
