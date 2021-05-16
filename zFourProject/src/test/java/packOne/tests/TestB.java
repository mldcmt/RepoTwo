package packOne.tests;

import org.testng.annotations.Test;

import base.BaseTest;

public class TestB extends BaseTest {

	@Test
	public void testB() throws InterruptedException
	{
		System.out.println("test B() method started");
		openBrowser("firefox");
		driver.get("http://www.tutorialsninja.com/demo");
		System.out.println(driver.getTitle());
		
		Thread.sleep(7000);
		System.out.println("test C() method ended");
	}

}
