package com.two;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.one.Base;

public class RegTest extends Base {

	public static void main(String[] args) throws InterruptedException {
		launchChrome();
		homepage();
		openRegPage();
		TC_01_loginTest_valid();
		TC_01_loginTest_Invalid();
		CloseChrome();
		
	}
	
	protected static String getSaltString(){
		String SALTCHARS="abcde123456";
		StringBuilder salt= new StringBuilder();
		Random rnd=new Random();
		
		while(salt.length()<7)
		{
			int index= (int) (rnd.nextFloat()*SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr=salt.toString();
		return saltStr;	
		
	}
	
	public static void openRegPage() throws InterruptedException {
	
		WebElement MyAccount = driver.findElement(By.cssSelector("#top-links > ul > li.dropdown > a > span.hidden-xs.hidden-sm.hidden-md"));
		MyAccount.click();
		Thread.sleep(4000);
		
		WebElement Reg = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a"));
		Reg.click();
		Thread.sleep(4000);
	}
	
	public static void TC_01_loginTest_valid() throws InterruptedException {
		WebElement Fristname=driver.findElement(By.id("input-firstname"));
		WebElement Lastname=driver.findElement(By.id("input-lastname"));
		WebElement Email=driver.findElement(By.id("input-email"));
		WebElement Telephone=driver.findElement(By.id("input-telephone"));
		WebElement Inputpas=driver.findElement(By.id("input-password"));
		WebElement Pass2=driver.findElement(By.id("input-confirm"));
		WebElement radio1= driver.findElement(By.cssSelector("#content > form > fieldset:nth-child(3) > div > div > label:nth-child(1)"));
		WebElement radio2= driver.findElement(By.cssSelector("#content > form > fieldset:nth-child(3) > div > div > label:nth-child(2)"));
		WebElement batton1=driver.findElement(By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)"));
		WebElement Btn=driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));		
		
		Fristname.clear();
		Fristname.sendKeys("Somaya");
		Thread.sleep(2000);
		Lastname.clear();
		Lastname.sendKeys("prottasha");
		Thread.sleep(2000);
		Email.clear();
		Email.sendKeys(getSaltString()+"@gmail.com");
		Thread.sleep(2000);
		Telephone.clear();
		Telephone.sendKeys("01670707707");
		Thread.sleep(2000);
		Inputpas.clear();
		Inputpas.sendKeys("admin123");
		Thread.sleep(2000);
		Pass2.clear();
		Pass2.sendKeys("admin123");
		Thread.sleep(2000);
		radio1.click();
		batton1.click();
		Btn.click();	
		Thread.sleep(7000);
			
	}
	public static void TC_01_loginTest_Invalid() throws InterruptedException {
		WebElement Fristname=driver.findElement(By.id("input-firstname"));
		WebElement Lastname=driver.findElement(By.id("input-lastname"));
		WebElement Email=driver.findElement(By.id("input-email"));
		WebElement Telephone=driver.findElement(By.id("input-telephone"));
		WebElement Inputpas=driver.findElement(By.id("input-password"));
		WebElement Pass2=driver.findElement(By.id("input-confirm"));
		WebElement radio1= driver.findElement(By.cssSelector("#content > form > fieldset:nth-child(3) > div > div > label:nth-child(1)"));
		WebElement Radi2= driver.findElement(By.cssSelector("#content > form > fieldset:nth-child(3) > div > div > label:nth-child(2)"));
		WebElement batton1=driver.findElement(By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)"));
		WebElement Btn=driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));		
		
		Fristname.clear();
		Fristname.sendKeys("Somaya");
		Thread.sleep(2000);
		Lastname.clear();
		Lastname.sendKeys("prottasha");
		Thread.sleep(2000);
		Email.clear();
		Email.sendKeys("prottasha@mailcom");
		Thread.sleep(2000);
		Telephone.clear();
		Telephone.sendKeys("0170707707");
		Thread.sleep(2000);
		Inputpas.clear();
		Inputpas.sendKeys("admin123");
		Thread.sleep(2000);
		Pass2.clear();
		Pass2.sendKeys("admin123");
		Thread.sleep(2000);
		radio1.click();
		batton1.click();
		Btn.click();	
		Thread.sleep(7000);
			
	}

}
