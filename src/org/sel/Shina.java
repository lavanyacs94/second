package org.sel;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;


public class Shina 

{
	public static void main(String[] args ) 
	
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lavs\\workspace\\selenium\\driver\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement btn=driver.findElement(By.name("proceed"));
		btn.click();
		Alert a = driver.switchTo().alert();
		a.accept();

}
}