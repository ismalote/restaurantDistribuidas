package org.servidor.entities;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("deposito")
@Table(name = "deposito")
public class DepositoEntity {

	@Id
	private Integer idDeposito;

	@OneToMany(mappedBy = "stock")
	private List<ItemInsumoEntity> itemsStock;

	@OneToOne
	@JoinColumn(name = "idEncargado")
	private EncargadoAreaEntity encargadoDeposito;

	public DepositoEntity() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdDeposito() {
		return idDeposito;
	}

	public void setIdDeposito(Integer idDeposito) {
		this.idDeposito = idDeposito;
	}

	public List<ItemInsumoEntity> getItemsStock() {
		return itemsStock;
	}

	public void setItemsStock(List<ItemInsumoEntity> itemsStock) {
		this.itemsStock = itemsStock;
	}

	public EncargadoAreaEntity getEncargadoDeposito() {
		return encargadoDeposito;
	}

	public void setEncargadoDeposito(EncargadoAreaEntity encargadoDeposito) {
		this.encargadoDeposito = encargadoDeposito;
	}

}
