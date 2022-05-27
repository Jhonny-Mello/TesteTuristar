@PostUsers
Feature: Testando comando Post em usuarios

Scenario: Adicionando novo usuario no banco de dados
		
		Given Usuario nao esta cadastrado
		When adicionar usuario
		Then usuario cadastrado