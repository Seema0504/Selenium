package sample.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class radiobuttons {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get ("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();

		WebElement option1=driver.findElement(By.id("checkBoxOption1"));




		Assert.assertFalse(option1.isSelected(), "Option is not selected!");

		
	
	}
}
