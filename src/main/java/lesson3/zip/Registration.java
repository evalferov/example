package lesson3.zip;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://zip-components.ru/signup/");
        driver.findElement(By.name("data[firstname]")).sendKeys("Evgen");
        driver.findElement(By.name("data[email]")).sendKeys("gentos-army@mail.ru");
        driver.findElement(By.name("data[password]")).sendKeys("zaqwsx");
        driver.findElement(By.name("data[password_confirm]")).sendKeys("zaqwsx");
        driver.findElement(By.cssSelector(".wa-buttons-wrapper > input")).click();
        Thread.sleep(4000);
        driver.quit();
    }
}
