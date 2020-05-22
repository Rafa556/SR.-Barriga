
package PageFactory;

import lombok.Getter;
import lombok.Setter;

    public class DriverPageFactory {

        @Getter @Setter
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