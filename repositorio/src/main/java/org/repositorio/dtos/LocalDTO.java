package org.repositorio.dtos;

import java.io.Serializable;
import java.util.List;

public class LocalDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 267457852726575377L;
	private List<EncargadoDTO> encargadosAreas;
	private List<MozoDTO> mozos;
	private List<MesaDTO> mesas;
	private DepositoDTO deposito;
	private List<AreaProduccionDTO> areas;
	private CartaDTO carta;
	private List<ListadoComprasDTO> listadosCompras;

	public List<EncargadoDTO> getEncargadosAreas() {
		return encargadosAreas;
	}

	public void setEncargadosAreas(List<EncargadoDTO> encargadosAreas) {
		this.encargadosAreas = encargadosAreas;
	}

	public List<MozoDTO> getMozos() {
		return mozos;
	}

	public void setMozos(List<MozoDTO> mozos) {
		this.mozos = mozos;
	}

	public DepositoDTO getDeposito() {
		return deposito;
	}

	public void setDeposito(DepositoDTO deposito) {
		this.deposito = deposito;
	}

	public List<AreaProduccionDTO> getAreas() {
		return areas;
	}

	public void setAreas(List<AreaProduccionDTO> areas) {
		this.areas = areas;
	}

	public CartaDTO getCarta() {
		return carta;
	}

	public void setCarta(CartaDTO carta) {
		this.carta = carta;
	}

	public List<ListadoComprasDTO> getListadosCompras() {
		return listadosCompras;
	}

	public void setListadosCompras(List<ListadoComprasDTO> listadosCompras) {
		this.listadosCompras = listadosCompras;
	}

	public List<MesaDTO> getMesas() {
		return mesas;
	}

	public void setMesas(List<MesaDTO> mesas) {
		this.mesas = mesas;
	}

	// TODO faltan metodos

}
