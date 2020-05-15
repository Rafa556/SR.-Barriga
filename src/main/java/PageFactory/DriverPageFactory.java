
package PageFactory;

import java.sql.DriverManager;

import static org.openqa.selenium.remote.BrowserType.CHROME;

    public class DriverPageFactory {

    public static DriverHome getManager(Drivers type) {

        DriverHome driverHome;

        switch (type) {
            case CHROME:
                driverHome = new ChromeDriverHome();
                break;
            default:
                driverHome = new ChromeDriverHome();
                break;
        }
        return driverHome;
    }
}