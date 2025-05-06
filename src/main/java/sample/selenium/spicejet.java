package sample.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class spicejet {

	public static void main(String[] args) {
	
	
	WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com");
        driver.manage().window().maximize();
       
		
		WebElement passengerDropdown = driver.findElement(By.xpath("//div[text()='Passengers']"));
	        passengerDropdown.click();
	    

	        // Increase adult count to 5 (default is 1, so click 4 more times)
	        WebElement adultPlusButton = driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']"));
	        for (int i = 0; i < 4; i++) {
	            adultPlusButton.click();
	            
	        

	        // Click on "Done" button
	        WebElement doneButton = driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']"));
	        doneButton.click();

	       
	        WebElement fromfield =driver.findElement(By.xpath("//div[text()='From']"));
	        fromfield.click();
	        WebElement selectfrom=driver.findElement(By.xpath("//div[text()='BLR']"));
	        selectfrom.click();
	       
	        WebElement senior =driver.findElement(By.xpath("//div[text()='Senior Citizen']"));
	        senior.click();
	        Assert.assertTrue(senior.isSelected());
	        
}
	}
}