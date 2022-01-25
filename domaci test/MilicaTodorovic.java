import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MilicaTodorovic {

    WebDriver driver;

    @FindBy(xpath = "//body/div[@id='root']/div[@id='app']/div[@id='content']/div[1]/div[2]/div[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/button[1]")
    WebElement proizvodi;
    @FindBy(xpath = "//body/div[@id='root']/div[@id='app']/div[@id='content']/div[1]/div[2]/div[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")
    WebElement racunari;
    @FindBy(xpath = "//a[contains(text(),'Gigatron računari')]")
    WebElement gigaRacunari;
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/span[1]")
    WebElement gaming;
    @FindBy(xpath = "//option[contains(text(),'Nazivu A-Z')]")
    WebElement naziv;
    @FindBy(xpath = "//span[@id='compare-413527']")
    WebElement uporedi1;
    @FindBy(xpath = "//span[@id='compare-413512']")
    WebElement uporedi2;
    @FindBy(xpath = "//body/div[@id='root']/div[@id='app']/div[@id='content']/div[@id='app-container']/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/span[1]/div[1]/div[3]/a[1]")
    WebElement milicaTodorovic;

    public MilicaTodorovic(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void milicaTodorovic() throws InterruptedException{
        proizvodi.click();
        racunari.click();
        gigaRacunari.click();
        gaming.click();
        naziv.click();
        Thread.sleep(2000);
        uporedi1.click();
        uporedi2.click();
        milicaTodorovic.click();
    }
}
