package sample.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Introduction {

	public static void main(String[] args)  throws InterruptedException {
		
WebDriver driver =new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://rahulshettyacademy.com/locatorspractice/");
driver.manage().window().maximize();
driver.findElement(By.id("inputUsername")).sendKeys("raghul");
driver.findElement(By.name("inputPassword")).sendKeys("hello123");
driver.findElement(By.className("signInBtn")).click();
System.out.println(driver.findElement(By.className("error")).getText());
driver.findElement(By.linkText("Forgot your password?")).click();
driver.findElement(By.xpath("//input['@placeholder=Name']")).sendKeys("John");
driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("john@rsa.com");
driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("john@gmail.com");
driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9864353253");
driver.findElement(By.className("reset-pwd-btn")).click();
System.out.println(driver.findElement(By.className("infoMsg")).getText());
driver.findElement(By.className("go-to-login-btn")).click();
driver.findElement(By.id("inputUsername")).sendKeys("raghul");
driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy",Keys.ENTER);
Thread.sleep(1000);
System.out.println(driver.findElement(By.className("login-container")).getText());
String text =driver.findElement(By.className("login-container")).getText();
String[] text1=text.split(",");
String[] text2= text1[1].split("Y");
String[] text3=text2[1].split(".");
String Password= text3[0];
System.out.println(Password);
driver.findElement(By.className("logout-btn")).click();





		
	}

}
