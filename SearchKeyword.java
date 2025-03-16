package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchKeyword {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//search keyword
		//driver.findElement(By.name("field-keywords")).sendKeys("Laptop");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
		
		driver.close();
	}

}
