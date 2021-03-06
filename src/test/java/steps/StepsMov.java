package steps;
import Driver.DriverManagerFactory;
import com.github.javafaker.Faker;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import driver.DriverPageFactory;
import org.openqa.selenium.support.PageFactory;
import Pages.*;
import java.util.Locale;

import static java.sql.DriverManager.getDriver;
import static org.junit.Assert.assertTrue;
public class StepsMov extends DriverManagerFactory {
    private Home home = PageFactory.initElements(getDriver(), Home.class);
    private NavBar navBar = PageFactory.initElements(getDriver(), NavBar.class);
    private Accounts contas = PageFactory.initElements(getDriver(), Accounts.class);
    private Login login = PageFactory.initElements(getDriver(), Login.class);
    private Register cadastro = PageFactory.initElements(getDriver(), Register.class);
    private CreateMovement movimentacao = PageFactory.initElements(getDriver(), CreateMovement.class);
    private Faker faker = new Faker(new Locale("pt-BR"));
    private String nome = faker.name().fullName();
    private String email = faker.internet().emailAddress();
    private String senha = faker.internet().password();
    private String conta = faker.name().firstName();
    private String valor = faker.number().randomNumber() + "." + faker.number().digits(2);
    private String descricao = faker.dragonBall().character();
    private String interessado = faker.harryPotter().character();
    @Dado("eu esteja logado e tenha acessado a página de movimentação")
    public void euEstejaLogadoETenhaAcessadoAPáginaDeMovimentação() {
        Login.RealizarLogin();
        navBar.criaNovoUsuario();
        cadastro.preencheFormulario(nome,email,senha);
        cadastro.salvaCadastro();
        login.entra(email,senha);
        assertTrue(home.validaEntrada("Bem vindo, " + nome + "!"));
        navBar.criaConta();
        contas.preencheFormulario(conta);
        contas.salvaConta();
        assertTrue(contas.validaConta("Conta adicionada com sucesso!"));
    }
    @Quando("eu criar a movimentação com dados válidos")
    public void euCriarAMovimentaçãoComDadosVálidos() {
        navBar.criaMovimentacao();
        movimentacao.preencheFormulario("Despesa","14/05/2020","30/05/2020"
                ,descricao,interessado,valor,conta,"pago");
        movimentacao.salvaMovimentacao();
    }
    @Entao("eu devo ver uma mensagem indicando que a operação foi realizada com sucesso")
    public void euDevoVerUmaMensagemIndicandoQueAOperaçãoFoiRealizadaComSucesso() {
        assertTrue(movimentacao.validaMovimentacao("Movimentação adicionada com sucesso!"));
        navBar.sai();
    }
}