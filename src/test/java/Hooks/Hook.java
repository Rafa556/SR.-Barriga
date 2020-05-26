package Hooks;

import Driver.DriverHome;
import Test.Properties;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import Driver.DriverManagerFactory;
import Driver.Drivers;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

public class Hook extends DriverManagerFactory implements Properties {
    DriverHome driverHome;
    @Before
    public void init(){
        driverHome = DriverManagerFactory.getManager(Drivers.CHROME);
        PageFactory = driverHome.getDriver();
        PageFactory.manage().timeouts().implicitlyWait(Properties.TIME_OUT, TimeUnit.SECONDS);
        PageFactory.manage().window().maximize();
    }
    @After
    public void tearDown(){
        PageFactory.quit();
    }
}
