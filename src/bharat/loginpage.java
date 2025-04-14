package bharat;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginpage {
	public static void main(String[] args) {
		System.setProperty("webdrive.chrome.driver", "C:\\Users\\bhara\\Downloads\\chromedriver-win64\\chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated((By.id("okayBtn"))));
		driver.findElement(By.id("okayBtn")).click();
		WebElement Dd = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select s = new Select(Dd);
		s.selectByValue("consult");
		w.until(ExpectedConditions.visibilityOfElementLocated(((By.id("signInBtn")))));
		

		driver.findElement(By.id("signInBtn")).click();

	}

}
