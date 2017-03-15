

import java.sql.NClob;
import java.util.ArrayList;

public class Fila {
	ArrayList<Caixa> caixas;
	ArrayList<Cliente>clientes;
	private static int quantidadeCaixas =0;
	private static Fila cadFilas = null;
	
	//status true = livre / false = ocupado
	public Fila(int nCaixas) {
		
		caixas = new ArrayList<Caixa>();
		for(int i = 1; i <=nCaixas;i++){
			Caixa c = new Caixa(i, "Livre");
			caixas.add(c);
		}
		quantidadeCaixas = quantidadeCaixas+nCaixas;
		clientes = new ArrayList<Cliente>();
	}
	public static Fila getInstance() {
		if (cadFilas == null) {
			cadFilas = new Fila(quantidadeCaixas);
		}
		return cadFilas;
		}	

  public void addCaixa(Caixa c) {
	caixas.add(c);
}	
  public void addCliente(Cliente c){
	  clientes.add(c);
  }
  public void removeCaixa(Caixa c){
	  for(int i = 0; i <caixas.size();i++){
		  if(caixas.get(i).equals(c)){
			  caixas.remove(c);
		  }
	  }
  }
  private void removeCliente(Cliente c) {
	for (int i = 0; i < clientes.size(); i++) {
		if(clientes.get(i).equals(c)){
			clientes.remove(c);
		}
	}

}

public ArrayList<Caixa> getCaixas() {
	return caixas;
}

public void setCaixas(ArrayList<Caixa> caixas) {
	this.caixas = caixas;
}

public ArrayList<Cliente> getClientes() {
	return clientes;
}

public void setClientes(ArrayList<Cliente> clientes) {
	this.clientes = clientes;
}
@Override
public String toString() {
	return "Fila [caixas=" + caixas + ", clientes=" + clientes + "]";
}



	
}