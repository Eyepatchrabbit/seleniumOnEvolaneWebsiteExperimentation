package UnderDevelopment;

import drivers.DriverSetup;
import PageObjects.ContactPage;
import PageObjects.TopBanner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import projectVariables.Constants;

/**
 * Created by alexanderboffin on 22/05/17.
 */
public class FillInContactForm {

    @Before
    public void setUp() throws Exception {
        new DriverSetup().setUpDriver();
    }

    @Test
    public void FillingInContactform() {
        new DriverSetup().returnActiveDriver().get(Constants.URLEVOLANEHOMEPAGE);
        new TopBanner().gotoContactpage();
        new ContactPage().fillinContactformFromstandard();
        new ContactPage().seeifExpectedMailadressIsPresent();

    }

    @After
    public  void tearDown() {
        new DriverSetup().tearDownDriver();
    }
}
