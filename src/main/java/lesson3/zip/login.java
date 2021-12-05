package lesson3.zip;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://zip-components.ru/login/");
        driver.findElement(By.name("login")).sendKeys("gentos-army@mail.ru");
        driver.findElement(By.name("password")).sendKeys("zaqwsx");
        driver.findElement(By.xpath("//label/span")).click();
        driver.findElement(By.xpath("//input[@value='Войти']")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
