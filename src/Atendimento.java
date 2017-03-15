

import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Atendimento {

	static Fila f;
	
	public static void main(String[] args) {
		System.out.println("Informe a quantidade de caixas disponiveis:");
		Scanner sc = new Scanner(System.in);
		int caixas = sc.nextInt();
		f  = new Fila(caixas);
		//populando fila de caixas
	
		System.out.println(f.getCaixas().toString());
		
		System.out.println("Informe a quantidade de clientes que deseja cadastrar: ");
		int  qtdCliente = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);
		for(int i = 0; i < qtdCliente;i++){
			System.out.println("Informe o nome do cliente: ");
			String nome = sc2.nextLine();
			Scanner sc3 = new Scanner(System.in);
			System.out.println("Informe a idade: ");
			int idade = sc3.nextInt();
			Cliente c = new Cliente(nome, idade);
			f.getClientes().add(c);
		}
		
		System.out.println("Clientes: ");
		System.out.println("\n"+f.getClientes().toString());
		//System.out.println("Tamanho fila: "+f.getClientes().size());
		for(int i = 0; i <f.getClientes().size();i++){
			//f.getCaixas().get(i).atender(f.getClientes(), f.getClientes().get(i));
			f.getCaixas().get(i).atender(f.getClientes(),f.getCaixas());
			
		}

	}

}

