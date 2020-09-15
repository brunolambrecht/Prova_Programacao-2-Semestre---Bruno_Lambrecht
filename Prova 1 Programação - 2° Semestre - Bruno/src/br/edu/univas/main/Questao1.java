package br.edu.univas.main;

import java.util.Scanner;

public class Questao1 {
	
	static int quantidade = 10;
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		int nota[] = new int [quantidade];
		int nota2[] =  new int [quantidade * 2];
		System.out.println("Digite as notas ");
		ler(nota);
		calculo(nota,nota2);
		resultado (nota2);
		
		
		sc.close();
	}
	
	public static void ler (int nota []) {
		
		for (int i = 0; i < quantidade; i++) {
			nota[i] = sc.nextInt();
			
		}
		
	}

	public static void calculo (int nota[], int nota2[]) {
		
		int cont = 1;
		for (int i = 0; i < quantidade * 2; i++) {
			if (i==0) {
				
			nota2 [i] = nota[i];
				
				if (nota[i] >= 60) {
					nota2[++i] = 1;
					
				}else {
					nota2[++i] = 0;
					
				}
			}else {
				nota2 [i] = nota[i-cont];
				cont++;
			}
						
		}
		
	}
	
	public static void resultado (int [] nota2) {
		
		for (int i = 0; i > quantidade * 2; i++) {
			System.out.println(nota2[i]);
			
		}
		
	}

}