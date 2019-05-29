package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	
	public static void main(String[] args) 
	
	
	{
		
		System.setProperty("webdriver.chrome.driver",
				
				"C:\\Users\\Lavs\\workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		
		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys("lealih@gmail.com");
		
		WebElement txtpassword = driver.findElement(By.id("pass"));
		txtpassword.sendKeys("12345!");
		
		WebElement btnLogin = driver.findElement(By.xpath("//input[@value ='Log In']"));
		btnLogin.click();
		
	}

}
