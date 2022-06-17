import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/opt/homebrew/bin/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");
//button one - id
        WebElement radioButtonOne = driver.findElement(By.id("radio-button-1"));
        radioButtonOne.click();
Thread.sleep(1000);
//button two - css selector
        WebElement radioButtonTwo = driver.findElement(By.cssSelector("input[value='option2']"));
        radioButtonTwo.click();

        Thread.sleep(1000);

//        button three - xpath
        WebElement radioButtonThree = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radioButtonThree.click();

        driver.quit();
    }
}
