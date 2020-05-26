# language: pt

# charset: UTF-8

Funcionalidade: Movimentação

  Cenario: Criar movimentação com sucesso

    Dado tenha acessado a página de movimentação
    Quando eu criar a movimentação com dados válidos
    Entao eu devo ver uma mensagem indicando que a operação foi realizada com sucesso
