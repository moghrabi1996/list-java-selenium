import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firsttest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\newWebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://127.0.0.1:5500/firstindex.html");

		String myTitle = driver.getTitle();
		System.out.println(myTitle);

		List<WebElement> myListOfLinks = driver.findElements(By.name("links"));

		for (int i = 0; i < myListOfLinks.size(); i++) {

			System.out.println(myListOfLinks.get(i).getAttribute("value"));
			System.out.println(myListOfLinks.get(i).getText());

		}

	}
}
