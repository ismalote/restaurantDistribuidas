package org.servidor.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.servidor.negocio.EstadoComanda;

@Entity
@Table(name = "estadoComanda")
public class EstadoComandaEntity {

	@Id
	private Integer idComandaEstado;
	private boolean estadoCocina;
	private boolean estadoCafeteria;
	private boolean estadoBarra;

	public EstadoComandaEntity(EstadoComanda ec) {
		EstadoComandaEntity entity = new EstadoComandaEntity();
	}

	public EstadoComandaEntity() {
		// TODO Auto-generated constructor stub
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

	public Integer getIdComandaEstado() {
		return idComandaEstado;
	}

	public void setIdComandaEstado(Integer idMesaEstado) {
		this.idComandaEstado = idMesaEstado;
	}

}
