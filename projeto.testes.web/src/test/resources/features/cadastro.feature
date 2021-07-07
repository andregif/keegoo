#Author: andrecalixto13@hotmail.com

@tag
Feature: Cadastrar cliente
  Como usuario quero realizar o cadastro para realizar compras


 Background: Acessar o portal
 		Given que a no site "http://advantageonlineshopping.com/#/"

  @tag1
  Scenario: Cadastro com dados validos
    And acesse o formulario de abertura de conta
    When preencher os dados validos
    Then formulario enviado com sucesso



