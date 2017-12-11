package org.repositorio.dtos;

import java.io.Serializable;
import java.util.List;

public class AbrirMesaDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	public AbrirMesaDTO() {
	}

	private List<Integer> numerodeMesa;

	private Integer cantComensales;

	public List<Integer> getNumerodeMesa() {
		return numerodeMesa;
	}

	public void setNumerodeMesa(List<Integer> numerodeMesa) {
		this.numerodeMesa = numerodeMesa;
	}

	public Integer getCantComensales() {
		return cantComensales;
	}

	public void setCantComensales(Integer cantComensales) {
		this.cantComensales = cantComensales;
	}

}
