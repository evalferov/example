package lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(
                "webdriver.chrome.driver", "src/main/resources/chromedriver/chromedriver.exe"
        );
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        Thread.sleep(5000);
        driver.quit();


        WebDriverManager.chromedriver().setup();
        WebDriver chromedriver = new ChromeDriver();
        chromedriver.get("https://ya.ru");
        chromedriver.close();
    }


}
