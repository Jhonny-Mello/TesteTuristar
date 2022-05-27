@DeleteUser
Feature: Exclusao do usuario
 
Scenario Outline: Excluindo usuario do banco de dados
    
    Given Usuario esta cadastrado
    When Excluo usuario <id>
		Then Usuario <id> excluido
		
		Examples:
		|id|
		|"1"|

@DeleteAllUsers

Scenario: Excluindo todos usuarios do banco de dados
		
		Given Usuarios cadastrados
		When Excluo todos os usuarios
		Then Todos usuarios excluidos