package bharat;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAmazon {

	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdrive.chrome.driver","C:\\Users\\bhara\\Downloads\\chromedriver-win64\\chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.amazon.com/");
		Actions a=new Actions(driver);
		WebElement el = driver.findElement(By.cssSelector("button.a-button-text"));
		a.moveToElement(driver.findElement(By.id("captchacharacters"))).click().keyDown(Keys.SHIFT).sendKeys("boom baap chill lofi").doubleClick().build().perform();
		a.moveToElement(el).build().perform();
		
		Thread.sleep(5000);
		driver.quit();
		}
}
