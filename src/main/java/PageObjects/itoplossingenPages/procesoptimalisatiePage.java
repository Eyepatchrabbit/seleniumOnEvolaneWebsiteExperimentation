package PageObjects.itoplossingenPages;

import drivers.DriverSetup;
import enums.performantiePageExpectedElements;
import enums.procesoptimalisatiePageExpectedElements;
import enums.protectiePageExpectedElements;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by alexanderboffin on 26/05/17.
 */
public class procesoptimalisatiePage extends evolanePillarsPages{

    public procesoptimalisatiePage() {PageFactory.initElements(new DriverSetup().returnActiveDriver(), this);}

    public void correctheather() {
        correctheather(procesoptimalisatiePageExpectedElements.HEATHER.getExpected());
    }

    public void correctSlogan(){
        correctSlogan(procesoptimalisatiePageExpectedElements.SLOGAN.getExpected());
    }
}
