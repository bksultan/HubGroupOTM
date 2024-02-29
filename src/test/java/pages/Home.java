package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class Home extends PageObject {
    @FindBy(xpath = "//oj-button[@id='homeButton']")
    public WebElementFacade homeBtn;

    //Order Management
    @FindBy(xpath = "//div[@id='label2']")
    public WebElementFacade orderManagement;

    @FindBy(xpath = "//ul[@role='tree']/li[@id='sb_1_2']/div//span[@class='oj-treeview-item-text' and @title='Order Release']")
    public WebElementFacade orderManagementContent;

    @FindBy(xpath = "//ul[@role='tree']/li[@id='sb_1_2']/ul//span[@class='oj-treeview-item-text' and @title='Order Release']")
    public WebElementFacade orderRelease;

    // Shipment Management
    @FindBy(xpath = "//div[@id='label3']")
    public WebElementFacade shipmentManagement;

    @FindBy(xpath = "//span[@class='oj-treeview-item-text' and @title='Shipment Management']")
    public WebElementFacade shipmentManagementContent;

    @FindBy(xpath = "//span[@title='Buy Shipments']")
    public WebElementFacade buyShipments;
}
