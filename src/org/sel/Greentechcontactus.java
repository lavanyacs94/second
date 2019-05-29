package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greentechcontactus {
	
	
public static void main(String[] args) 
	
	
	{
		
		System.setProperty("webdriver.chrome.driver",
				
				"C:\\Users\\Lavs\\workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		
		WebElement contactus = driver.findElement(By.xpath("//a[@href='contact.php']"));
		contactus.click();
		
		WebElement txtname = driver.findElement(By.xpath("//input[@type='text'][1]"));
		txtname.sendKeys("lea");
		
		WebElement txtemail = driver.findElement(By.xpath("//input[@type='email'][1]"));
		txtemail.sendKeys("lea@gmail.com");
		
		WebElement txtmobilenumber = driver.findElement(By.xpath("//input[@name='phone'][1]"));
		txtmobilenumber.sendKeys("123456");
		
		
		
		
		
		
		
		
}

}



