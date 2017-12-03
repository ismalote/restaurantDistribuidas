package org.servidor.entities;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Embeddable
@Access(AccessType.PROPERTY)
public class StockEmbeddeEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToMany
	private ProductoComestibleEntity idProducto;
	@ManyToMany
	private AreaProduccionEntity idArea;
	@ManyToMany
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
