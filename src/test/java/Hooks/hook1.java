package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class hook1 {
	@Before
	public void beforeMethod() {
		System.out.println("Before scenario");
	}
	
	@BeforeStep
	public void BeforeEachStep() {
		System.out.println("Before each step");
	}
	
	@AfterStep
	public void AfterEachStep() {
		System.out.println("After each step");
	}
	
	@After
	public void afterMethod() {
		System.out.println("After scenario");
	}
	
	@Before("@smoke")
	public void beforeSmoke() {
		System.out.println("Before Smoke Scenario Only");
	}
	
	@After("@smoke")
	public void afterSmoke() {
		System.out.println("After Smoke Scenario Only");
	}
	
}
