package tdd;

import org.testng.annotations.Test;

public class DependsOnMethodEx {
	
	
	
	@Test(priority=1, dependsOnMethods="login")
	public void Sanity(){
		System.out.println("Sanity");
	}
	
	@Test(priority=2, dependsOnMethods="launchBrowser")
	public void login(){
		System.out.println("login");
	}
	
	@Test(priority=3)
	public void launchBrowser(){
		System.out.println("launchBrowser");
	}

}
