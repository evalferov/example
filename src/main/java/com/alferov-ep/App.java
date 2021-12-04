package com.alferovep;


import org.openqa.selenium.chrome.ChromeDriver;

public class App
{
    public static void main(String[] args) {
        System.setProperty(
                "webdriver.chrome.driver", "src/main/resources/chromedriver/chromedriver.exe"
        );
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
    }


}
