package org.servidor.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.servidor.negocio.Comanda;

@Entity
@Table(name="estadoComanda")
public class EstadoComandaEntity {

	@Id
	private Integer idComandaEstado;
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

	public Integer getIdComandaEstado() {
		return idComandaEstado;
	}

	public void setIdComandaEstado(Integer idMesaEstado) {
		this.idComandaEstado = idMesaEstado;
	}

}
