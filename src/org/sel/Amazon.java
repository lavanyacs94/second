
package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon

{
	public static void main(String[] args )throws InterruptedException  
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lavs\\workspace\\selenium\\driver\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.amazon.in");
		
		WebElement btnnext1= driver.findElement(By.xpath("//span[@class='nav-icon nav-arrow'][1]"));
		Actions acc= new Actions(driver);
		acc.moveToElement(btnnext1).perform();
		WebElement btnBigData= driver.findElement(By.xpath("//span[@aria-label='Mobiles, Computers']"));
		btnBigData.click();
		
	
	}
}
