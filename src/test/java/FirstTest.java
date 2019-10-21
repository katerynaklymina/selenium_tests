import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    private WebDriver driver;
    public static final String PATH_CHROME_DRIVER = "C:\\ChromeDriver\\chromedriver.exe";

    public FirstTest() {
        System.setProperty("webdriver.chrome.driver", FirstTest.PATH_CHROME_DRIVER);
    }

    @Before
    public void openBrowser() {
        driver = new ChromeDriver();
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

    @Test
    public void googleTest() {
        driver.get("http://google.com");
    }

    @Test
    public void ukrNetTest() {
        driver.get("http://ukr.net");
    }
}

