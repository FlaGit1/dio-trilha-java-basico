package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
	//pode ser default
	public void adicionarLancheNoBalcao() {
		System.out.println("Adiocionando Lanche Natural Hambuguer no Balcão");
	}
	//pode ser default
	public void adicionarSucoNoBalcao() {
		System.out.println("Adionando Suco no Balcão");
	}
	//pode ser default
	public void adionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	private void prepararLanche() {
		System.out.println("Preparando Lanche tipo Hambuguer");
	}
	private void prepararVitamina() {
		System.out.println("Preparando Suco");
	}
	private void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	private void selecionarIngredientesLanche() {
		System.out.println("Selecionado o Pão, Salada, Ovo e Carne");
	}
	private void selecionarIngredientesVitamina() {
		System.out.println("Selecionado Fruta, Leite e Suco");
	}
	private void lavarIngredientes() {
		System.out.println("Lavando Ingredientes");
	}
	private void baterVitaminaLiquidificador() {
		System.out.println("Batendo Vitamina Liquidificador");
	}
	private void fritarIngredientesLanche() {
		System.out.println("Fritando a Carne e Ovo para o Hamburguer");
	}
	private void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.entregarIngredientes();
	}
	private void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
	
	

}
