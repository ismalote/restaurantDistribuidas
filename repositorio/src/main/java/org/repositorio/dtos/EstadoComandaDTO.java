package org.repositorio.dtos;

import java.io.Serializable;

public class EstadoComandaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 789057936644448278L;
	private Integer idEstadoComanda;
	private boolean estadoCocina;
	private boolean estadoCafeteria;
	private boolean estadoBarra;
	private ComandaDTO comanda;

	public EstadoComandaDTO(boolean estadoCocina, boolean estadoCafeteria, boolean estadoBarra) {
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

	public Integer getIdEstadoComanda() {
		return idEstadoComanda;
	}

	public void setIdEstadoComanda(Integer idEstadoComanda) {
		this.idEstadoComanda = idEstadoComanda;
	}

	public ComandaDTO getComanda() {
		return comanda;
	}

	public void setComanda(ComandaDTO comanda) {
		this.comanda = comanda;
	}

}
