package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.xml.ws.WebEndpoint;
import java.net.MalformedURLException;
import java.net.URL;

public class Demo {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

          System.setProperty("webdriver.chrome.driver","C:/Users/hasan.gulbaba/drivers/chromedriver.exe");

        //localde çalışan driver
        WebDriver driver = new ChromeDriver();
        WebDriver driver2 = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com.tr");
        driver.findElement(By.name("q")).sendKeys("apple");
        Thread.sleep(3000);

        driver.quit();

        driver2.manage().window().maximize();
        driver2.get("https://www.google.com.tr");
        driver2.findElement(By.name("q")).sendKeys("apple");
        Thread.sleep(3000);

        driver2.quit();

    }
}
