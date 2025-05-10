package boletimestudantil;

import java.util.Scanner;

public class SomaAeB {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A, B, soma;
		
		System.out.println("Insira o valor de A: ");
		A = scan.nextInt();
		
		System.out.println("Insira o valor de B: ");
		B = scan.nextInt();
		
		soma = A + B;
		
		System.out.println("A soma de A + B é = " + soma);
		
		

	}

}
