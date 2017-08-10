package drivers;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by alexanderboffin on 22/05/17.
 */
public class DriverSetup {
    private static WebDriver driver=null;


    public void setUpDriver() throws Exception {
        String browser=System.getProperty("BROWSER");       //getting driver as external element
        if ("CHROME".equals(browser.toUpperCase())){
            ChromeDriverManager.getInstance().setup();
            this.driver=new ChromeDriver();

        } else if ("FIREFOX".equals(browser.toUpperCase())){
            FirefoxDriverManager.getInstance().proxy("http://localhost:4444/wd/hub").setup();
            DesiredCapabilities capabilitiy = DesiredCapabilities.firefox();
            capabilitiy.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
            this.driver=new FirefoxDriver(capabilitiy);

        }else{
            String exception="The driver variable doesn't match any of the setup options";
            Exception nocorrectdrivervariable= new Exception(exception);
            throw  nocorrectdrivervariable;
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


    }

    public  void tearDownDriver() {
        this.driver.quit();
    }

    public WebDriver returnActiveDriver() {
        return this.driver ;
    }

    public void waitOnSpecificElement(WebElement elementtowaiton){
        waitOnSpecificElement(elementtowaiton,10);

    }

    public void waitOnSpecificElement(WebElement elementtowaiton, int secondstowait){
        WebDriverWait wait= new WebDriverWait(this.driver,secondstowait);
        wait.until(ExpectedConditions.visibilityOf(elementtowaiton));

    }
}
