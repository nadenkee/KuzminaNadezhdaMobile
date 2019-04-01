package setups;

import enums.PropertiesSetUp;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import setup.DriverSetup;

import java.io.IOException;

import static setup.TestProperties.setPropertyFile;


@Test(groups = {"native", "web"})
public class hooks extends DriverSetup {

    private PropertiesSetUp currentProperties;

    /**
     * Prepare driver depending on current properties
     *
     * @param currentProperties
     * @throws IOException
     */
    public hooks(PropertiesSetUp currentProperties) throws IOException {
        this.currentProperties = currentProperties;
    }

    @BeforeSuite(description = "Preparation for test running")
    public void setUp() throws Exception {
        setPropertyFile(currentProperties);
        prepareDriver();
        System.out.println("DriverSetup prepared");
    }


    @AfterSuite(description = "Close driver after tests executioned", alwaysRun = true)
    public void tearDown() throws Exception {
        driver().quit();
        System.out.println("Driver closed");
    }
}
