package UnderDevelopment;

import PageObjects.ContactPage;
import PageObjects.TopBanner;
import PageObjects.itoplossingenPages.performantiePage;
import PageObjects.itoplossingenPages.platformPage;
import PageObjects.itoplossingenPages.procesoptimalisatiePage;
import PageObjects.itoplossingenPages.protectiePage;
import drivers.DriverSetup;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import projectFunctions.ProjectFunctions;
import projectVariables.Constants;
import projectVariables.VariablesContactform;

/**
 * Created by alexanderboffin on 23/05/17.
 */
public class CycleThroughPillars {
    @Before
    public void setUp() throws Exception {
        new DriverSetup().setUpDriver();
    }

    @Test
    public void cyclethroughpillars() {
        new DriverSetup().returnActiveDriver().get(Constants.URLEVOLANEHOMEPAGE);
        new TopBanner().gotoPerformancePage();
        new performantiePage().correctheather();
        new performantiePage().correctSlogan();

        new TopBanner().gotoProtectiePage();
        new protectiePage().correctheather();
        new protectiePage().correctSlogan();

        new TopBanner().gotoPlatformPage();
        new platformPage().correctheather();
        new platformPage().correctSlogan();

        new TopBanner().gotoProcesoptimalisatiePage();
        new procesoptimalisatiePage().correctheather();
        new procesoptimalisatiePage().correctSlogan();

    }

    @After
    public  void tearDown() {
        new DriverSetup().tearDownDriver();
    }
}
