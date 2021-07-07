package projeto.testes.web.metodos;

import projeto.testes.web.elementos.Elementos;

public class HomePage {
	
	Metodos metodos = new Metodos();
	Elementos elementos = new Elementos();
	
	public void acessarFormNovaConta() {
		metodos.clicar(elementos.getUser(), " menu user");
		metodos.clicarPorTexto("CREATE NEW ACCOUNT","a", " create a new account");
	}
	
	public void login() {
		metodos.clicar(elementos.getUser(), " menu user");
	
	}

}
