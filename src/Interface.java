

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Interface extends JFrame{
 public static void main(String[] args) {
	 
	new Interface();
	
}
	public Interface() {
		super("TCH� BANK - Atendimento ao Cliente");
		//quando apertar no X fecha a janela
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(900,600); //tamanho da janela
	setVisible(true);//fa�o ela aparecer
	
	Container container = getContentPane();//CRIANDO CONTAINER
	container.setLayout(new FlowLayout()); //como bot�es se encaixam na tela
	
	
	
	 

}
}