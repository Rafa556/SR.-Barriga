
package report;

import PageFactory.DriverPageFactory;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Report {

    @Attachment(value = "Page Screenshot", type = "image/png")
    public static byte[] takeScreenshot() {
        return ((TakesScreenshot) DriverPageFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
