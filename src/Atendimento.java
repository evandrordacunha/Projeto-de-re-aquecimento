
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Atendimento {

	static ArrayList<Cliente> clientesNormais = new ArrayList<>();
	static ArrayList<Cliente> clientesPrioritarios = new ArrayList<>();
	static ArrayList<Caixa> caixas = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("Informe a quantidade de caixas a serem abertos:");
		Scanner sc = new Scanner(System.in);
		int nCaixas = sc.nextInt();
		// populando fila de caixas

		for (int i = 1; i <= nCaixas; i++) {
			Caixa caixa = new Caixa(i);
			caixas.add(caixa);
			System.out.println("Caixa: " + i + " está aberto! ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Informe a quantidade de clientes que deseja cadastrar: ");
		Scanner sc2 = new Scanner(System.in);
		int qtdCliente = sc2.nextInt();
		for (int i = 0; i < qtdCliente; i++) {
			System.out.println("Informe o nome do cliente: " + "\n");
			Scanner sc3 = new Scanner(System.in);
			String nome = sc3.nextLine();
			Scanner sc4 = new Scanner(System.in);
			System.out.println("Informe a idade: " + "\n");
			int idade = sc4.nextInt();
			Cliente c = new Cliente(nome, idade);
			if (c.getIdade() >= 65) {
				clientesPrioritarios.add(c);
			} else {
				clientesNormais.add(c);
			}
		}

		System.out.println("Clientes Prioritários: " + "\n");
		System.out.println(clientesPrioritarios.toString() + "\n");
		System.out.println("Clientes Normais: " + "\n");
		System.out.println(clientesNormais.toString() + "\n");
		atender();
	}

	private static void atender() {
/*		Atendimento prioritário 
*/		for (int i = 0; i < clientesPrioritarios.size(); i++) {
			for (int j = 0; j < caixas.size(); j++) {
				Caixa caixa = caixas.get(j);
				Cliente cliente = clientesPrioritarios.get(i);
				if (caixa.getNumero() <= 5 && caixa.getStatus() == Status.Disponivel) {
					caixa.setStatus(Status.Ocupado);
					System.out.println("Caixa Prioritário " + caixa.getNumero() + " atendendo " + " o cliente "
							+ cliente.getNome() + " Idade: " + cliente.getIdade());
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					clientesPrioritarios.remove(cliente);
					caixa.setStatus(Status.Disponivel);
				}
			}
		}
			/*Atendimento comum*/
			for (int i = 0; i < clientesNormais.size(); i++) {
				for (int j = 0; j < caixas.size(); j++) {
					Caixa caixa = caixas.get(j);
					Cliente cliente = clientesNormais.get(i);
					if (caixa.getNumero() > 5 && caixa.getStatus() == Status.Disponivel) {
						caixa.setStatus(Status.Ocupado);
						System.out.println("Caixa Comum " + caixa.getNumero() + " atendendo " + " o cliente "
								+ cliente.getNome() + " Idade: " + cliente.getIdade());
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						clientesNormais.remove(cliente);
						caixa.setStatus(Status.Disponivel);
					}
				}

			}
		}
	}

 
