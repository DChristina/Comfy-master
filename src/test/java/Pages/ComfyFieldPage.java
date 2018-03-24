package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class ComfyFieldPage extends BaseObject {
    {
        PageFactory.initElements(driver,this);
    }
    public void openingComfyPage(){
        driver.get("https://comfy.ua");    //закоментировала для класса RegistWithPreconditions
    }
    @FindBy(xpath ="//a[@class='ask-city__refuse js-ask-block']")
    public WebElement chooseCity;

    public void chooseYourCity(){
        chooseCity.click();
    }
    @FindBy(xpath = "//a[@data-city-id='641']")
    public WebElement odessaCity;

    public void chooseOdessa(){
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        odessaCity.click();
    }
    @FindBy(xpath = "//input[@id='searchTop']")
    public WebElement searchField;

    public void searchFredge(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(searchField));
        searchField.click();
        searchField.sendKeys("Холодильник");
    }
    @FindBy(xpath = "//button[@id='searchButtonTop']")
    public WebElement searchButton;
    @FindBy(xpath = "//h1[@class='category-info__name category-info__item']")
    public WebElement titleSearchResult;

    public WebElement checkElemtName (String City){
        return driver.findElement(By.xpath("//li[@class='cities__item cities__item_main']//*[text()='"+City+"']"));
    }

    public WebElement checkRefName(String Refrigerator){
        return driver.findElement(By.xpath("//a[@title='"+Refrigerator+"']"));
    }

}
