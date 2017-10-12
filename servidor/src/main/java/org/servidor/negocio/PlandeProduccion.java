package org.servidor.negocio;

import java.util.Date;
import java.util.List;

import org.repositorio.dtos.ItemPlandeProduccionDTO;

public class PlandeProduccion {

	private Integer idPP;
	private List<ItemPlandeProduccionDTO> itemPP;
	private Date fecha;
	private Date tiempoDeEjecucion;

	public PlandeProduccion(Integer idPP, List<ItemPlandeProduccionDTO> itemPP, Date fecha, Date tiempoDeEjecucion) {
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

	public List<ItemPlandeProduccionDTO> getItemPP() {
		return itemPP;
	}

	public void setItemPP(List<ItemPlandeProduccionDTO> itemPP) {
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
