package HappyTrip.HappyTrip;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	WebDriver driver;
	
	
	@Test
	public void verifyMessage() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)/chromedriver.exe");

		 driver = new ChromeDriver();
		 driver.get("http://localhost:8085/happytrip/home.html");
		WebElement label1= driver.findElement(By.xpath("//*[@id=\"AirSearch\"]/fieldset[2]/table/tbody/tr/td[1]/label/span"));
		 String LabelValue=label1.getText();
	     assertEquals(LabelValue, "(any worldwide city or airport)");
			}

}
		

