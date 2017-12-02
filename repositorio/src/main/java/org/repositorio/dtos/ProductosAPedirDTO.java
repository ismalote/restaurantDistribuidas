package org.repositorio.dtos;

import java.io.Serializable;

public class ProductosAPedirDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -156561835293452117L;
	private Integer idProd;
	private Integer stock;
	private String nombreProd;


	public ProductosAPedirDTO(Integer idPlato, String nombrePlato, Integer stock) {
		super();
		this.idProd = idPlato;
		this.stock = stock;
		this.nombreProd = nombrePlato;
	}
	
	public ProductosAPedirDTO(){
	}


	public String getNombreProd() {
		return nombreProd;
	}

	public void setNombreProd(String nombrePlato) {
		this.nombreProd = nombrePlato;
	}

	public Integer getIdProd() {
		return idProd;
	}

	public void setIdProd(Integer idPlato) {
		this.idProd = idPlato;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}


}