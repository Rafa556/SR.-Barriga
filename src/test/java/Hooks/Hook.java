
package Hooks;
import PageFactory.DriverHome;
import Test.Properties;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import PageFactory.DriverHome;
import PageFactory.DriverPageFactory;
import PageFactory.Drivers;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;
public class Hook extends DriverPageFactory implements Properties {
    DriverHome driverHome;
    @Before
    public void init(){
        driverHome = DriverPageFactory.getManager(Drivers.CHROME);
        PageFactory = driverHome.getDriver();
        PageFactory.manage().timeouts().implicitlyWait(Properties.TIME_OUT, TimeUnit.SECONDS);
        PageFactory.manage().window().maximize();
    }
    @After
    public void tearDown(){
        PageFactory.quit();
    }
}
