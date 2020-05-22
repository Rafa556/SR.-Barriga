package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateMovement {

    @FindBy(id = "tipo")
    private WebElement txtTipoDeMovimentacao;

    @FindBy(id = "data_transacao")
    private WebElement txtDataDaMovimentação;

    @FindBy(id = "data_pagamento")
    private WebElement txtDataPagamento;

    @FindBy(id = "descricao")
    private WebElement txtDescricao;

    @FindBy(id = "interessado")
    private WebElement txtInteressado;

    @FindBy(id = "valor")
    private WebElement txtValor;

    @FindBy(id = "conta")
    private WebElement selectConta;

    @FindBy(css = "#status_pendente")
    private WebElement rdoPendente;

    @FindBy(css="#status_pago")
    private WebElement rdoPago;

    @FindBy(className = "btn-primary")
    private WebElement btnSalvar;

    @FindBy(css="a[href='/logout']")
    private WebElement lnkSair;

    public CreateMovement(WebElement txtTipoDeMovimentacao, WebElement txtDataDaMovimentação, WebElement txtDataPagamento,
                          WebElement txtInteressado, WebElement selectConta, WebElement rdoPago, WebElement btnSalvar, WebElement lnkSair) {
        this.txtTipoDeMovimentacao = txtTipoDeMovimentacao;
        this.txtDataDaMovimentação = txtDataDaMovimentação;
        this.txtDataPagamento = txtDataPagamento;
        this.txtInteressado = txtInteressado;
        this.selectConta = selectConta;
        this.rdoPago = rdoPago;
        this.btnSalvar = btnSalvar;
        this.lnkSair = lnkSair;
    }


    public void preencheFormulario(String tipoMovimentacao, String dataMovimentacao, String dataPagamento,
                                   String descricao, String interessado, String valor, String conta, String situacao) {
        txtTipoDeMovimentacao.sendKeys(tipoMovimentacao);
        txtTipoDeMovimentacao.sendKeys(dataMovimentacao);
        txtDataPagamento.sendKeys(dataPagamento);
        txtDescricao.sendKeys(descricao);
        txtInteressado.sendKeys(interessado);
        txtValor.sendKeys(valor);
        if (situacao == "pendente") {
            rdoPendente.click();
        }
        if (situacao == "pago") {
            rdoPago.click();
        }
    }

    public void salvaMovimentacao() {
        btnSalvar.click();
    }

    public void quit()
    {
        lnkSair.click();
    }
}
