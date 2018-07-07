import base.Initialize;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.logging.Logger;

/**
 * Abstract Run to initialize WebDriver or MobileDriver
 * Written by DoaiTran
 */
public class AbstractRun extends Initialize{
    private static Logger logger = Logger.getLogger(AbstractRun.class.getSimpleName());
    @Before
    public void initializeDriver(){

    }

    @After
    public void StopDriver(){

    }
}
