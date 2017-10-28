package org.servidor.entities;

import java.util.List;

import javax.persistence.OneToMany;

public class SemiElaboradoEntity extends ProductoComestibleEntity {

	@OneToMany(mappedBy = "department")
	private List<ProductoComestibleEntity> materiales;

	public SemiElaboradoEntity(Integer idProducto, AreaProduccionEntity areaProdu, Integer cantidadPedido,
			String descripcion, Integer stock, Integer puntoPedido, Float precio, List<PlatoEntity> platos) {
		super(idProducto, areaProdu, cantidadPedido, descripcion, stock, puntoPedido, precio, platos);
		// TODO Auto-generated constructor stub
	}

	public List<ProductoComestibleEntity> getMateriales() {
		return materiales;
	}

	public void setMateriales(List<ProductoComestibleEntity> materiales) {
		this.materiales = materiales;
	}

}
