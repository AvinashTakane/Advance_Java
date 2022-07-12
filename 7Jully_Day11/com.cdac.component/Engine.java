package com.cdac.component;

import org.springframework.stereotype.Component;

@Component("engine")
public class Engine {
	public void on() {
		System.out.println("vOORM VRROM");
	}
	public void off() {
		System.out.println("pshoo pshoo");
	}
}
