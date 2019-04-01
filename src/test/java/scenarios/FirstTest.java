package scenarios;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstTest extends DriverSetup {

    @BeforeClass
    public void setUp() throws Exception {
        prepareNative();
        prepareWeb();
    }

    @Test(description = "This test just clicks on button 'Add Contact'")
    public void SimpleTest() {
        String appPackageName = "com.example.android.contactmanager:id/";
        By add_btn = By.id(appPackageName + "addContactButton");
        driver.findElement(add_btn).click();
        System.out.println("Simplest Appium test done");
    }

    @Test(description = "Open website")
    public void webTest() throws InterruptedException {
        driver.get("http://iana.org");
        //Thread.sleep(5000);  //FORBIDDEN TO USE IN AUTOMATIZATION, JUST THIS TIME & BECAUSE OF UI TEST
        System.out.println("Site opening done");
    }

    @AfterClass(description = "Close driver on all tests completion")
    public void tearDown() throws Exception {
        driver.quit();
    }
}
