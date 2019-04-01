package tests;

import enums.PropertiesSetUp;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import pages.IanaWebPage;
import setups.hooks;

import static org.testng.Assert.assertEquals;

public class IanaWebTest extends hooks {
    private IanaWebPage ianaWebPage = new IanaWebPage(driver());

    protected IanaWebTest() throws Exception {
        super(PropertiesSetUp.WEB);
    }

    @Test(description = "Open website")
    public void webTest() throws Exception {
        int statusCode;
        statusCode = RestAssured.get(SUT).statusCode();
        assertEquals(200, statusCode);

        // Open site
        ianaWebPage.open(SUT, driverWait());

        // Verify page Title
        ianaWebPage.checkPageTitle();

    }
}
