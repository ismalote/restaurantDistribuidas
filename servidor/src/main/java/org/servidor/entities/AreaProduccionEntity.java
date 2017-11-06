package org.servidor.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;;

@Entity
@Table (name="areaProduccion")
public class AreaProduccionEntity extends AreaEntity {

	@OneToMany(mappedBy = "AreaProdu")
	protected List<ProductoComestibleEntity> productos;

	protected String TipoArea;
	@OneToOne
	@JoinColumn(name = "idEncargado")
	protected EncargadoEntity encargado;

	@OneToMany(mappedBy = "comanda")
	protected List<ComandaEntity> comandas;

	public AreaProduccionEntity(Integer idAreaProduccion, List<ProductoComestibleEntity> productos, String tipoArea,
			EncargadoEntity encargado, List<ComandaEntity> comandas) {
		super(idAreaProduccion);

		this.productos = productos;
		TipoArea = tipoArea;
		this.encargado = encargado;
		this.comandas = comandas;
	}

	public List<ProductoComestibleEntity> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoComestibleEntity> productos) {
		this.productos = productos;
	}

	public String getTipoArea() {
		return TipoArea;
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

	public List<ComandaEntity> getComandas() {
		return comandas;
	}

	public void setComandas(List<ComandaEntity> comandas) {
		this.comandas = comandas;
	}

}
