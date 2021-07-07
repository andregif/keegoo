#Author: andrecalixto13@hotmail.com

Feature: Login
  Eu como usuario quero fazer login para acessar os dados


    
    
  Scenario: CT02 - Fazer login com dados invalidos
    Given que eu esteja na tela de login
    When informar usuario valido
    But senha invalida
    Then login não será realizado com sucesso com a mensagem Invalid credentials
    


