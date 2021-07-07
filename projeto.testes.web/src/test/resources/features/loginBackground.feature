#Author: andrecalixto13@hotmail.com

@smoke
Feature: Login
  Eu como usuario quero fazer login para acessar os dados
  
  Background: Tela de login
    Given que eu esteja na tela de login
    
  @ct01 @positivo @regressivo
  Scenario: CT01 - Fazer login com dados validos
    When informar os dados validos
    Then login realizado com sucesso
    
    @ct02 @negativo @fast
  Scenario: CT02 - Fazer login com dados invalidos
    When informar usuario valido
    But senha invalida
    Then login não será realizado com sucesso com a mensagem Invalid credentials
    
    @ct03 @negativo
     Scenario: CT03 - Fazer login com dados invalidos
    When informar usuario invalido
    But senha valida
    Then login não será realizado com sucesso com a mensagem Invalid credentials
    
    
    


