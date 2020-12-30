#language: pt
@cadastro_veiculos
Funcionalidade: Cadastro de veiculos
	Como um usuario 
	Gostaria de cadastrar os dados de um veiculo
	Para que eu possa manter minha base de dados de veiculos
	
	Contexto: Acesso a funcionalidade
		Dado que eu acesse a pagina de cadastro
	
	@cadastrar_veiculos	
	Cenario: Realizar cadastro de veiculo
		Quando eu preencho o formulario
		Entao vejo a tela de cadastro do segurado