import Test.BaseTest;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import Pages.*;

public class PatternFactory extends BaseTest {

    @Test
    public void test() {

        Home home = PageFactory.initElements(getDriver(), Home.class);

        Login login = PageFactory.initElements(getDriver(), Login.class);

        Register register = PageFactory.initElements(getDriver(), Register.class);

        CreateMovement createMovement = PageFactory.initElements(getDriver(), CreateMovement.class);

        login.RealizarLogin();
        register.criaNovoUsuario();
        register.preencheFormulario("Rafael fernandes","rafafa123@gft.com","rafa123");
        register.salvaCadastro();
        login.RealizarLogin();
        CreateMovement.preencheFormulario("Despesa","27/09/2020","21/04/2021",
                "Pc Gamer","Sr. Barriga","3500.00","Raffa","pago");
        CreateMovement.salvaMovimentacao();
        CreateMovement.quit();
    }

}