package br.edu.univas.main;

import java.util.Scanner;

public class Questao3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String palavra = sc.nextLine();
		
		int tamanho = palavra.length();
		String palavra2 = "";
		char l;
		
		for (int i = tamanho; i > 0 ; i--) {
			
			l = palavra.charAt(i-1);
			System.out.println(l);
			palavra2 = palavra2 + l;
			
		}
		
		
		
		sc.close();
	}

}