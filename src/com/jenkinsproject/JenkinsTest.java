package com.jenkinsproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JenkinsTest
{

	@Test
	public void test()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		
	}
	
}
