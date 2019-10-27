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
    public static final String PATH_MOZ_DRIVER = "D:\\projects\\selenium\\drivers\\geckodriver.exe";
    public static final String PATH_CHROME_DRIVER = "D:\\projects\\selenium\\drivers\\chromedriver.exe";
    public static final String PATH_MSEDGE_DRIVER = "D:\\projects\\selenium\\drivers\\msedgedriver.exe";

    public FirstTest() {

        System.setProperty("webdriver.chrome.driver", FirstTest.PATH_CHROME_DRIVER);
        System.setProperty("webdriver.gecko.driver", FirstTest.PATH_MOZ_DRIVER);
        System.setProperty("webdriver.msedge.driver", FirstTest.PATH_MSEDGE_DRIVER);
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

