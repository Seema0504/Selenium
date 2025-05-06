package sample.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage {
	

	 WebDriver driver = new ChromeDriver();

     // Navigate to the login page
     driver.get("https://rahulshettyacademy.com/loginpagePractise/");
 

     // Interact with the login form
     driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
     driver.findElement(By.id("password")).sendKeys("learning");

