package org.servidor.entities;

public class EstadoComandaEntity {
	
	private boolean estadoCocina;
	private boolean estadoCafeteria;
	private boolean estadoBarra;
	

	public boolean isEstadoCocina() {
		return estadoCocina;
	}
	public void setEstadoCocina(boolean estadoCocina) {
		this.estadoCocina = estadoCocina;
	}
	public boolean isEstadoCafeteria() {
		return estadoCafeteria;
	}
	public void setEstadoCafeteria(boolean estadoCafeteria) {
		this.estadoCafeteria = estadoCafeteria;
	}
	public boolean isEstadoBarra() {
		return estadoBarra;
	}
	public void setEstadoBarra(boolean estadoBarra) {
		this.estadoBarra = estadoBarra;
	}
	
	

}
