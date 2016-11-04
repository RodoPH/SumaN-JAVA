
package SumaN;

import javax.swing.JOptionPane;

public class Suma {

	public static void main(String[] args) {
		int numero;
		String[] operacion = { "+", "=" };
		ListaDina lista = new ListaDina();
		Nodo nodo = new Nodo();
		int elijeOpe;
		
		do {

			try {
				numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe un n�mero", "Suma", JOptionPane.QUESTION_MESSAGE));
				lista.InsertarDato(numero);
				System.out.println("Tama�o-->" + lista.dameTamano() +" n�mero:  ["+numero+"]");
				elijeOpe = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecciona: \n 1: + \n 2: = ", "Men�", 3));

				switch (elijeOpe) {
				case 1:
					
					break;
				
				case 2:
					JOptionPane.showMessageDialog(null,"Resultado: "+ lista.dameResultado(lista.dameTamano(), numero),"Resultado",JOptionPane.INFORMATION_MESSAGE);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opci�n no disponible", "Error", JOptionPane.ERROR_MESSAGE);
				}

			} catch (Exception e) {
				System.out.println("Error---> " + e.getMessage());
				elijeOpe = 0;
			}
		} while (elijeOpe != 2);

	}
}
