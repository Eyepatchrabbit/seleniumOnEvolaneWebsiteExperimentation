package projectFunctions;

import java.util.concurrent.TimeUnit;

/**
 * Created by alexanderboffin on 23/05/17.
 */
public class ProjectFunctions {
    public void slowDown() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
    }

}
