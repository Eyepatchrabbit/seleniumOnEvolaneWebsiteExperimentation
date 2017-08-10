package EverythinCorrectInstalled;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by alexanderboffin on 22/05/17.
 */
public class CorrectSetupChromebrowser {
    private WebDriver driver;

    @Before
    public void setUp() {
        ChromeDriverManager.getInstance().setup();
        this.driver=new ChromeDriver();
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
