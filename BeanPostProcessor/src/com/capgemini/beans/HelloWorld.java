package com.capgemini.beans;

public class HelloWorld {
private String message;

public void getMessage() {
	System.out.println("Your message"   +message);
}

public void setMessage(String message) {
	this.message = message;
}

public void init() {
	System.out.println("Bean is Going Through init");
}
public void destroy() {
	System.out.println("Bean is Going to destroy");
}
}
