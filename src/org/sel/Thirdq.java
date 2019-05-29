

	
	package org.sel;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Thirdq 

	{

		
	public static void main(String[] args) 
		
		
		{
			
			System.setProperty("webdriver.chrome.driver",
					
					"C:\\Users\\Lavs\\workspace\\selenium\\driver\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.redbus.in/");
			
			WebElement suggestion = driver.findElement(By.xpath("//input[@type='text']"));
			suggestion.sendKeys("chennai");
			
			
			
			
			}

	}






