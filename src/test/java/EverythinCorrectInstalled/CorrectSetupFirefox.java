package EverythinCorrectInstalled;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by alexanderboffin on 22/05/17.
 */
public class CorrectSetupFirefox {
    private WebDriver driver;

    @Before
    public void setUp() {
        FirefoxDriverManager.getInstance().setup();
        DesiredCapabilities capabilitiy = DesiredCapabilities.firefox();
        capabilitiy.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        this.driver=new FirefoxDriver(capabilitiy);
    }

    @Test
    public void tryningtoseeifdrivercanbesetup() {
        this.driver.get("https://www.evolane.be");
    }

    @After
    public  void tearDown() {
        this.driver.quit();
    }
}
