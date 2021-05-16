package packOne.tests;

import org.testng.annotations.Test;

import base.BaseTest;

public class TestA extends BaseTest {

	@Test
	public void testA() throws InterruptedException {
		System.out.println("test A() method started");
		openBrowser("chrome");
		driver.get("http://www.omayo.blogspot.com");
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		System.out.println("test A() method ended");
	}

}
