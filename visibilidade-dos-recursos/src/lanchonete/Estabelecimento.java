package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atedimento.Atendente;
//import lanchonete.atedimento.conzinha.Almoxarife;
import lanchonete.atedimento.conzinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		//ações que não precisam estarem disponíveis para toda a aplicação
		/*cozinheiro.lavarIngredientes();
		cozinheiro.baterVitaminaLiquidificador();
		cozinheiro.selecionarIngredientesVitamina();
		cozinheiro.prepararLanche();
		cozinheiro.prepararVitamina();*/
		
		//ações que estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoBalcao();;
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		//Almoxarife almoxarife = new Almoxarife();
		//ações que não precisam estarem disponíveis para toda a aplicação
		/*almoxarife.controlarEntrada();
		almoxarife.controlarSaida();*/
		//ação que somente o seu pacote cozinha precisa conhecer (default)//retira public
		//almoxarife.entregarIngredientes();
		//almoxarife.trocarGas();
		
		Atendente atendente = new Atendente();
		//atendente.pegarLancheCozinha();
		atendente.receberPagamento();
		atendente.servindoMesa();
		//ação que somente o seu pacote cozinha precisa conhecer (default)
		//atendente.trocarGas();
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
		//não deveria, mas o estabelecimento
		//ainda não definiu normas de atendimento
		/*cliente.pegarPedidoBalcao();*/
		
		//esta ação é muito sigilosa, qua tal ser privada ?
		//cliente.consultarSaldoAplicativo(); //método privado que só ele tem ciência da sua utilização
		
		//já pensou os clientes ouvindo que o gás acabou ?
		/*cozinheiro.pedirParaTrocarGas(atendente);
		cozinheiro.pedirParaTrocarGas(almoxarife);*/
		
	}
}