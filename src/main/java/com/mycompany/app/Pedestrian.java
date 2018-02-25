package com.mycompany.app;

import org.aspectj.lang.annotation.*;

public class Pedestrian {

	@Pointcut("execution(* com.mycompany.app.Driver.goToWork())")
	public void scream() {
		System.out.println("AAAAAH!");
	}
	
	@AfterReturning("scream()")
	public void die() {
		System.out.println("*pedestrian dies*");
	}
}