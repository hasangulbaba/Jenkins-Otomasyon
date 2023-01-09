package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestNgGridDemo extends TestRunner{


    @Test
    public void gridTestNgDemo() throws InterruptedException, MalformedURLException {
        System.out.println("---------------test1 started-------------");

        remoteDriver.get("https://test.arabam.com/");
        remoteDriver.manage().window().maximize();
        Thread.sleep(3000);
        remoteDriver.findElement(By.cssSelector("[class='input']")).sendKeys("Audi");
        Thread.sleep(2000);
        remoteDriver.findElement(By.cssSelector("[class='search-button']")).click();
        Thread.sleep(2000);


        System.out.println("---------------test1 ended-------------");
    }

    @Test
    public void gridTestNgArabam() throws InterruptedException, MalformedURLException {
        System.out.println("---------------test2 started-------------");

        remoteDriver.get("https://test.arabam.com/");
        remoteDriver.manage().window().maximize();
        Thread.sleep(3000);
        remoteDriver.findElement(By.cssSelector("[class='input']")).sendKeys("Audi");
        Thread.sleep(2000);
        remoteDriver.findElement(By.cssSelector("[class='search-button']")).click();
        Thread.sleep(2000);


        System.out.println("---------------test2 ended-------------");
    }

}
