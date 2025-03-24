package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkSize {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> Link = driver.findElements(By.tagName("a")); //using tag name
		System.out.println (Link.size());
		
		driver.close();
	}

}
