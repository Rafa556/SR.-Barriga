package Test;

import lombok.Getter;
import lombok.Setter;
import PageFactory.DriverHome;
import PageFactory.DriverPageFactory;
import PageFactory.Drivers;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest implements Properties {

    @Getter @Setter
    private static WebDriver driver;
    DriverHome driverHome;

    @Before
    public void Init() {
        driverHome = DriverPageFactory.getManager(Drivers.CHROME);
        driver = driverHome.getDriver();
        driver.manage().timeouts().implicitlyWait(Properties.TIME_OUT, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void TearDown() { driver.quit(); }

}