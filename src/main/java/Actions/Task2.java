package Actions;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {

	public static void main(String[] args) {
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bwana.in/ecommerce-management.php");
		Actions e = new Actions(driver);

		WebElement btn = driver.findElement(By.xpath("(//a[text()='Web Development'])[1]"));
		e.moveToElement(btn).perform();
		btn.click();
		
//		WebElement btn1 = driver.findElement(By.xpath("(//a[text()='Web Development'])[1]"));
//		e.moveToElement(btn1).perform();
//		btn1.click();
//		
//		
//		
		
		
	}
}
