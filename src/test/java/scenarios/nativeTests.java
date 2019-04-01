package scenarios;

import asserts.NativeTest;
import enums.PropertiesSetUp;
import setups.hooks;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static enums.Constants.ADD_CONTACT;

@Test(groups = {"native"})
public class nativeTests extends hooks {

    private NativeTest nativeTestAssertions;

    @BeforeMethod
    public void preparePageObjects() throws Exception {
        nativeTestAssertions = new NativeTest(driver());
    }

    //Choose native.properties
    protected nativeTests() throws IOException {
        super(PropertiesSetUp.NATIVE);
    }

    @Test(description = "Click on Add Contact and check that all fields are presented")
    public void contactManagerTest() {
        //Check that Add Contact button is displayed and click on it
        nativeTestAssertions.checkAddContactButton();

        //Check title in opened page of application
        nativeTestAssertions.checkTitle(ADD_CONTACT);

        //Check that all fields and buttons are displayed
        nativeTestAssertions.checkAllElementsAreDisplayed();
    }
}

