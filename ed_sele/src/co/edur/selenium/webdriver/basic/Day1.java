package co.edur.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class Day1 {

	WebDriver driver;
	
	
	public void invokeBrowser() {
		
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\Soft\\IDE\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("https://www.edureka.co");
			searchCourse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void searchCourse() {
		
		try {
			driver.findElement(By.id("homeSearchBar")).sendKeys("Java");
			//Thread.sleep(3000);
			driver.findElement(By.id("homeSearchBarIcon")).click();
			/*jse = (JavaScriptExecutor).driver;
			jse = executeScript("scroll(0, 800)");*/
			
			//driver.findElement(By.xpath("//lebel[contains(text(), 'Weekend')]")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day1 myObj = new Day1();
		myObj.invokeBrowser();
	}

}
