package org.servidor.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "planProduccion")
public class PlandeProduccionEntity {

	@Id
	private Integer idPP;

	@OneToMany(mappedBy = "pp")
	private List<ItemPlandeProduccionEntity> itemPP;

	@ManyToOne
	private AdministracionEntity administracion;

	private Date fecha;
	private Date tiempoDeEjecucion;

	public PlandeProduccionEntity() {
		// TODO Auto-generated constructor stub
	}

	public PlandeProduccionEntity(Integer idPP, List<ItemPlandeProduccionEntity> itemPP, Date fecha,
			Date tiempoDeEjecucion) {
		super();
		this.idPP = idPP;
		this.itemPP = itemPP;
		this.fecha = fecha;
		this.tiempoDeEjecucion = tiempoDeEjecucion;
	}

	public Integer getIdPP() {
		return idPP;
	}

	public void setIdPP(Integer idPP) {
		this.idPP = idPP;
	}

	public List<ItemPlandeProduccionEntity> getItemPP() {
		return itemPP;
	}

	public void setItemPP(List<ItemPlandeProduccionEntity> itemPP) {
		this.itemPP = itemPP;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getTiempoDeEjecucion() {
		return tiempoDeEjecucion;
	}

	public void setTiempoDeEjecucion(Date tiempoDeEjecucion) {
		this.tiempoDeEjecucion = tiempoDeEjecucion;
	}

	// TODO faltan metodos

}
