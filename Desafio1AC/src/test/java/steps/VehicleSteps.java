package steps;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.VehiclePage;
import utils.DSL;

public class VehicleSteps {
	
	private DSL dsl;
	private VehiclePage page;

	@Dado("que eu acesse a pagina de cadastro")
	public void queEuAcesseAPaginaDeCadastro() throws InterruptedException {
		Thread.sleep(10000);
//		String textoSistema = dsl.obterTexto("entervehicledata");
//		Assert.assertEquals("Enter Vehicle Data", textoSistema);
	}

	@Quando("eu preencho o formulario")
	public void euPreenchoOFormulario() {
	    page.selecionarMake("Honda");
	    page.selecionarModel("Motorcycle");
	    page.escreverCylinderCapacity("1000");
	    page.escreverEnginePerformance("20");
	    page.escreverDateOfManufacture("12/30/2020");
	    page.selecionarNumberOfSeats("1");
	    page.selecionarYesRightHandDrive();
	    page.selecionarNumberOfSeats2("1");
	    page.selecionarFuelType("Petrol");
	    page.escreverPayload("500");
	    page.escreverTotalWeight("1000");
	    page.escreverListPrice("5000");
	    page.escreverLicensePlateNumber("Test");
	    page.escreverAnnualMileage("30000");
	    page.clicarBotaoNext();
	}
	
	@Entao("vejo a tela de cadastro do segurado")
	public void vejoATelaDeCadastroDoSegurado() {
		String textoPrimeiroCampo = dsl.obterTexto(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[1]"));
		Assert.assertEquals("Enter Vehicle Data", textoPrimeiroCampo);
	}

}
