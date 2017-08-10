package EverythinCorrectInstalled;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.OperaDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by alexanderboffin on 22/05/17.
 */
public class CorrectSetupOperabrowser {
    private WebDriver driver;

    @Before
    public void setUp() {
        OperaDriverManager.getInstance().version("2.27").setup();

        this.driver= new OperaDriver();
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
