package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumClass {
	
	public static void main(String[] args) throws InterruptedException {
		//To create class, methods using key and value
		System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumDoc\\Drive\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();// To create object for interface, Webdriver means interface, driver means object, EdgeDriver means class
		driver.get("https://www.facebook.com/"); // To Launch browser url
		Thread.sleep(3000);
		driver.manage().window().maximize(); //To maximize the browser page
		Thread.sleep(3000);
		WebElement a= driver.findElement(By.id("email"));
		a.sendKeys("balajib4302@gmail.com");
		
		WebElement b= driver.findElement(By.name("pass"));
		b.sendKeys("Bala@1984");
		
		WebElement c= driver.findElement(By.partialLinkText("Forgotten"));
		c.click();
		
		//To Quit or close the browser
		//driver.close();// Close the particular tab
		//driver.quit(); // Close the entire browser
		
	}

}
