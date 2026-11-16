package Demo;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;



public class LaunchingBrowser {
	
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
	
	

WebDriver driver=new ChromeDriver();
//driver.get("https://www.amazon.in/");

		
//	WebDriver driver=new SafariDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(1000);
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		Thread.sleep(2000);
		 driver.findElement(By.id("login-button")).click();
//		@Nullable
//		String Url = driver.getCurrentUrl();
//		System.out.println(Url);
//		
//		@Nullable
//		String pages = driver.getPageSource();
//		System.out.println(pages);
//		
//		Thread.sleep(1000);
//driver.navigate().back();
//
//Thread.sleep(1000);
//driver.navigate().forward();
//
//Thread.sleep(1000);
//driver.navigate().refresh();
//
//driver.close();
	
		
//driver.close();
	
	}
	

}

