package org.servidor.entities;

import java.util.Date;
import java.util.List;

public class PlandeProduccionEntity {

		private Integer idPP;
		private List<ItemPlandeProduccionEntity> itemPP;
		private Date fecha;
		private Date tiempoDeEjecucion;
		
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
