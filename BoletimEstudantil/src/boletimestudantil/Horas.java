package boletimestudantil;

import java.util.Scanner;

class Horas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int entrada;
		double h,m,s;
		
		System.out.println("Digite a hora: ");
		entrada =  scan.nextInt();
		
		h = entrada;
		m = ((entrada % 3600)* 60);
		s = ((entrada % 3600)* 60)* 60;
		
		System.out.println(h + "Horas, são: ");
		System.out.println(m + "Minutos, e ");
		System.out.println(s + "Segundos");
		

	}

}
