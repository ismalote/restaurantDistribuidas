package org.repositorio.dtos;

import java.io.Serializable;
import java.util.List;

public class AbrirMesaDTO implements Serializable{

	
	private static final long serialVersionUID = 1L;
	public AbrirMesaDTO() {
		// TODO Auto-generated constructor stub
	}
	List<Integer> numerodeMesa;
	
	public List<Integer> getNumerodeMesa() {
		return numerodeMesa;
	}
	public void setNumerodeMesa(List<Integer> numerodeMesa) {
		this.numerodeMesa = numerodeMesa;
	}
	
	
}
