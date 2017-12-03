package org.servidor.entities;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class StockEmbeddeEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne(optional=false)
	@JoinColumn(name="idInsumo", nullable=false)
	private ProductoComestibleEntity idProducto;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="idAreaProduccion", nullable=false)
	private AreaProduccionEntity idArea;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="idLocal", nullable=false)
	private LocalEntity idLocal;

	public StockEmbeddeEntity() {
		// TODO Auto-generated constructor stub
	}

	public ProductoComestibleEntity getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(ProductoComestibleEntity idProducto) {
		this.idProducto = idProducto;
	}

	public AreaProduccionEntity getIdArea() {
		return idArea;
	}

	public void setIdArea(AreaProduccionEntity idArea) {
		this.idArea = idArea;
	}

	public LocalEntity getIdLocal() {
		return idLocal;
	}

	public void setIdLocal(LocalEntity idLocal) {
		this.idLocal = idLocal;
	}

}
