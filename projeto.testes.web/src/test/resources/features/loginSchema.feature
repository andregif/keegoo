#Author: andrecalixto13@hotmail.com


Feature: Login
  Eu como usuario quero fazer login para acessar os dados


  Scenario Outline: Fazer login 
    Given que eu esteja na tela de login
    When informar <usuario>
    And informar a <senha>
    Then valido o <status>

    Examples: 
      | usuario  | senha				 | status   |
      | "Admin"  |    "admin123" | true 		|
      | "Admin"  |     "@123" 	 | false    |

