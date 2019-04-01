package asserts;

import enums.Constants;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import setup.DriverSetup;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class CloudTest extends DriverSetup {
    private AppiumDriver driver;

    public CloudTest(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "intro")
    private WebElement intro;

    public void openSite(Constants url) throws Exception {
        driver.get(url.value);
        driverWait().until(ExpectedConditions.urlToBe(SUT));

    }

    public void checkTitle(Constants title) {
        assertEquals(driver.getTitle(), title.value);
    }

    public void checkIntroText(Constants introd) {
        assertTrue(intro.isDisplayed());
        assertEquals(intro.getText(), introd.value);
    }
}
