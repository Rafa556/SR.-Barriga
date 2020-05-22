package Pages;

import PageFactory.DriverPageFactory;
import Test.Properties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import report.Report;

import static Test.Properties.URL_BASE;
import static org.junit.Assert.assertEquals;

public class Login extends DriverPageFactory implements Properties {

    @FindBy(css="#email")
    private WebElement txtEmail;

    @FindBy(css="#senha")
    private WebElement txtSenha;

    @FindBy(css="button[type='submit']")
    private WebElement btnEntrar;



    @FindBy(css="div.alert.alert-success")
    private WebElement msgUsuarioInseridoComSucesso;

    public void acessaAplicacao() {
        getDriver().get(URL_BASE);
        Report.takeScreenshot();
    }

    public boolean validaCadastro(String valCadastro) {
        String txtUsuarioInseridoComSucesso = msgUsuarioInseridoComSucesso.getText();
        assertEquals(valCadastro, txtUsuarioInseridoComSucesso);
        Report.takeScreenshot();
        return true;
    }

    public void entra(String email, String senha) {
        txtEmail.sendKeys(email);
        txtSenha.sendKeys(senha);
        Report.takeScreenshot();
        btnEntrar.click();
    }



}