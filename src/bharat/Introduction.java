package bharat;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Introduction {

	public static void main(String[] args)
	{
		System.setProperty("webdrive.chrome.driver","C:\\Users\\bhara\\Downloads\\chromedriver-win64\\chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		System.out.print(driver.getCurrentUrl());
		driver.close();
;	
	}
	
}
