
package enums;

public enum PropertiesSetUp {

    NATIVE("/src/main/resources/native.properties"),
    WEB("/src/main/resources/web.properties"),
    IOS_NATIVE("src/main/resources/properties/nativeIos.properties"),
    IOS_WEB("src/main/resources/properties/webIos.properties");

    public String appType;

    PropertiesSetUp(String value) {
        this.appType = value;
    }

    public String getAppType() {
        return appType;
    }

    @Override
    public String toString() {
        return "PropertyFiles{" +
                "appType='" + appType + '\'' +
                '}';
    }
}