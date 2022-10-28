package org.sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumDoc\\Drive\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement create= driver.findElement(By.xpath("//a[text()='Create New Account']"));
		create.click();
		WebElement Firstname= driver.findElement(By.xpath("//input[@name='firstname']"));
		Firstname.sendKeys("Neha");
		WebElement Surname= driver.findElement(By.xpath("//input[@name='lastname']"));
		Surname.sendKeys("Aarudhra");
		WebElement email= driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.sendKeys("nehaaarudhra161120@gmail.com");
		WebElement emailconfirmation= driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		emailconfirmation.sendKeys("nehaaarudhra161120@gmail.com");
		WebElement pass= driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		pass.sendKeys("BKneha2020");
		WebElement day= driver.findElement(By.xpath("//select[@id='day']"));
		Select d= new Select(day);
		boolean multi=d.isMultiple();
		System.out.println(multi);
		d.selectByIndex(15);
		System.out.println(16);
		WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
		Select m= new Select(month);
		m.selectByValue("11");
		System.out.println(11);
		WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
		Select y= new Select(year);
		y.selectByVisibleText("2020");
		System.out.println(2020);
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		System.out.println("Female");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(4000);
		driver.close();
	}
}
		