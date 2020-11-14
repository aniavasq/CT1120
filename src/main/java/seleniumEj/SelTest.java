package seleniumEj;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelTest {

	public static void main(String[] args) {
		System.out.println("Test");
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "drivers" + File.separator; // Setting path of the driver
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver"); // Identifying the driver executable
		WebDriver driver = new ChromeDriver(); // Execution time creation of Chrome driver
		driver.get("https://www.cooltesters.com/tienda-de-cursos/selenium-con-java"); // Opening Chrome with specified URL
	}

}
