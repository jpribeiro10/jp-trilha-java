package boletimestudantil;

import java.util.Scanner;

public class ValoresDeCompra {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double prod1, prod2, prod3, prod4, prod5;
		double subTotal, vendaImposto;
		double imposto = 0.06;
		
		System.out.println("Informe o valor do Primeiro Item: ");
		prod1 = scan.nextDouble();
		
		System.out.println("Informe o valor do Segundo Item: ");
		prod2 = scan.nextDouble();
		
		System.out.println("Informe o valor do Terceiro Item: ");
		prod3 = scan.nextDouble();
		
		System.out.println("Informe o valor do Quarto Item: ");
		prod4 = scan.nextDouble();
		
		System.out.println("Informe o valor do Quinto Item: ");
		prod5 = scan.nextDouble();
		
		
		subTotal = prod1 + prod2 + prod3 + prod4 + prod5;
		
		System.out.println("O subtotal desta compra é: R$ " + subTotal);
		
		vendaImposto = (subTotal * imposto) + subTotal;
		
		System.out.println("O valor total de sua compra é: " + vendaImposto);
	}

}
