package org.servidor.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public abstract class ProductoComestibleEntity extends InsumoEntity {

	@ManyToOne
	protected AreaProduccionEntity AreaProdu;

	protected Integer cantidadPedido;
	protected String descripcion;
	protected Integer stock;
	protected Integer puntoPedido;

	@ManyToMany
	protected List<PlatoEntity> platos;

	@ManyToOne
	private SemiElaboradoEntity semielaborado;

	public ProductoComestibleEntity() {
	}

	public ProductoComestibleEntity(Integer idInsumo, Float precio, Date fechaCreacion, Date fechaCaducidad,
			String descripcion, String unidad) {
		super(idInsumo, precio, fechaCreacion, fechaCaducidad, descripcion, unidad);
	}

	public AreaProduccionEntity getAreaProdu() {
		return AreaProdu;
	}

	public void setAreaProdu(AreaProduccionEntity areaProdu) {
		AreaProdu = areaProdu;
	}

	public Integer getCantidadPedido() {
		return cantidadPedido;
	}

	public void setCantidadPedido(Integer cantidadPedido) {
		this.cantidadPedido = cantidadPedido;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Integer getPuntoPedido() {
		return puntoPedido;
	}

	public void setPuntoPedido(Integer puntoPedido) {
		this.puntoPedido = puntoPedido;
	}

	public List<PlatoEntity> getPlatos() {
		return platos;
	}

	public void setPlatos(List<PlatoEntity> platos) {
		this.platos = platos;
	}

	public SemiElaboradoEntity getSemielaborado() {
		return semielaborado;
	}

	public void setSemielaborado(SemiElaboradoEntity semielaborado) {
		this.semielaborado = semielaborado;
	}

}
