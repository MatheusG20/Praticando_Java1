package idade;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int yDias;
		int zMeses;
		int xAnos;
		int dias;
		
		System.out.println("Insira sua idade em anos:");
		xAnos = scan.nextInt();
	
		System.out.println("Insira quantos meses:");
		zMeses = scan.nextInt();
		
		System.out.println("Insira quantos dias:");
		yDias = scan.nextInt();
		
		dias = (365 * xAnos) + (30 * zMeses) + (yDias);  
		
		System.out.println("Sua idade em dias é:"+dias);
		
	}

}
