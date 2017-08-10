package EverythinCorrectInstalled;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;



/**
 * Created by alexanderboffin on 24/05/17.
 */
public class testPropertiesLogFourJ {
    static final Logger logger =Logger.getLogger("loggersetuptest");

    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");
        logger.info("seeing if correctly setup");
        logger.debug("second message");
        logger.error("an error message");

    }

}
