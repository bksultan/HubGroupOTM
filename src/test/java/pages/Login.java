package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class Login extends PageObject {
    @FindBy(xpath = "//input[@id='idcs-signin-basic-signin-form-username']")
    public WebElementFacade username;

    @FindBy(xpath = "//input[@id='idcs-signin-basic-signin-form-password|input']")
    public WebElementFacade password;

    @FindBy(xpath = "//*[@id='idcs-signin-basic-signin-form-submit']/button")
    public WebElementFacade signInBtn;
}
