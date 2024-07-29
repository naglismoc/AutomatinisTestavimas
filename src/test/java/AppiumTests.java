import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumTests {
    public static AppiumDriver driver;

    public static void main(String[] args) {
        try {
            openMobileApp();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static void openMobileApp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Android");
//        cap.setCapability("udid", "ce0817181b6994200d7e");
        cap.setCapability("platformName", "Android");
//        cap.setCapability("platformVersion", "9");
        cap.setCapability("automationName", "UiAutomator2");
//        cap.setCapability("appPackage", "com.facebook.katana");
//        cap.setCapability("appActivity", "com.facebook.addresstypeahead.AddressTypeAheadActivity");
        cap.setCapability("appPackage", "com.android.settings");
        cap.setCapability("appActivity", "");

        URL url = new URL("http://127.0.0.1:4723");
        driver = new AppiumDriver(url, cap);
//        driver.get("http://www.google.com");
    }
}
