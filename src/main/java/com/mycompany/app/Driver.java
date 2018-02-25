package com.mycompany.app;

import org.aspectj.lang.annotation.AfterReturning;

public class Driver {

	public void goToWork() {
		System.out.println("Going to work!");
		return;
	}
	
	@AfterReturning("goToWork()")
	public void eh() {
		System.out.println("eh");
	}
}
