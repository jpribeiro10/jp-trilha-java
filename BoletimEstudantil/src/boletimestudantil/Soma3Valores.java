package boletimestudantil;

import java.util.Scanner;

public class Soma3Valores {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, num3, soma, prod1, prod2;
	
		
		System.out.println("Insira o valor da primeiro variável: ");
		num1 = scan.nextInt();
		
		System.out.println("Insira o valor da segunda variável: ");
		num2 = scan.nextInt();
		
		System.out.println("Insira o valor da terceira variável: ");
		num3 = scan.nextInt();
		
		soma = num1 + num2;
		
		System.out.println("A soma da duas primeiras variáveis é: " + soma);
		
		prod1 = soma * num3;
		
		System.out.println("O produto das duas ultimas variáveis é: " + prod1);
		
		prod2 = soma * prod1;
		
		System.out.println("E o produto das duas novas variáveis é: " + prod2);
		
		

	}

}