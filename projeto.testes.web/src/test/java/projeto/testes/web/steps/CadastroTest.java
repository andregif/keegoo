package projeto.testes.web.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import projeto.testes.web.metodos.Browsers;
import projeto.testes.web.metodos.HomePage;

public class CadastroTest {
	
	Browsers browser = new Browsers();
	HomePage home = new HomePage();
	
	@Given("que a no site {string}")
	public void que_a_no_site(String site) {
		browser.abrirNavegador(site);
	}

	@Given("acesse o formulario de abertura de conta")
	public void acesse_o_formulario_de_abertura_de_conta() {
		home.acessarFormNovaConta();
		
	}

	@When("preencher os dados validos")
	public void preencher_os_dados_validos() {

	}

	@Then("formulario enviado com sucesso")
	public void formulario_enviado_com_sucesso() {

	}

}
