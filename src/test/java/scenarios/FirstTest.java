package scenarios;

import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstTest extends DriverSetup {

    @BeforeClass
    public void setUp() throws Exception {
        prepareNative();
    }

    @Test
    public void SimpleTest() {
        String appPackageName = "com.example.android.contactmanager:id/";
        By add_btn = By.id(appPackageName + "addContactButton");
        driver.findElement(add_btn).click();
        System.out.println("Simplest Appium test done");
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }
}
