package PageObjects.itoplossingenPages;

import drivers.DriverSetup;
import enums.performantiePageExpectedElements;
import enums.protectiePageExpectedElements;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by alexanderboffin on 26/05/17.
 */
public class protectiePage extends evolanePillarsPages {


    public protectiePage() {
        PageFactory.initElements(new DriverSetup().returnActiveDriver(), this);
    }

    public void correctheather() {
        correctheather(protectiePageExpectedElements.HEATHER.getExpected());
    }

    public void correctSlogan(){
        correctSlogan(protectiePageExpectedElements.SLOGAN.getExpected());
    }
}
