package SumaN;

import SumaN.Nodo;

public class ListaDina {
	private Nodo primero, fin, nuevo;
	private int resultado;
	private int tamano;

	public ListaDina() {
		primero = fin = null;
		tamano = 0;
	}

	public int dameTamano() {
		return tamano;
	}

	public void InsertarDato(int info) {
		if (ListaVacia()) {
			primero = new Nodo(info);

		} else {
			nuevo = new Nodo(info);
			nuevo.setEnlace(primero);
			primero = nuevo;
		}
		tamano++;
	}

	public int dameResultado(int tamano, int num) {

		if (tamano == 0 ) {	
				return 0;
			}else{
				Nodo aux= primero;
				if(aux != null){
				aux = aux.dameEnlace();	
				resultado = aux.dameDato() + num;
				dameResultado(tamano-1, primero.dameDato());
				}
				
				}
		
		return resultado;
	}

	public boolean ListaVacia() {
		return (primero == null) ? true : false;
	}
}
