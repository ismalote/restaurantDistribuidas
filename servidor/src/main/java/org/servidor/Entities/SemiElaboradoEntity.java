package org.servidor.Negocio;

import java.util.List;

public class SemiElaborado extends ProductoComestible {

	
		private List<MateriaPrima> materiales;

		public SemiElaborado() {
			super(area, estimadoStock);
			// TODO Auto-generated constructor stub
		}
		

		public List<MateriaPrima> getMateriales() {
			return materiales;
		}

		public void setMateriales(List<MateriaPrima> materiales) {
			this.materiales = materiales;
		}
		
		
	
		
	
	
	
	

}
