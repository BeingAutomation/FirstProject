package tdd;

import org.testng.annotations.Test;

public class GroupingEx {
	
	@Test(description="This is test1",priority=2, groups="Sanity")
	public void test1(){
		System.out.println("test1");
	}
	
	@Test(description="This is test2",priority=1, dependsOnGroups="Sanity")
	public void test2(){
		System.out.println("test2");
	}
	
	@Test(description="This is test3",priority=4, groups="Sanity", timeOut=30)
	public void test3(){
		System.out.println("test3");
	}
	
	@Test(description="This is test4",priority=3, groups="Regression",enabled=false)
	public void test4(){
		System.out.println("test4");
	}
	
	@Test(description="This is test5", priority=5, groups={"Regression","Sanity"})
	public void test5(){
		System.out.println("test5");
	}
	

}
