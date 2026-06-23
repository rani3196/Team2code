package basics.programs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart_1 {

	public static void main(String[] args) throws InterruptedException {
		//(//input[@name='q'])[1]
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
	WebElement e1 = 	driver.findElement(By.xpath("(//input[@name='q'])[1]"));
	
	e1.sendKeys("Shoes");
	Thread.sleep(2000);
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul/li")));

	List <WebElement>  list =driver.findElements(By.xpath("//ul/li"));

	System.out.println(list.get(4).getText());
	

	
	

	
		
		
		

	}

}
