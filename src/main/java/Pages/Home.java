package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {

    @FindBy(css = "a[href='/movimentacao']")
    private WebElement abaCriarMovimentacao;

    public void home(){
        abaCriarMovimentacao.click();
    }
}
