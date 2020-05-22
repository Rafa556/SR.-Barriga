
package Pages;

import Test.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register extends BaseTest {

    @FindBy(css="a[href='/cadastro']")
    private WebElement lnkNovoUsuario;
    @FindBy(id="#nome")
    private WebElement txtNome;
    @FindBy(id="#email")
    private WebElement txtEmail;
    @FindBy(id="#senha")
    private WebElement txtSenha;
    @FindBy(css="input[type='submit']")
    private WebElement btnCadastrar;

    public void criaNovoUsuario() {
        lnkNovoUsuario.click();
    }

    public void preencheFormulario(String nome, String email, String senha) {
        txtNome.sendKeys("Rafael");
        txtEmail.sendKeys("Rafa@fefernandes.com");
        txtSenha.sendKeys("123456");
    }

    public void salvaCadastro() {

        btnCadastrar.click();
    }

}
