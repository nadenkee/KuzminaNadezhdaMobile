package scenarios;

import asserts.WebTest;
import enums.PropertiesSetUp;
import setups.hooks;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static enums.Constants.*;


@Test(groups = {"web"})
public class webTests extends hooks {

    private WebTest webTestAssertions;

    @BeforeMethod(description = "Creating driver for test running")
    public void preparePageObjects() throws Exception {
        webTestAssertions = new WebTest(driver());
    }

    //Choose web.properties
    protected webTests() throws IOException {
        super(PropertiesSetUp.WEB);
    }

    @Test(description = "Open site iana.org and check some elements")
    public void webTest() throws Exception {
        //1. Open site iana.org
        webTestAssertions.openSite(SITE_URL);

        //2. Check title of site
        webTestAssertions.checkTitle(SITE_TITLE);

        //3. Check that introduction text is displayed
        webTestAssertions.checkIntroText(INTRO);
    }
}
