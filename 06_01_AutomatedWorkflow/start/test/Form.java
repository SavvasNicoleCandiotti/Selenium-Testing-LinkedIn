import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/opt/homebrew/bin/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

//        First name
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Nicole");
//        Last name
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Smith");
//        Job title
        WebElement jobTitle = driver.findElement(By.id("job-title"));
        jobTitle.sendKeys("Web Developer");

        Thread.sleep(1000);

//        Radio buttons
        WebElement radioButton = driver.findElement(By.id("radio-button-1"));
        radioButton.click();
        Thread.sleep(1000);

//        Check Box
        WebElement checkBox = driver.findElement(By.id("checkbox-2"));
        checkBox.click();
        Thread.sleep(1000);
//        Dropdown
        WebElement dropDown = driver.findElement(By.id("select-menu"));
        dropDown.click();
        Thread.sleep(1000);

//        Dropdown choice
        WebElement firstChoice = driver.findElement(By.cssSelector("option[value='1']"));
        firstChoice.click();
        Thread.sleep(1000);
//        Datepicker
        WebElement date = driver.findElement(By.id("datepicker"));
        date.sendKeys("01/01/2050");
        Thread.sleep(1000);

//        Submit button
        WebElement submitButton = driver.findElement(By.className("btn"));
        submitButton.click();
        Thread.sleep(1000);



        driver.quit();
    }
}
