package bharat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String []args) throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("eww");
		driver.findElement(By.id("confirmbtn")).click();
		System.out.print(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(10000);
		driver.quit();
		}

}
