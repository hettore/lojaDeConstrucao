package application;

import java.util.Scanner;

import entities.Casa;
import entities.Cliente;

public class Loja {

	Scanner sc = new Scanner(System.in);

	public void menu() {
		System.out.println("            Bem vindo(a)");
		System.out.println("Pronto(a) para escolher seu novo lar?");
		System.out.println("Você prefere casa ou apartamento? ");
		System.out.println();
		System.out.println("Opções: ");
		System.out.println(" 1 - Para uma casa.");
		System.out.println(" 2 - Para um ap.");
		System.out.print("Digite a opção desejada: ");

		int escolha = sc.nextInt();

		switch (escolha) {
		case 1:

			comprarCasa();

			break;

		case 2:

			comprarAp();

			break;

		case 3:

			terminar();

			break;

		}
	}

	public void comprarCasa() {
		
		System.out.println();
		System.out.println("Hoje temos dois modelos disponiveis:");

		//Casa casa0 = new Casa(000, 1, 1, 0, 1, 1, "sim", 1);
		Casa casa1 = new Casa(001, 1, 2, 0, 1, 1, "sim", 2, 260000.00);
		Casa casa2 = new Casa(002, 1, 3, 2, 1, 1, "sim", 4, 560000.00);
		
//		System.out.println();
//		System.out.println("Opção 1: ");
//		System.out.println(casa1);

		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println("              Opção 1: ");
		System.out.println("-------------------------------------");
		System.out.println(casa1);
		
		//System.out.println();
		System.out.println("-------------------------------------");
		System.out.println("              Opção 2: ");
		System.out.println("-------------------------------------");
		System.out.println(casa2);
		
		System.out.println("-------------------------------------");
		System.out.println();
		System.out.println("Qual você mais gostou? ");
		System.out.println("Opção 1 ou opção 2.");
		System.out.print("Digite o número desejado:");
		
		
		int escolha = sc.nextInt();
		System.out.println("-------------------------------------");
		switch (escolha) {
		case 1:
			 System.out.println("Você escolheu a casa número 1:");
			 System.out.println();
			 System.out.println(casa1);
			 System.out.printf("Valor R$%.2f" , casa1.getValor());
			 
			 System.out.println();
			 System.out.println("Para aceitar e continuar sua compra digite s para sim ou n para não. ");
			 
			 String simOuNao = sc.next();

				if (simOuNao.equals("s")) {
					
					cadastrarCliente();
					
				}else if (simOuNao.equals("n")) {
					
					System.out.println("Voltando para o menu inicial.");
					System.out.println();
					menu();
					
				}else {
				System.out.println("por favor insira um valor válido");
			}
			 
			 
		}
		
		
		
		
		
		
		
		
		
		
	}

	public void comprarAp() {
		
		System.out.println("Gostaria de itens adicionais? ");
		String simOuNao = sc.next();

		if (simOuNao.equals("s")) {
			
			System.out.println("Hoje estamos oferecendo  ");
			
		}else if (simOuNao.equals("n")) {
			
	}else {
		System.out.println("por favor insira um valor válido");
	}

	}

	public void terminar() {
	}

	public void cadastrarCliente() {
		System.out.println();
		System.out.println("Vamos fazer um breve cadastro!");
		System.out.println();
		System.out.print("Por favor digite seu nome: ");
		Cliente cliente = new Cliente();
		sc.nextLine();
		cliente.setNome(sc.nextLine());
		System.out.print("Por favor digite seu e-mail: ");
		cliente.setEmail(sc.next());
		System.out.println();
	}
	
	public void simOuNao() {
		String simOuNao = sc.next();

		if (simOuNao.equals("s")) {
			
			
		}else if (simOuNao.equals("n")) {
			
	}else {
		System.out.println("por favor insira um valor válido");
	}
		
	}
	
}
