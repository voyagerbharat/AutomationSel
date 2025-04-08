package bharat;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class dropdownStatic {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropDown=new Select(staticDropdown);
		dropDown.selectByIndex(3);
		System.out.print(dropDown.getFirstSelectedOption().getTagName());
		dropDown.selectByVisibleText("AED");
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		int i=3;
		while(i>0)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i--;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		Thread.sleep(15000);
		driver.quit();
	}

}
