import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class DemoTests {

    @Test
    public void firstTest() throws InterruptedException {
        ChromeOptions opts = new ChromeOptions();
        opts.addArguments("--headless");
        WebDriver driver = new ChromeDriver(opts);


        System.out.println("testai runinas");
        driver.get("https://www.skelbiu.lt");
//        cookiesElement.click();
        WebElement cookiesElement = driver.findElement(By.id(""));
        WebElement cookiesElement1 = driver.findElement(By.className(""));
        WebElement cookiesElement2 = driver.findElement(By.tagName(""));
        WebElement cookiesElement3 = driver.findElement(By.xpath(""));
        WebElement cookiesElement4 = driver.findElement(By.name(""));
        WebElement cookiesElement5 = driver.findElement(By.cssSelector(""));

        WebElement element = driver.findElement(By.id(""));

        element.click();
        element.sendKeys("siunčiamas tekstas");
        element.getText();

        //Fiksuotas palaukimas.
        Thread.sleep(1000);
        //Laukia iki 5s, jei elementas neatsiranda meta erorą
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        //Laukia iki kol elementas atitiks specifinę sąlygą, iki 5s. po to meta erorą
        //Šiuo atveju, laukia kol elementą bus galima paspausti.
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();

        //surandame web elementą ir jį išsisaugome
        WebElement cardsContainer = driver.findElement(By.id("container"));
        //tada ieškome JAME, kitų vaikinių web elementų, ir išsisaugome Liste
        List<WebElement> cards = cardsContainer.findElements(By.className("card"));

    }
}
