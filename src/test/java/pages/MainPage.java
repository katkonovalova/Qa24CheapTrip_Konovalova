package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageBase{

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "slogan")
    WebElement slogan;
    @FindBy(css = ".mat-button-wrapper .material-icons")
    WebElement homeButton;
    @FindBy(css = "#mat-input-0")
    WebElement fromField;
    @FindBy(css = "#mat-input-1")
    WebElement toField;
    @FindBy( xpath = "/html[1]/body[1]/app-root[1]/app-trip-direction[1]/app-select-direction[1]/div[1]/form[1]/div[2]/button[2]")
    WebElement letsGo;
    @FindBy( xpath = "//span[contains(text(),\"Let's go\")]")
    WebElement searchResults;
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/mat-option[2]/span[1]")
    WebElement dropdownFromField;
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/mat-option[1]/span[1]")
    WebElement dropdownToField;
    @FindBy(xpath = "//span[contains(text(),'Clear form')]")
    WebElement clearForm;
    @FindBy(xpath = "//body/app-root[1]/app-trip-direction[1]/app-select-direction[1]/div[1]/form[1]/div[1]/section[1]/div[1]/span[1]")
    WebElement removeStartPoint;
    @FindBy(xpath = "//body/app-root[1]/app-trip-direction[1]/app-select-direction[1]/div[1]/form[1]/div[1]/section[2]/div[1]/span[1]")
    WebElement removeEndPoint;

    public boolean sloganContainsText() {
        return slogan.getText().contains("CHEAP TRIP. PAY LESS, VISIT MORE!");
    }

    public boolean homePageButtonIsDisplayed() {
        return homeButton.isDisplayed();
    }

    public boolean searchResultIsDisplayed() {
        return searchResults.isDisplayed();
    }

    public void typeCityOnFromPage(String city) {
        fromField.click();
        fromField.sendKeys("Kiev");
    }

    public void typeCityOnToPage(String city ) {
        toField.click();
        toField.sendKeys("Kharkiv");
    }

    public void clickOnLetsGoButton() {
        letsGo.click();
    }

    public void typeFirstLatterOnFromForm() throws InterruptedException {
        typeLetterOnForm(fromField, "K", dropdownFromField);
    }

    public void typeFirstLatterOnToForm() throws InterruptedException {
        typeLetterOnForm(toField, "M", dropdownToField);
    }

    public void typeLetterOnForm(WebElement search, String key, WebElement dropdown) throws InterruptedException {
        search.click();
        search.sendKeys(key);
        Thread.sleep(2000);
        dropdown.click();
    }


    public void clearForm() {
        clearForm.click();
    }

    public void removeStartPoint() {
        removeStartPoint.click();
    }

    public void removeEndPoint() {
        removeEndPoint.click();
    }
}
