package bharat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackForward {
public static void main(String[] args) throws InterruptedException {
		


		System.setProperty("webdrive.chrome.driver","C:\\Users\\bhara\\Downloads\\chromedriver-win64\\chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.get("https://www.instagram.com/");
		driver.navigate().back();		

}

}