import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.plaf.SliderUI;

public class Caixa {

	private int numero;
	Status status;

	/**
	 * @param numero
	 * @param status
	 */
	public Caixa(int numero) {
		super();
		this.numero = numero;
		this.status = status.Disponivel;
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
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Caixa: " + getNumero() + "   " + " Status: " + getStatus() + " \n ";
	}
}
