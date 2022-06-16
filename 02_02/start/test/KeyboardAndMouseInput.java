import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/opt/homebrew/bin/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");
//        finds element on page
        WebElement name = driver.findElement(By.id("name"));
//        clicks on field
        name.click();
//        enters this string into  the field
        name.sendKeys( "Nicole C");
//        find and click button
        WebElement button = driver.findElement(By.id("button"));
        button.click();


        driver.quit();
    }
}
