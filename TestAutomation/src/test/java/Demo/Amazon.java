package Demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Amazon {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
 
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
		driver.findElement(By.name("field-keywords")).sendKeys("Lipstick");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.close();
		
		
	

	}

}
