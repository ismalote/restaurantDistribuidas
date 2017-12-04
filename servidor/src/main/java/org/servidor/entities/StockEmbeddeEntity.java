package org.servidor.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Embeddable
public class StockEmbeddeEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne(optional=false)
	@JoinColumn(name="idInsumo", nullable=false)
	private ProductoComestibleEntity idProducto;
//	private Integer idProducto;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="tipoArea", nullable=false)
	private AreaProduccionEntity tipoArea;
//	private Integer tipoArea;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="idLocal", nullable=false)
	private LocalEntity idLocal;
//	private Integer idLocal;

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
		return tipoArea;
	}

	public void setIdArea(AreaProduccionEntity idArea) {
		this.tipoArea = idArea;
	}

	public LocalEntity getIdLocal() {
		return idLocal;
	}

	public void setIdLocal(LocalEntity idLocal) {
		this.idLocal = idLocal;
	}

}
