import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/opt/homebrew/bin/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");
//      find and fill in autocomplete field
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));

        autocomplete.sendKeys("247 W Fayette St, Syracuse, NY");
        Thread.sleep(1000);
//      find the pac-item and click on it

        WebElement pacItem = driver.findElement(By.className("pac-item"));

        pacItem.click();
        driver.quit();
    }
}
