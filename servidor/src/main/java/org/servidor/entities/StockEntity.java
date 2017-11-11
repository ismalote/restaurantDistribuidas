package org.servidor.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "stock")
public class StockEntity {

	@Id
	private Integer idStock;

	 @OneToMany(mappedBy = "stock")
	 private List<ItemStockEntity> itemsStock;

	// @Id
	// @Column(name = "IdInsumo")
	// private Integer idInsumo;

	public StockEntity(Integer idStock,
			List<ItemStockEntity> itemsStock /* , Integer idInsumo */) {
		super();
		this.idStock = idStock;
		// this.itemsStock = itemsStock;
		// this.idInsumo = idInsumo;
	}

	public StockEntity() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdStock() {
		return idStock;
	}

	public void setIdStock(Integer idStock) {
		this.idStock = idStock;
	}

	// public List<ItemStockEntity> getItemsStock() {
	// return itemsStock;
	// }

	// public void setItemsStock(List<ItemStockEntity> itemsStock) {
	// this.itemsStock = itemsStock;
	// }

	// public Integer getIdInsumo() {
	// return idInsumo;
	// }

	// public void setIdInsumo(Integer idInsumo) {
	// this.idInsumo = idInsumo;
	// }

	// TODO faltan metodos

}
