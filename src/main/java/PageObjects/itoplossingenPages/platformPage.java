package PageObjects.itoplossingenPages;

import drivers.DriverSetup;
import enums.performantiePageExpectedElements;
import enums.platformPageExpectedElements;
import enums.protectiePageExpectedElements;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by alexanderboffin on 26/05/17.
 */
public class platformPage extends evolanePillarsPages {

    public platformPage() {
        PageFactory.initElements(new DriverSetup().returnActiveDriver(), this);
    }

    public void correctheather() {
        correctheather(platformPageExpectedElements.HEATHER.getExpected());
    }

    public void correctSlogan(){
        correctSlogan(platformPageExpectedElements.SLOGAN.getExpected());
    }
}
