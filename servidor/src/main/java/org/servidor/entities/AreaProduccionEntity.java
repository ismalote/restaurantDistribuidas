package org.servidor.entities;

import java.util.List;

public class AreaProduccionEntity {
	
		
	@Id
	@Column(name="IdAreaProdu")
	private Integer IdAreaProduccion;
	
	private String TipoArea;
	
	@OneToOne
	@JoinColumn(name="idEncargadoArea")
	private EncargadoAreaEntity encargadoArea;
	
	
	private StockEntity stock;
	
	@OneToMany
	@JoinColumn(mappedBy="comanda")
	private List<ComandaEntity> comandas;
	
	
	public AreaProduccionEntity(){}

	public AreaProduccionEntity(Integer nroArea, String tipo, EncargadoAreaDTO encargado, StockDTO stock, List<ComandaEntity> comandas){
		IdAreaProduccion= nroArea;
		TipoArea= tipo;
		encargadoArea= encargado;
		this.stock= stock;
		this.comandas= comandas;
			
	}
	
	public String getTipoArea() {
		return TipoArea;
	}

	public void setTipoArea(String tipoArea) {
		TipoArea = tipoArea;
	}

	public EncargadoAreaEntity getEncargadoArea() {
		return encargadoArea;
	}

	public void setEncargadoArea(EncargadoAreaEntity encargadoArea) {
		this.encargadoArea = encargadoArea;
	}

	public StockEntity getStock() {
		return stock;
	}

	public void setStock(StockEntity stock) {
		this.stock = stock;
	}

	public List<ComandaEntity> getComandas() {
		return comandas;
	}

	public void setComandas(List<ComandaEntity> comandas) {
		this.comandas = comandas;
	}

	// TODO faltan metodos, no puedo justificar la herencia, asi que le meti un
	// parametro tipoArea, en la cual dice que area es ya que por el momento no
	// tienen comportamiento diferente.

}
