

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Interface extends JFrame{
 public static void main(String[] args) {
	 
	new Interface();
	
}
	public Interface() {
		super("TCHÊ BANK - Atendimento ao Cliente");
		//quando apertar no X fecha a janela
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(900,600); //tamanho da janela
	setVisible(true);//faço ela aparecer
	
	Container container = getContentPane();//CRIANDO CONTAINER
	container.setLayout(new FlowLayout()); //como botões se encaixam na tela
	
	
	
	 

}
}