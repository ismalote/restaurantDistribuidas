package org.servidor.entities;

import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.servidor.negocio.Comanda;

public class EstadoComandaEntity {

	@Id
	private Integer idMesaEstado;
	private boolean estadoCocina;
	private boolean estadoCafeteria;
	private boolean estadoBarra;
	@OneToOne(mappedBy = "comanda")
	private Comanda comanda;

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

	public Integer getIdMesaEstado() {
		return idMesaEstado;
	}

	public void setIdMesaEstado(Integer idMesaEstado) {
		this.idMesaEstado = idMesaEstado;
	}

}
