package com.one;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	
	public static void launchChrome() {
	
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	public static void CloseChrome() {
		
		driver.close();
	}
	public static void homepage() {
		driver.get("https://demo.opencart.com/");
	}
	

}
