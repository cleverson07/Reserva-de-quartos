package application;

import java.util.Scanner;

import entities.reservation;

public class reserva {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		reservation[] cadastro = new reservation[10];
		
		System.out.println("Quantidade de quartos a ser reservados: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Quarto #"+ i +":");
			System.out.print("Name");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email:");
			String email = sc.next();
			System.out.print("Numero do quarto:");
            int quartoNumero= sc.nextInt();
            
			reservation login = new reservation(name,email);
			cadastro[quartoNumero] = login;
		}
		
		System.out.println();
		System.out.println("Quartos Reservados:");
		 for(int i = 0 ; i < 10; i++) {
			 if(cadastro[i] != null)
			 System.out.println(i + ": " +cadastro[i]);
		 }
		
		
		sc.close();
	}

}
