package pages;

import org.openqa.selenium.By;

import utils.DSL;

public class VehiclePage {
	
	private DSL dsl;
	
	//Campo Make
	public void selecionarMake(String valor) {
		dsl.selecionarCombo("make", valor);
	}
	
	//Campo Model
	public void selecionarModel(String valor) {
		dsl.selecionarCombo("model", valor);
	}
	
	//Campo Cylinder Capacity [ccm]
	public void escreverCylinderCapacity(String texto) {
		dsl.escrever(By.id("cylindercapacity"), texto);
	}
	
	//Campo Engine Performance [kW]
	public void escreverEnginePerformance(String texto) {
		dsl.escrever(By.id("engineperformance"), texto);
	}
	
	//Campo Date of Manufacture
	public void escreverDateOfManufacture(String texto) {
		dsl.escrever(By.id("dateofmanufacture"), texto);
	}
	
	//Ícone do calendário
	public void clicarCalendario() {
		dsl.clicarBotao("opendateofmanufacturecalender");
	}
	
	//Campo Number of Seats
	public void selecionarNumberOfSeats(String valor) {
		dsl.selecionarCombo("numberofseats", valor);
	}
	
	//Opção "Yes" Right Hand Drive
	public void selecionarYesRightHandDrive() {
		dsl.clicarRadio("righthanddriveyes");
	}
	
	//Opção "No" Right Hand Drive
	public void selecionarNoRightHandDrive() {
		dsl.clicarRadio("righthanddriveno");
	}
	
	//Campo Number of Seats 2
	public void selecionarNumberOfSeats2(String valor) {
		dsl.selecionarCombo("numberofseatsmotorcycle", valor);
	}

	//Campo Fuel Type
	public void selecionarFuelType(String valor) {
		dsl.selecionarCombo("fuel", valor);
	}
	
	//Campo Payload [kg]
	public void escreverPayload(String texto) {
		dsl.escrever(By.id("payload"), texto);
	}
	
	//Campo Total Weight [kg]
	public void escreverTotalWeight(String texto) {
		dsl.escrever(By.id("totalweight"), texto);
	}
	
	//Campo List Price [$]
	public void escreverListPrice(String texto) {
		dsl.escrever(By.id("listprice"), texto);
	}
	
	//Campo License Plate Number
	public void escreverLicensePlateNumber(String texto) {
		dsl.escrever(By.id("licenseplatenumber"), texto);
	}
	
	//Campo Annual Mileage [mi]
	public void escreverAnnualMileage(String texto) {
		dsl.escrever(By.id("annualmileage"), texto);
	}
	
	//Botao Next
	public void clicarBotaoNext() {
		dsl.clicarBotao("nextenterinsurantdata");
	}
}
