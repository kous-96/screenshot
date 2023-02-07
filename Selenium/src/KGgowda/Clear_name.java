package KGgowda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_name 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./softwres/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/ADMIN/OneDrive/Desktop/UN.html");
	Thread.sleep(2000);
	 driver.findElement(By.name("n1")).clear();
	 }

}
