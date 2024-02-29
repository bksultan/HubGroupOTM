package utilities;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.OrderReleasePage;

import static net.serenitybdd.core.Serenity.getDriver;
import static pages.OrderReleasePage.getWebElementMainIframe;

public class WebInteractionsUtils {
    static OrderReleasePage orderReleasePage = new OrderReleasePage();

    public static WebElementFacade waitClickable(WebElementFacade element) {
        return element.waitUntilClickable();
    }

    public static void clickInMainIframe(String elementInsideIframeLocator) {
        WebDriver driver = getStaticDriver();

        WebElement iframeElement = driver.findElement(By.xpath(getWebElementMainIframe("mainIFrameStr")));
        driver.switchTo().frame(iframeElement);

        WebElement elementToClick = driver.findElement(By.xpath(elementInsideIframeLocator));
        highlightElement(elementToClick);
        elementToClick.click();
        driver.switchTo().defaultContent();
    }

    public static void inputInMainIframe(String elementInsideIframeLocator, String value) {
        WebDriver driver = getStaticDriver();

        WebElement iframeElement = driver.findElement(By.xpath(getWebElementMainIframe("mainIFrameStr")));
        driver.switchTo().frame(iframeElement);

        WebElement elementToInput = driver.findElement(By.xpath(elementInsideIframeLocator));
        highlightElement(elementToInput);
        elementToInput.sendKeys(value);
        driver.switchTo().defaultContent();
    }

    public static void highlightElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript(
                "arguments[0].setAttribute('style', arguments[1]);",
                element, "border: 4px solid red; padding: 4px;"
        );
    }

    private static WebDriver getStaticDriver() {
        return Serenity.getWebdriverManager().getWebdriver();
    }
}
