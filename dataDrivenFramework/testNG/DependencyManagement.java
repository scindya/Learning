package testNG;

import org.testng.annotations.Test;

public class DependencyManagement {
	
	@Test
	public void school() {
		
		System.out.println("School days");
	}
	
	@Test(dependsOnMethods = "school")
	public void higherSecondary() {
		
		System.out.println("Higher secondary school");
	}
	
	@Test(dependsOnMethods = "higherSecondary")
	public void Engineering() {
		
		System.out.println("Engineering days");
		
	}

}
