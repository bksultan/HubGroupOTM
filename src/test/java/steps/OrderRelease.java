package steps;

import io.cucumber.java.en.And;
import pages.Home;
import pages.OrderReleasePage;

import static pages.OrderReleasePage.getWebElementMainIframe;
import static utilities.Utilities.getProperty;
import static utilities.WebInteractionsUtils.*;

public class OrderRelease {
    static OrderReleasePage orderReleasePage = new OrderReleasePage();
    static Home homePage = new Home();

    @And("I enter the order type {string} into the search field")
    public void using_by(String orderType) {
        inputInMainIframe(getWebElementMainIframe("orderReleaseIDInput"), getProperty(orderType));
    }
}
