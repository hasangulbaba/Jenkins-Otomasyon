package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import javax.xml.ws.WebEndpoint;
import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGridDemo {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

      //  System.setProperty("webdriver.chrome.driver","C:/Users/hasan.gulbaba/drivers/chromedriver.exe");

        //localde çalışan driver
       // WebDriver driver = new ChromeDriver();
        //------------------------------------------------------------------------------------------------------


        //http://192.168.1.116:4444
        //http://192.168.1.116  ->> hub bu ip de initilize ediliyor(başlatılıyor)
        //4444 ->> port number

        //göndereceğin test grid de hangi ortamda nerede çalışsın desired capabilitiesleri belirle
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("chrome");

        //remote 2 obje alır , birincisi grid hub ın url(ip) bilgisi ,
        WebDriver remoteWebDriver = new RemoteWebDriver(new URL("http://192.168.1.116:4444"),caps);

        remoteWebDriver.manage().window().maximize();
        remoteWebDriver.get("https://www.google.com.tr");
        remoteWebDriver.findElement(By.name("q")).sendKeys("apple");
        Thread.sleep(3000);

        remoteWebDriver.quit();

        //--------------------------------------------------------------------------------------------------
        WebDriver remoteWebDriver2 = new RemoteWebDriver(new URL("http://192.168.1.116:4444"),caps);

        remoteWebDriver2.manage().window().maximize();
        remoteWebDriver2.get("https://www.google.com.tr");
        remoteWebDriver2.findElement(By.name("q")).sendKeys("apple");
        Thread.sleep(3000);

        remoteWebDriver2.quit();



    }
}
