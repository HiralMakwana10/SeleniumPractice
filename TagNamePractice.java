package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNamePractice 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		
		// Open website 
		driver.get("https://demo.nopcommerce.com/");

		//open in full screen or maximize the windows 
		driver.manage().window().maximize();
		
		// Note : tag name is optional 
		
		//tag and id combination  [tag#id]
		/*
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirt");
		driver.findElement(By.cssSelector("button.search-box-button")).click();
		*/
		
		//tag and class combination [tag.class]
		//driver.findElement(By.cssSelector("input.search-box-text ")).sendKeys("T-shirt");
		
		//tag and attribute [tag[attribute="value"]]
		//driver.findElement(By.cssSelector("input[placeholder=\'Search store\']")).sendKeys("T-shirt");
		
		//tag class and attribute combination
		driver.findElement(By.cssSelector("input.search-box-text[name=\'q\']")).sendKeys("T-shirt");
		
	}
	

}
