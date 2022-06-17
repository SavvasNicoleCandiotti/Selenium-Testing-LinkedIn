import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/opt/homebrew/bin/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dragdrop");

        WebElement image = driver.findElement(By.id("image"));

        WebElement box = driver.findElement(By.id("box"));

//        new instance of actions class
        Actions actions = new Actions(driver);

//        use new actions object to call dragndrop - takes two arguments (image and box),
//        then build, then perform to execute action
        actions.dragAndDrop(image,box).build().perform();
        Thread.sleep(1000);
        driver.quit();

    }
}

