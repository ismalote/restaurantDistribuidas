package org.servidor.negocio;

public class EstadoComanda {

	private boolean estadoCocina;
	private boolean estadoCafeteria;
	private boolean estadoBarra;
	private Comanda comanda;
	private Integer id;

	public EstadoComanda(boolean estadoCocina, boolean estadoCafeteria, boolean estadoBarra) {
		super();
		this.estadoCocina = estadoCocina;
		this.estadoCafeteria = estadoCafeteria;
		this.estadoBarra = estadoBarra;
		
	}

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

	public Comanda getComanda() {
		return comanda;
	}

	public void setComanda(Comanda comanda) {
		this.comanda = comanda;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
