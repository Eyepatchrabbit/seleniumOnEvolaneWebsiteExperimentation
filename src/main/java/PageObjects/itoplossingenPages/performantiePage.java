package PageObjects.itoplossingenPages;

import drivers.DriverSetup;
import enums.performantiePageExpectedElements;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by alexanderboffin on 26/05/17.
 */
public class performantiePage extends evolanePillarsPages{

    public  performantiePage(){
        PageFactory.initElements(new DriverSetup().returnActiveDriver(),this);
    }

    public void correctheather(){
        correctheather(performantiePageExpectedElements.HEATHER.getExpected());
    }

    public void correctSlogan(){
        correctSlogan(performantiePageExpectedElements.SLOGAN.getExpected());
    }

}
