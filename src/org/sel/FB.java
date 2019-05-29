package org.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB {
	public static void main(String[] args)
	{
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Lavs\\workspace\\selenium\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
}
}
