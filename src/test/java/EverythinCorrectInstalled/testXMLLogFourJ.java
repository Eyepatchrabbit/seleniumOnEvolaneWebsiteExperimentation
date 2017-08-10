package EverythinCorrectInstalled;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;



/**
 * Created by alexanderboffin on 24/05/17.
 */
public class testXMLLogFourJ {
    static final Logger logger =Logger.getLogger(testXMLLogFourJ.class.getName());

    public static void main(String[] args) {
        DOMConfigurator.configure("log4jconfiguration.xml");
        logger.info("seeing if correctly setup");
        logger.debug("second message");
        logger.error("an error message");

    }

}
