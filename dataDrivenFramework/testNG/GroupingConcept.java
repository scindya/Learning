package testNG;

import org.testng.annotations.Test;

public class GroupingConcept {
	
	
	@Test(groups = "mobile")
	public void appleMobile() {
		
		System.out.println("Apple brand phone");
	}
	
	@Test(groups = "mobile")
	public void samsungMobile() {
		System.out.println("samsung brand phone");
	}
	
	@Test(groups = "laptop")
	public void hpLaptop() {
		System.out.println("hp brand laptop");
	}
	
	@Test(groups = "laptop")
	public void dellLaptop() {
		System.out.println("dell brand laptop");
	}
	
	@Test(groups = "laptop")
	public void acerlaptop() {
		System.out.println("xyz");
	}

	@Test(groups = "course")
	public void selenium() {
		System.out.println("Web application Automation");
	}
	
	@Test(groups = "course")
	public void appium() {
		System.out.println("mobile application Automation");
	}
}
