package org.n.upload;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadTwo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WeKay\\Documents\\Eclipse Path\\TestNewUpload\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	driver.quit();
	
	
	}

}
