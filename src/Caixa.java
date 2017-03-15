import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.plaf.SliderUI;

public class Caixa {

	private int numero;
	private String status = "Em atendimento";
	ArrayList<Cliente> atendimentos;

	/**
	 * @param numero
	 * @param status
	 */
	public Caixa(int numero, String status) {
		super();
		this.numero = numero;
		this.status = "Livre";
		atendimentos = new ArrayList<>();
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero
	 *            the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	public ArrayList<Cliente> getAtendimentos() {
		return atendimentos;
	}

	public void setAtendimentos(ArrayList<Cliente> atendimentos) {
		this.atendimentos = atendimentos;
	}

	/**
	 * @param status
	 *            the status to set
	 */

	public void atender(ArrayList<Cliente> f,ArrayList<Caixa> c) {
		for (int i = 0; i < f.size(); i++) {
			if (f.get(i).getIdade() >= 65) {
				if ((getNumero() > 0 || getNumero() <= 5) && (getStatus() == "Livre")) {
					atendimentos.add(f.get(i));
					f.remove(f.get(i));
					cronometrarAtendimento(c.get(i));
				}
			} else {
				if (getNumero()>5 && getStatus() == "Livre") {
					cronometrarAtendimento(c.get(i));
					atendimentos.add(f.get(i));
					f.remove(f.get(i));
				}
			}
		}
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void  cronometrarAtendimento(Caixa c) {
		c.setStatus("Em atendimento");
		System.out.print("Caixa: "+c.getNumero()+" - ");
		System.out.println("Status: "+c.getStatus());
		
		try {
			Thread.sleep(4000);
			c.setStatus("Livre");
			System.out.print("Caixa: "+c.getNumero()+" - ");
			System.out.println("Status: "+c.getStatus());
			
		} catch (Exception e) {
			// TODO: handle exception
		}


	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Caixa: " + getNumero() + " - " + "Status: " + getStatus() + "\n";
	}
}
