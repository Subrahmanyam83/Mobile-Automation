import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.remote.CapabilityType
import org.testng.annotations.Test

/**
 * Created by subrahmanyamr on 9/7/2015.
 */
class AndroidTest {

    @Test
    public void firstTest(){
        DesiredCapabilities capibilities = DesiredCapabilities.android()
        capibilities.setCapability(CapabilityType.PLATFORM, "Android");
        capibilities.setBrowserName("Browser")
        capibilities.setCapability("deviceName","Android-2")
        capibilities.setCapability("platformVersion","4.4.2")
        capibilities.setCapability("platformName","Android")
        def driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),capibilities);
        driver.get("http://www.facebook.com")
        Thread.sleep(5000L)
        driver.quit()
    }
}
