package com.cdac.app;

import org.springframework.cache.Cache;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.component.*;
import com.cdac.component.HelloWorld;

public class App {
	public static void main(String args[]) {
		//Loading Spring/IOC Container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-spring-config.xml");
		//Accessing a particular bean
		HelloWorld hw = (HelloWorld) ctx.getBean("hello");
		System.out.println(hw.sayHello("Avinash"));
		
		Calculator  c = (Calculator) ctx.getBean("calc");
		//Calculator  c =ctx.getBean("calc",Calculator.class);//can write this way
		System.out.println(c.add(10, 20));
		System.out.println(c.sub(90, 20));
		
		CurrencyConvert cc = (CurrencyConvert) ctx.getBean("currencyConv");
		System.out.println(cc.convert("USD", "INR", 650));
		
		LoginService ll = (LoginService) ctx.getBean("log");
		System.out.println(ll.isValidUser("avinash","123"));
		
		Car car = (Car) ctx.getBean("car");
	    car.drive();
	}
}
