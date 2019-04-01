package scenarios;

import asserts.CloudTest;
import enums.PropertiesSetUp;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import setups.hooks;

import static enums.Constants.*;

@Test(groups = {"cloud"})
public class cloudTests extends hooks {

    private CloudTest cloudTestsAssertions;

    @BeforeMethod(description = "Creating driver for test running")
    public void preparePageObjects() throws Exception {
        cloudTestsAssertions = new CloudTest(driver());
    }

    //Choose web.properties
    protected cloudTests() {
        super(PropertiesSetUp.WEB);
    }

    @Test(description = "Open site iana.org and check some elements")
    public void webTest() throws Exception {
        //1. Open site iana.org
        cloudTestsAssertions.openSite(SITE_URL);

        //2. Check title of site
        cloudTestsAssertions.checkTitle(SITE_TITLE);

        //3. Check that introduction text is displayed
        cloudTestsAssertions.checkIntroText(INTRO);
    }

}
