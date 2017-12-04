package org.servidor.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "stock")
public class StockEntity {

	@EmbeddedId
//	@GeneratedValue(strategy= GenerationType.AUTO )
	private StockEmbeddeEntity idStock;
	
	private Integer cantidad;

	public StockEntity() {
		// TODO Auto-generated constructor stub
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
