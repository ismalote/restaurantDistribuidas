package org.servidor.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.servidor.negocio.ProductoComestible;
import org.servidor.negocio.ProductoSimple;

@Entity
@Table(name = "productoSimple")
@PrimaryKeyJoinColumn(name = "idInsumo")
public class ProductoSimpleEntity extends ProductoComestibleEntity {

	public ProductoSimpleEntity() {
		super();
	}

	public ProductoSimpleEntity(Integer idInsumo, Float precio, Date fechaCreacion, Date fechaCaducidad,
			String descripcion, String unidad, Integer cantidadPedido, Integer puntoPedido) {
		super(idInsumo, precio, fechaCreacion, fechaCaducidad, descripcion, unidad, cantidadPedido, puntoPedido);
	}

	@Override
	public ProductoComestible getNegocio() {
		return new ProductoSimple(this.idInsumo, this.cantidadPedido, this.puntoPedido, this.descripcion, null, this.precio);
	}

}
