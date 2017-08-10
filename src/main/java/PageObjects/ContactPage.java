package PageObjects;

import drivers.DriverSetup;
import enums.ContactPageExpetedElements;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import projectVariables.VariablesContactform;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by alexanderboffin on 23/05/17.
 */
public class ContactPage {
    @FindBy(id="edit-submitted-volledige-naam-naam") private WebElement evolanecontactpageinvulnaam;
    @FindBy(id="edit-submitted-volledige-naam-voornaam") private WebElement evolanecontactpageinvulvoornaam;
    @FindBy(id="edit-submitted-e-mailadres") private WebElement evolaneemailinputtextbox;
    @FindBy(id="edit-submitted-bedrijf") private WebElement evolanebedrijfinputbox;
    @FindBy(id="edit-submitted-telefoonnummer") private WebElement evolanetelefooninputbox;
    @FindBy(id="edit-submitted-vraag") private WebElement evolanevraaginputbox;

    @FindBy(linkText = "info@evolane.be") private WebElement evolanemailadressforquestions;

    public ContactPage(){
        PageFactory.initElements(new DriverSetup().returnActiveDriver(),this);
    }

    public void fillinNaamAndVoornaam(String naam, String voornaam){
        new DriverSetup().waitOnSpecificElement(evolanecontactpageinvulnaam);
        evolanecontactpageinvulnaam.sendKeys(naam);
        evolanecontactpageinvulvoornaam.sendKeys(voornaam);
    }

    private void fillinEmail(String email){
        evolaneemailinputtextbox.sendKeys(email);
    }

    private void fillinBedrijf(String bedrijf){
        evolanebedrijfinputbox.sendKeys(bedrijf);
    }

    private void fillinTelefoonnummer(String telefoonnummer){
        evolanetelefooninputbox.sendKeys(telefoonnummer);
    }

    private void fillinVraag(String questiontoask){
        evolanevraaginputbox.sendKeys(questiontoask);
    }

    public void seeifExpectedMailadressIsPresent(){
        new DriverSetup().waitOnSpecificElement(evolanemailadressforquestions);
        String actualmailadressonwebpage=evolanemailadressforquestions.getText();
        Assert.assertEquals(actualmailadressonwebpage, ContactPageExpetedElements.EXPECTEDMAILADRESSFOREVOLANEQUESTIONS.getExpected());
    }

    public void fillinContactformFromstandard(){
        fillinNaamAndVoornaam(readfileForVariablesContactform("NAAM"), readfileForVariablesContactform("VOORNAAM"));
        fillinEmail(readfileForVariablesContactform("EMAIL"));
        fillinBedrijf(readfileForVariablesContactform("BEDRIJF"));
        fillinTelefoonnummer(readfileForVariablesContactform("TELEFOONNUMMER"));
        fillinVraag(readfileForVariablesContactform("VRAAG"));
    }


    public String readfileForVariablesContactform(String propertytogetfromfile){
        Properties prop = new Properties();
        InputStream input = null;

        try {

            //input = new FileInputStream("/Users/alexanderboffin/Desktop/ContactformVariables.properties");

            input = new FileInputStream(System.getProperty("Contactformfile"));

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            return (prop.getProperty(propertytogetfromfile));


        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }


}
