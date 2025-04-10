package bharat;

import java.time.Duration;
import java.util.Set;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame {
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdrive.chrome.driver","C:\\Users\\bhara\\Downloads\\chromedriver-win64\\chromedriver");
		WebDriver driver=new ChromeDriver();
		FrameAss(driver);
//		driver.get("https://jqueryui.com/draggable/");
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
//		Actions a =new Actions(driver);
//		a.dragAndDropBy(driver.findElement(By.id("draggable")), 10, 40).build().perform();
	
}
	public static void FrameAss(WebDriver driver) {
		driver.get("https://the-internet.herokuapp.com/");
		String linkClick=Keys.chord(Keys.CONTROL,Keys.ENTER);
		driver.findElement(By.linkText("Nested Frames")).sendKeys(linkClick);
		Set<String> Win=driver.getWindowHandles();
		
		Iterator<String> w= Win.iterator();
		String Parent=w.next();
		String Child=w.next();
		driver.switchTo().window(Child);
		
		driver.switchTo().frame(driver.findElement(By.name("frame-top")));
		WebDriver mid=driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
		System.out.println(mid.findElement(By.id("content")).getText());
		
		
	}
}
