package org.servidor.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "depositoCentral")
public class DepositoCentralEntity {

	// verificar la clase stock

	@Id
	private Integer idDeposito;

	@OneToMany
	private List<ItemInsumoEntity> itemsInsumo;

	public DepositoCentralEntity() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdDeposito() {
		return idDeposito;
	}

	public void setIdDeposito(Integer idDeposito) {
		this.idDeposito = idDeposito;
	}

	public List<ItemInsumoEntity> getItemsStock() {
		return itemsInsumo;
	}

	public void setItemsStock(List<ItemInsumoEntity> itemsStock) {
		this.itemsInsumo = itemsStock;
	}

}
