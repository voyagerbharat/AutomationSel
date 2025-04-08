package bharat;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2E {
	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		driver.findElement(By.id("autosuggest")).sendKeys("ind");

		Thread.sleep(3000);

//		driver.findElement(By.linkText("India")).click();

		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for (WebElement option : options)

		{

			if (option.getText().equalsIgnoreCase("India"))

			{

				option.click();

				break;

			}

		}

		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropDown = new Select(staticDropdown);
		dropDown.selectByIndex(3);
		System.out.print(dropDown.getFirstSelectedOption().getTagName());
		dropDown.selectByVisibleText("USD");

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		int i = 3;
		while (i > 0) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i--;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();

		Thread.sleep(15000);
		driver.quit();

	}

}


// driver.findElement(By.xpath("//div[2]//div[3]//button[1]"))  driver.findElement(By.cssSelector("div:nth-child(2) div:nth-child(3) button:nth-child(1)"))rac

