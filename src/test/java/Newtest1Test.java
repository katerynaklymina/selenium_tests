// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;


public class Newtest1Test {
  private WebDriver driver;
  private JavascriptExecutor js;


  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
  }


  @After
  public void tearDown() {

      driver.quit();
  }


  @Test
  public void newtest1() {
    driver.get("https://expletiveami.wordpress.com/");
    assertThat(driver.findElement(By.linkText("expletiveami")).getText(), is("expletiveami"));
    driver.findElement(By.linkText("About")).click();
    js.executeScript("window.scrollTo(0,913)");
    driver.close();
  }
}