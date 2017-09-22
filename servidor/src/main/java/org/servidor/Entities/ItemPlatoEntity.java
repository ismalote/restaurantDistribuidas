package org.servidor.Negocio;

public class ItemPlato {

		private Plato plato;
		private Integer cantidad;
		private double montoSubtotal;
		
		public ItemPlato(Plato plato, Integer cantidad, double montoSubtotal) {
			super();
			this.plato = plato;
			this.cantidad = cantidad;
			this.montoSubtotal = montoSubtotal;
		}

		public Plato getPlato() {
			return plato;
		}

		public void setPlato(Plato plato) {
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
