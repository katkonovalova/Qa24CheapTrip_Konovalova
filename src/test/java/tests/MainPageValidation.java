package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MainPage;

public class MainPageValidation extends TestBase {

    MainPage mainPage;
    String cityFrom;
    String cityTo;


    @BeforeMethod
    public void unitTests() {
        mainPage = PageFactory.initElements(driver, MainPage.class);
    }

    @Test
    public void sloganIsDisplayedTest() throws InterruptedException {
        Thread.sleep(3000);
        assert mainPage.sloganContainsText();
    }
    @Test
    public void homePageButtonIsDisplayedTest() throws InterruptedException {
        Thread.sleep(3000);
        assert mainPage.homePageButtonIsDisplayed();
    }
    @Test
    public void searchResultIsDisplayedTest() throws InterruptedException {

        mainPage.typeCityOnFromPage(cityFrom);
        Thread.sleep(2000);
        mainPage.typeCityOnToPage(cityTo);
        Thread.sleep(2000);
        mainPage.clickOnLetsGoButton();
        Thread.sleep(2000);

        assert mainPage.searchResultIsDisplayed();
    }
    @Test
    public void searchTripUsingDropdown() throws InterruptedException {
        mainPage.typeFirstLatterOnFromForm();
        Thread.sleep(2000);
        mainPage.typeFirstLatterOnToForm();
        Thread.sleep(2000);
        mainPage.clickOnLetsGoButton();
        Thread.sleep(2000);
        assert mainPage.searchResultIsDisplayed();
    }
    @Test
    public void clearSearchFormAfterSearch() throws InterruptedException {
        mainPage.typeFirstLatterOnFromForm();
        Thread.sleep(2000);
        mainPage.typeFirstLatterOnToForm();
        Thread.sleep(2000);
        mainPage.clickOnLetsGoButton();
        Thread.sleep(2000);
        mainPage.clearForm();
    }
    @Test
    public void removeStartPoint() throws InterruptedException {
        mainPage.typeFirstLatterOnFromForm();
        mainPage.removeStartPoint();
    }
    @Test
    public void removeEndPoint() throws InterruptedException {
        mainPage.typeFirstLatterOnToForm();
        mainPage.removeEndPoint();
    }

}
