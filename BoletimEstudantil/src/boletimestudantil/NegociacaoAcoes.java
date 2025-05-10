package boletimestudantil;

import java.util.Scanner;

public class NegociacaoAcoes {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double corretagem = 0.02;
		double comissao = 0.02;
		double compraUN = (32.87 * 1000);
		double vendaUN = (33.92 * 1000);
		double valorPago, valorVenda, valorCorretagem, valorComissao, valorGanho;
		
		System.out.println("Bem vindo pregão de Ações da B3 - Portifólio de Ações das Lojas Pedroso S/A - LJPDR3.");
		System.out.println("Cotação: compra de Ação: Valor Unitário: R$ 32,87");
		
		valorPago = (compraUN * corretagem) + compraUN;
		System.out.println("O valor pago por José foi: R$" + valorPago);
		
		valorCorretagem	= compraUN * corretagem;	
		System.out.println("O valor da taxa de corretagem na compra das Ações foi de: R$ " + valorCorretagem);
		
		valorComissao = vendaUN * comissao; 
		valorVenda = vendaUN;
		valorGanho = vendaUN - valorComissao;
		System.out.println("A quantia liquida pela qual José vendeu suas ações foi de: R$ " + valorVenda);
		
		System.out.println("O valor que José pagou de comissão pela venda foi de: R$ " + valorComissao);
		
		System.out.println("O valor que José obteve na venda das ações foi de: R$ " + valorGanho);
		
		

	}

}
