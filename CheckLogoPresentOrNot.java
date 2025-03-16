package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckLogoPresentOrNot {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement logo = driver.findElement(By.id("nav-belt"));
		boolean status = logo.isDisplayed();
		System.out.println ("Display status is:" +status);
		
		driver.close();
	}

}
