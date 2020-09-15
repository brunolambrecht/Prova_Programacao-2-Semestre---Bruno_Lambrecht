package br.edu.univas.main;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String texto = sc.nextLine();
		
		int tamanho = texto.length();
		String palavra = "";
		char l;
		
		for (int i = tamanho; i > 0 ; i--) {
			l = texto.charAt(i-1);
			System.out.println(l);
			palavra = palavra + l;
			
		}
		
		System.out.println(palavra);
		
		sc.close();
	}
	
}
