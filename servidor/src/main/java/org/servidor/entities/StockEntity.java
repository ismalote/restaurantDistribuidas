package org.servidor.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "stock")
public class StockEntity {

	@EmbeddedId
	private StockEmbeddeEntity idStock;
	private Integer cantidad;

	public StockEntity() {
	}

	public StockEmbeddeEntity getIdStock() {
		return idStock;
	}

	public void setIdStock(StockEmbeddeEntity idStock) {
		this.idStock = idStock;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

}
