package setup;

import enums.PropertiesSetUp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

    private static String propertyFileName;

    private Properties currentProps = new Properties();

    TestProperties(PropertiesSetUp set) {
        this.propertyFileName = set.toString();
    }


    public static void setPropertyFile(PropertiesSetUp propertyFiles) {
        propertyFileName = propertyFiles.getAppType();
    }

    Properties getCurrentProps() throws IOException {
        FileInputStream in = new FileInputStream(System.getProperty("user.dir")
                + propertyFileName);
        currentProps.load(in);
        in.close();
        return currentProps;
    }

    protected String getProp(String propKey) throws IOException {
        if (!currentProps.containsKey(propKey)) currentProps = getCurrentProps();
        //"default" form used to handle the absence of parameter
        return currentProps.getProperty(propKey, null);
    }
}