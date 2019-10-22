import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirstTest {
    private WebDriver driver;
    public static final String PATH_CHROME_DRIVER = "C:\\ChromeDriver\\chromedriver.exe";

    public FirstTest() {
        System.setProperty("webdriver.chrome.driver", FirstTest.PATH_CHROME_DRIVER);
    }

    @Before
    public void openBrowser() {

        //DesiredCapabilities caps = new DesiredCapabilities();
       // caps.setCapability("unexpectedAlertBehaviour", "accept");

        ChromeOptions ch = new ChromeOptions();
        ch.addArguments("start-maximized");

        driver = new ChromeDriver(ch);
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

    @Test
    public void googleTest() {
        driver.get("http://google.com");
        System.out.println(((HasCapabilities) driver).getCapabilities());
    }

    @Test
    public void ukrNetTest() {

        driver.get("http://ukr.net");

        System.out.println(((HasCapabilities) driver).getCapabilities());
    }

}

