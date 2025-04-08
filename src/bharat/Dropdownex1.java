package bharat;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Dropdownex1 {
	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		driver.findElement(By.id("autosuggest")).sendKeys("ind");

		Thread.sleep(3000);

		driver.findElement(By.linkText("India")).click();

//		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
//
//
//		for(WebElement option :options)
//
//		{
//
//		if(option.getText().equalsIgnoreCase("India"))
//
//		{
//
//		option.click();
//
//		break;
//
//
//		}
//
//		}
//
//
//
	}

}
