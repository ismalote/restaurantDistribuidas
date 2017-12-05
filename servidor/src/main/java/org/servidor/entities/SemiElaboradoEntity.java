package org.servidor.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.servidor.dao.ProductoComestibleDAO;
import org.servidor.negocio.ProductoComestible;
import org.servidor.negocio.SemiElaborado;

@Entity
@Table(name = "semiElaborado")
@PrimaryKeyJoinColumn(name = "idInsumo")
public class SemiElaboradoEntity extends ProductoComestibleEntity {

	@OneToMany
	private List<ProductoComestibleEntity> materiales;

	public SemiElaboradoEntity(Integer idInsumo, Float precio, Date fechaCreacion, Date fechaCaducidad,
			String descripcion, String unidad, Integer cantidadPedido, Integer puntoPedido) {
		super(idInsumo, precio, fechaCreacion, fechaCaducidad, descripcion, unidad, cantidadPedido, puntoPedido);
	}

	public SemiElaboradoEntity() {
	}

	@Override
	public ProductoComestible getNegocio() {
		List<ProductoComestible> p = new ArrayList<ProductoComestible>();
		for (ProductoComestibleEntity productoComestibleEntity : materiales) {
			ProductoComestible negocio = ProductoComestibleDAO.getInstancia().toNegocio(productoComestibleEntity);
			p.add(negocio);
		}
		return new SemiElaborado(p);
	}
}
