package PageObjects.itoplossingenPages;

import drivers.DriverSetup;
import enums.ContactPageExpetedElements;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by alexanderboffin on 26/05/17.
 */
public abstract class evolanePillarsPages {
    @FindBy(css = "h1") private WebElement heatherofpage;
    @FindBy (css = "h2") private WebElement sloganofpage;

    public evolanePillarsPages (){
        PageFactory.initElements(new DriverSetup().returnActiveDriver(),this);
    }

    protected void correctheather(String textofheather){
        new DriverSetup().waitOnSpecificElement(heatherofpage);
        String actualmailadressonwebpage=heatherofpage.getText().replace("\u00AD","");
        Assert.assertEquals(actualmailadressonwebpage, textofheather);
    }

    protected void correctSlogan(String slogantext){
        new DriverSetup().waitOnSpecificElement(sloganofpage);
        String actualmailadressonwebpage=sloganofpage.getText();
        Assert.assertEquals(actualmailadressonwebpage, slogantext);
    }
}
