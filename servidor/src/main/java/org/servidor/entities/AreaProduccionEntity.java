package org.servidor.entities;

import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.servidor.negocio.AreaProduccion;;

@Entity
@Table(name = "areaProduccion")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING)
public class AreaProduccionEntity {

	@Id
	private Integer idAreaProducion;

	@OneToMany(mappedBy = "AreaProdu")
	protected List<ProductoComestibleEntity> productos;

	@OneToOne
	@JoinColumn(name = "idEncargado")
	protected EncargadoEntity encargado;

	@ManyToOne
	protected LocalEntity localRestaurante;
	// @OneToMany(mappedBy = "areaProduccion")
	// protected List<ComandaEntity> comandas;

	public List<ProductoComestibleEntity> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoComestibleEntity> productos) {
		this.productos = productos;
	}

	public AreaProduccionEntity(Integer idAreaProducion, List<ProductoComestibleEntity> productos,
			EncargadoEntity encargado, LocalEntity localRestaurante) {
		super();
		this.idAreaProducion = idAreaProducion;
		this.productos = productos;
		this.encargado = encargado;
		this.localRestaurante = localRestaurante;
	}

	public AreaProduccionEntity(AreaProduccion area) {
		// TODO Auto-generated constructor stub
	}

	public EncargadoEntity getEncargado() {
		return encargado;
	}

	public void setEncargado(EncargadoEntity encargado) {
		this.encargado = encargado;
	}

}
