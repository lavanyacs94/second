package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Launch {
	
	public static void main(String[] args) throws InterruptedException
	
	{
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lavs\\workspace\\selenium\\driver\\chromedriver.exe" );
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		WebElement from= driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		from.sendKeys("greenstechnology");
		

		WebElement Google = driver.findElement(By.xpath("//input[@value='Google Search'][1]"));
		Google.click();
		
		
		
		}
}
