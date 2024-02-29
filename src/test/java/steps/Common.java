package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.thucydides.model.util.EnvironmentVariables;
import pages.Home;
import pages.Login;
import pages.OrderReleasePage;

import static pages.OrderReleasePage.getWebElementMainIframe;
import static utilities.Utilities.getProperty;
import static utilities.WebInteractionsUtils.clickInMainIframe;
import static utilities.WebInteractionsUtils.waitClickable;

public class Common extends PageObject {
    static Login loginPage = new Login();
    static OrderReleasePage orderRelease = new OrderReleasePage();
    static Home homePage = new Home();

    private EnvironmentVariables environmentVariables;

    @Given("I am logged in to the Order Tracking Management system")
    public void login_to_otm() {
        openAt(EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("webdriver.base.url"));
        getDriver().manage().window().maximize();

        waitClickable(loginPage.username).sendKeys(getProperty("username"));
        waitClickable(loginPage.password).sendKeys(getProperty("password"));
        waitClickable(loginPage.signInBtn).click();
    }

    @When("I am on the {string} search page")
    public void search_by(String option) {
        homePage.homeBtn.waitUntilClickable().click();

        switch (option) {
            case "Order Release":
                waitClickable(homePage.orderManagement).click();
                waitClickable(homePage.orderManagementContent).click();
                waitClickable(homePage.orderRelease).click();
                break;
            case "Shipment":
                waitClickable(homePage.shipmentManagement).click();
                waitClickable(homePage.shipmentManagementContent).click();
                waitClickable(homePage.buyShipments).click();
                break;
        }
    }

    @And("I click on the Search button")
    public void search_by() {
        clickInMainIframe(getWebElementMainIframe("searchBtn"));
    }
}
