package org.servidor.entities;

public class ItemPlatoEntity {

		private PlatoEntity plato;
		private Integer cantidad;
		private double montoSubtotal;
		
		public PlatoEntity getPlato() {
			return plato;
		}
		public void setPlato(PlatoEntity plato) {
			this.plato = plato;
		}
		public Integer getCantidad() {
			return cantidad;
		}
		public void setCantidad(Integer cantidad) {
			this.cantidad = cantidad;
		}
		public double getMontoSubtotal() {
			return montoSubtotal;
		}
		public void setMontoSubtotal(double montoSubtotal) {
			this.montoSubtotal = montoSubtotal;
		}
	
		
	
	
}
