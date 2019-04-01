package tests;

import enums.PropertiesSetUp;
import setups.hooks;
import org.testng.annotations.Test;
import pages.ContactManager;

@Test(groups = "native")
public class ContactManagerTest extends hooks {

    protected ContactManagerTest() throws Exception {
        super(PropertiesSetUp.NATIVE);
    }


    @Test(description = "Open Add Contact screen and verify displayed elements")
    public void simplestAddContactScreenTest() throws Exception {
        ContactManager contactManager = new ContactManager(driver());

        // Open contact form
        contactManager.openContactForm();

        // Verify title
        contactManager.checkTitle();

        // Verify presence of Name field and Edit field
        contactManager.checkDisplayedElements();

    }

}
