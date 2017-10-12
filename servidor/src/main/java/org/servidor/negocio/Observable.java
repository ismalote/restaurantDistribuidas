package org.servidor.negocio;

import java.util.List;

public class Observable {

	private List<Observer> observer;

	public void removeObserver(Observer o) {
		this.observer.remove(o);
	}

	public void notifyAll(ListadoCompras listadoCompras) {
		for (Observer observer : observer) {
			observer.notificarListadoDeCompras(listadoCompras);
		}
	}
}
