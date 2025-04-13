package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectFirstThreeCheckboxes 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		//select first 3 check boxes 
		for (int i=0;i<3;i++)
		{
			checkboxes.get(i).click();
		}
	}
}
