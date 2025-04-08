package bharat;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChild {
	public static void main(String[] args)
	{
		System.setProperty("webdrive.chrome.driver","C:\\Users\\bhara\\Downloads\\chromedriver-win64\\chromedriver");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.className("blinkingText")).click();
		Set<String> Windows=driver.getWindowHandles();
		Iterator<String> it=Windows.iterator();
		String Parent=it.next();
		String Child=it.next();
		driver.switchTo().window(Child);
		String boombaap=driver.findElement(By.linkText("mentor@rahulshettyacademy.com")).getText();
		System.out.println(boombaap);
		driver.switchTo().window(Parent);
		driver.findElement(By.id("username")).sendKeys(boombaap);
	}
	

}
