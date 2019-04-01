package enums;

public enum Constants {
    INTRO("The global coordination of the DNS Root, IP addressing, and other Internet protocol resources " +
            "is performed as the Internet Assigned Numbers Authority (IANA) functions. Learn more."),
    SITE_TITLE("Internet Assigned Numbers Authority"),
    SITE_URL("https://iana.org"),
    ADD_CONTACT("Add Contact"),
    SELECTOR_BASE("com.example.android.contactmanager:id/"),
    FIREFOX("Firefox"),
    CHROME("Chrome"),
    DEFAULT("Browser"),
    SAFARI("Safari"),
    AUT("aut"),
    SUT("sut"),
    TEST_PLATFORM("platform"),
    DRIVER("driver"),
    DEVICE("deviceName"),
    DRIVER_PATH("driverPath"),
    UNKNOWN_PLATFORM("Unknown mobile platform"),
    UNCLEAR_TYPE("Unclear type of mobile app");

    public String constant;
    public String value;
    public String warning;
    public String browser;
    public String propertyName;


    @Override
    public String toString() {
        return constant;
    }

    Constants(String value) {
        this.value = value;
    }
}
