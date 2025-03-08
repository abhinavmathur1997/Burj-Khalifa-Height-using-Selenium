package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BurjKhalifaHeightVerification {
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\git\\SeleniumJavaFramework1\\SeleniumJavaFramework\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
WebElement burjKhalifaRow = driver.findElement(By.xpath("//tr[contains(.,'Burj Khalifa')]"));
String burjKhalifaHeight = burjKhalifaRow.findElement(By.xpath(".//td[3]")).getText();


assert burjKhalifaHeight.equals("829m");


driver.quit();
}
}
