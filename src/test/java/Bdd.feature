@teste
Feature: Exclusao do usuario
 
Scenario: Excluindo usuario do banco de dados
    Given Usuario esta cadastrado
    When executo DeleteById()
