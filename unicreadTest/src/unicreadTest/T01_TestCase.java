package unicreadTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class T01_TestCase {

	@Test
	public void logintest() throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\School1\\Desktop\\workSpace\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://unicreds.com/contact-us");
		
		 driver.findElement(By.xpath("//input[@id='fullname']")).sendKeys("Kishor Nimase");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("kishornimase@gmail.com");
	        Thread.sleep(1000); 
	        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9158384132");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("I have apply apply a Quality Assurance job.");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//button[@id='contactButton']")).click();
		
		
		//driver.close();
	}
}
