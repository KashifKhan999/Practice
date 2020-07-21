package website;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Sample {
static WebDriver driver;
String tit;
	@BeforeMethod
		public void setUp() {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void example1()
	{
		tit=driver.getTitle();
		Assert.assertEquals("Google",tit );
		System.out.println("Answer from first class 2: "+tit);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
