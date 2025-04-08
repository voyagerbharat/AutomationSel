package bharat;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class VegtalbleCommerece {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));
		String[] veggies = { "Cucumber", "Brocolli", "Beetroot" };
		List<String> veg = Arrays.asList(veggies);

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		addItems(driver,veg);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();

		//explicit wait



		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));



		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());




		

	}
	public static void addItems(WebDriver driver,List<String> veg) {
		List<WebElement> Vegetables = driver.findElements(By.cssSelector("h4.product-name"));
		int j = 0;
		for (int i = 0; i < Vegetables.size(); i++)

		{
			String name = Vegetables.get(i).getText().split("-")[0].trim();

			if (veg.contains(name)) {
				System.out.println(name);
				driver.findElements(By.cssSelector("div.product-action")).get(i).click();
				j++;
			}
			if (j == veg.size()) {
				break;
			}

		}
		
	}

}
