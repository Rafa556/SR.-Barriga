package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login{

    @FindBy(id="email")
    private WebElement txtEmail;

    @FindBy(id="senha")
    private WebElement txtSenha;

    @FindBy(css = "body > div.jumbotron.col-lg-4 > form > button")
    private WebElement btnEntrar;


    public void RealizarLogin(){

        txtEmail.sendKeys("rafinha12!gft.com");

        txtSenha.sendKeys("rafafa123");

        btnEntrar.click();
    }



}