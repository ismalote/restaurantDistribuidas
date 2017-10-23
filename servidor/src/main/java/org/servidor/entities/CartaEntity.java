package org.servidor.entities;

import java.util.List;

public class CartaEntity {
	
	@Id
	@Column(name="idCarta")
	private Integer idCarta;
	
	@OneToMany(mappedBy="itemCarta")
	private List<ItemCartaEntity> itemsCarta;
	
	public CartaEntity(){}
	
	public CartaEntity(Integer idCarta,List<ItemCartaEntity> items){
		this.idCarta= idCarta;
		this.itemsCarta= items;
	}

	public Integer getIdCarta() {
		return idCarta;
	}

	public void setIdCarta(Integer idCarta) {
		this.idCarta = idCarta;
	}

	public List<ItemCartaEntity> getItemsCarta() {
		return itemsCarta;
	}

	public void setItemsCarta(List<ItemCartaEntity> itemsCarta) {
		this.itemsCarta = itemsCarta;
	}

}
