package numbs1alN;

import javax.swing.JOptionPane;

public class Numeros1alN {

	public static void main(String[] args) {
		
		int numero;
		
		numero=Integer.parseInt(JOptionPane.showInputDialog("Digita un n�mero"));
		
		for(int i=1; i<=numero; i++) {
			System.out.println(i);
		}

	}

}
