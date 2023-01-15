package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class TestRunner {

    //TestNg annotionlarını burada kullanıyoruuuzz :))
    /*
    BeferoScenario --- her senaryodan önce -->gaugeye özel

    AfterScenario --- driver.quitleri ekle

    BeforeStep --- her stepten önce

    AfterStep --- her stepten sonra

    BeforeSuite ---

    AfterSuite
    */

    public static WebDriver remoteDriver ;

    public static void beforeeTest() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("chrome");

        remoteDriver = new RemoteWebDriver(new URL("http://192.168.1.116:4444"),caps);
    }

    @BeforeTest //burasını bele yapınca null pointer veriyor testte napmam lazım ??
    public void beforeScenario() throws MalformedURLException, InterruptedException {

        TestNgGridDemo.beforeeTest();

    }


}
