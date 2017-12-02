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
	private Integer idAreaProduccion;

	@OneToMany(mappedBy = "AreaProdu")
	protected List<ProductoComestibleEntity> productos;

	@OneToOne
	@JoinColumn(name = "idEncargado")
	protected OperadorEntity encargado;

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

	public AreaProduccionEntity(Integer idAreaProduccion, List<ProductoComestibleEntity> productos,
			OperadorEntity encargado, LocalEntity localRestaurante) {
		super();
		this.idAreaProduccion = idAreaProduccion;
		this.productos = productos;
		this.encargado = encargado;
		this.localRestaurante = localRestaurante;
	}

	public AreaProduccionEntity(AreaProduccion area) {
		// TODO Auto-generated constructor stub
	}

	public OperadorEntity getEncargado() {
		return encargado;
	}

	public void setEncargado(OperadorEntity encargado) {
		this.encargado = encargado;
	}

	public Integer getIdAreaProduccion() {
		return idAreaProduccion;
	}

	public void setIdAreaProduccion(Integer idAreaProduccion) {
		this.idAreaProduccion = idAreaProduccion;
	}

	public LocalEntity getLocalRestaurante() {
		return localRestaurante;
	}

	public void setLocalRestaurante(LocalEntity localRestaurante) {
		this.localRestaurante = localRestaurante;
	}

}
