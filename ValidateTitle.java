package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateTitle 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://opensource-demo.orangehrmlive.com/");
		
		String act_title = driver.getTitle();
		if (act_title.equals("OrangeHRM"))
		{
			System.out.println ("Passed");
		}
		else 
		{
			System.out.println ("Failed");
		}
		
		driver.close();
	}

}
