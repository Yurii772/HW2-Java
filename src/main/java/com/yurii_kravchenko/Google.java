package com.yurii_kravchenko;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static java.lang.Thread.sleep;

public class Google {
    WebDriver browser;
    @Test
    public  Google() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        browser=new ChromeDriver();
        browser.get ("https://www.google.com/");
        String selenide="Selenide";
        WebElement Search_field = browser.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys(Keys.valueOf(selenide));
        WebElement Search_button=browser.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]"));
        sleep(5000);
        Search_button.click();
    }

}
