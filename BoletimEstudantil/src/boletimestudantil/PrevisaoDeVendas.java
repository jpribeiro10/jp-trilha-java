package boletimestudantil;

import java.util.Scanner;

//Questão_5: Previsão de vendas – Sabendo que o lucro anual de uma 
//empresa é, tipicamente, 23% do total de vendas, solicite ao usuário que 
//entre com o valor projetado do total de vendas e em seguida, calcule e 
//exiba o lucro que deve ser obtido com esse valor. 
//Lembrete: 23%=23100=0,23//

public class PrevisaoDeVendas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double vendas;
		double lucroEst = 0.23;
		double lucroReal, lucroFim;
		
		System.out.println("Insira o valor total das vendas projetados anualmente: ");
		vendas = scan.nextInt();
		
		lucroReal = vendas * lucroEst;
		lucroFim = lucroReal + vendas;
		
		System.out.println("O lucro previsto que deve ser obtido é: " + lucroFim);
		
		
		

	}

}
