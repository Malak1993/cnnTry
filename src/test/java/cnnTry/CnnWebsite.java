package cnnTry;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CnnWebsite {
	WebDriver driver;
	
	@Before
	public void luanchbrowser() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.get("https://www.cnn.com/");
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	public void TestOne() {
		WebElement NAME_ELEMENT=driver.findElement(By.xpath("//div[@class='stack_condensed']/descendant::div[15]"));
		driver.findElement(By.xpath("//div[@class='stack_condensed']/descendant::div[15]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@data-uri='cms.cnn.com/_components/card/instances/clgnnuhy5003r3b6dlj20ukqa@published']/descendant::a[2]")).click();
		
	}
}
