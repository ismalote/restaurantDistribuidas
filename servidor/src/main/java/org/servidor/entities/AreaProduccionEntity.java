package org.servidor.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.servidor.negocio.AreaProduccion;;

@Entity
@Table(name = "areaProduccion")
public class AreaProduccionEntity {

	@Id
	private Integer idAreaProducion;

	@OneToMany(mappedBy = "AreaProdu")
	protected List<ProductoComestibleEntity> productos;

	protected String TipoArea;
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

	public String getTipoArea() {
		return TipoArea;
	}

	public AreaProduccionEntity(Integer idArea, LocalEntity localRestaurante) {
		// TODO Auto-generated constructor stub
	}

	public AreaProduccionEntity(AreaProduccion area) {
		// TODO Auto-generated constructor stub
	}

	public void setTipoArea(String tipoArea) {
		TipoArea = tipoArea;
	}

	public EncargadoEntity getEncargado() {
		return encargado;
	}

	public void setEncargado(EncargadoEntity encargado) {
		this.encargado = encargado;
	}

	// public List<ComandaEntity> getComandas() {
	// return comandas;
	// }

	// public void setComandas(List<ComandaEntity> comandas) {
	// this.comandas = comandas;
	// }

}
