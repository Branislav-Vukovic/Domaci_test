import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class GigaChad {

    private WebDriver driver;

    @BeforeClass
    public void starto() throws IOException {
            System.setProperty("webdriver.chrome.driver",
                    PropReader.fetchProperty("WEBDRIVER.CHROME.PATH"));

            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

    }

    @AfterClass
    public void endo() throws IOException {
        driver.close();
        Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
    }

    @Test
    public void uporediMe() throws InterruptedException {
        driver.get("https://gigatron.rs");
        driver.manage().window().maximize();

        MilicaTodorovic uporedi = new MilicaTodorovic(driver);
        uporedi.milicaTodorovic();

        System.out.println("Provera da li su oba racunara za poredjenje prisutna...");
        Assert.assertTrue(driver.getPageSource().contains("GIGATRON PRIME GAMING FORMULA"));
        System.out.println("Prvi racunar - prisutan!");
        Assert.assertTrue(driver.getPageSource().contains("GIGATRON PRIME 5000D FORMULA"));
        System.out.println("Drugi racunar - prisutan!");
    }
}
