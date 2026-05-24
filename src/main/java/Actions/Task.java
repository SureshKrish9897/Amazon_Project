package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://corp.rakuten.co.in/");
		
		Actions a = new Actions(driver);
		WebElement btn = driver.findElement(By.xpath("(//a[text()='Our Culture'])[1]"));
		a.moveToElement(btn).perform();	
		WebElement btn1 = driver.findElement(By.xpath("(//a[text()='Awards & Recognition'])[1]"));	
		a.moveToElement(btn1).perform();
		btn1.click();
	}
}
