package PageObjects;

import drivers.DriverSetup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import projectFunctions.ProjectFunctions;

import java.util.concurrent.TimeUnit;

/**
 * Created by alexanderboffin on 23/05/17.
 */
public class TopBanner {
    @FindBy (xpath="//nav/ul/li[3]/a") private WebElement evolanebuttontopbannercontact;
    @FindBy (xpath="//span") private WebElement itoplossingendropdown;
    @FindBy (xpath = "//a[contains(@href, '/performantie')]") private WebElement dropdownelementperformance;
    @FindBy (xpath = "//a[contains(@href, '/protectie')]") private WebElement dropdownelementprotectie;
    @FindBy (xpath = "//a[contains(@href, '/procesoptimalisatie')]") private WebElement dropdownelementprocesoptimalisatie;
    @FindBy (xpath = "//a[contains(@href, '/platform')]") private WebElement dropdownelementplatform;


    public TopBanner(){
        PageFactory.initElements(new DriverSetup().returnActiveDriver(),this);
    }

    public void gotoContactpage(){
        this.evolanebuttontopbannercontact.click();
    }

    private void selectFromDropdownRightPillar(WebElement dropdownelementtoselect){
        new DriverSetup().waitOnSpecificElement(itoplossingendropdown);
        Actions selectelemnt=new Actions(new DriverSetup().returnActiveDriver());
        selectelemnt.moveToElement(itoplossingendropdown).moveToElement(dropdownelementtoselect).click().build().perform();
    }

    public void gotoPerformancePage(){
        itoplossingendropdown.click();
        dropdownelementperformance.click();
    }

    public void gotoProtectiePage(){
        itoplossingendropdown.click();
        dropdownelementprotectie.click();
    }

    public void gotoProcesoptimalisatiePage(){
        itoplossingendropdown.click();
        dropdownelementprocesoptimalisatie.click();
    }

    public void gotoPlatformPage(){
        itoplossingendropdown.click();
        dropdownelementplatform.click();
    }

}
