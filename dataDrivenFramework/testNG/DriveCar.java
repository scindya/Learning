package testNG;

import org.testng.annotations.Test;

public class DriveCar {
	
	
	@Test(priority=0)
	public void startCar() {
		
		System.out.println("Starting a car");
	}
	@Test(priority=1)
	public void putFirstGear() {
		
		System.out.println("Apply first gear");
	}
	@Test(priority=2)
	public void putSecondGear() {
		
		System.out.println("Apply second gear");
	}
	
	@Test(priority=3)
	public void putThirdGear() {
		
		System.out.println("Apply third gear");
	}
	
	@Test(priority=4)
	public void putFourthGear() {
		
		System.out.println("Apply fourth gear");
	}
	
	@Test(priority = 5)
	public void turnMusic() {
		System.out.println("Switch on a music");
	}
}
