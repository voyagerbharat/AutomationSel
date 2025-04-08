package bharat;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		


		System.setProperty("webdrive.chrome.driver","C:\\Users\\bhara\\Downloads\\chromedriver-win64\\chromedriver");
		WebDriver driver=new ChromeDriver();

		String name="Bharat";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String Password=getPassword(driver);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);

		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(Password);

		driver.findElement(By.id("chkboxOne")).click();

		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(),"Hello "+name+",");
driver.quit()	;
}
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();

		Thread.sleep(1000);//
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

		String Password=driver.findElement(By.cssSelector("form p")).getText();
		String[] passwordArray=Password.split("'");
		String finalPassword=passwordArray[1].split("'")[0];
		System.out.print("run");
		return finalPassword;
		
	}
}
