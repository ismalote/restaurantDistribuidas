package org.servidor.entities;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;;

@Entity
@DiscriminatorValue("areaProduccion")
public class AreaProduccionEntity extends AreaEntity {

	@OneToMany(mappedBy = "AreaProdu")
	protected List<ProductoComestibleEntity> productos;

	protected String TipoArea;
	@OneToOne
	@JoinColumn(name = "idEncargado")
	protected EncargadoEntity encargado;

//	@OneToMany(mappedBy = "areaProduccion")
//	protected List<ComandaEntity> comandas;



	public List<ProductoComestibleEntity> getProductos() {
		return productos;
	}

	public AreaProduccionEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setProductos(List<ProductoComestibleEntity> productos) {
		this.productos = productos;
	}

	public String getTipoArea() {
		return TipoArea;
	}

	public AreaProduccionEntity(Integer idArea, LocalEntity localRestaurante) {
		super(idArea, localRestaurante);
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

//	public List<ComandaEntity> getComandas() {
//		return comandas;
//	}

//	public void setComandas(List<ComandaEntity> comandas) {
//		this.comandas = comandas;
//	}

}
