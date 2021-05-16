package packOne.tests;

import org.testng.annotations.Test;

import base.BaseTest;

public class TestC extends BaseTest {

	@Test
	public void testC() throws InterruptedException
	{
		System.out.println("test C() method started");
		openBrowser("edge");
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		System.out.println("test C() method ended");
	}

}
