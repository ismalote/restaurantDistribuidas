package org.repositorio.dtos;

import java.util.List;

public class LocalDTO {

	private List<EncargadoDTO> encargadosAreas;
	private List<MozoDTO> mozos;
	private SalonDTO salon;
	private DepositoDTO deposito;
	private List<AreaDTO> areas;
	private CartaDTO carta;
	private List<ListadoComprasDTO> listadosCompras;

	public LocalDTO(List<EncargadoDTO> encargadosAreas, List<MozoDTO> mozos, SalonDTO salon, DepositoDTO deposito,
			List<AreaDTO> areas, CartaDTO carta, List<ListadoComprasDTO> listadosCompras) {
		super();
		this.encargadosAreas = encargadosAreas;
		this.mozos = mozos;
		this.salon = salon;
		this.deposito = deposito;
		this.areas = areas;
		this.carta = carta;
		this.listadosCompras = listadosCompras;
	}

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

	public SalonDTO getSalon() {
		return salon;
	}

	public void setSalon(SalonDTO salon) {
		this.salon = salon;
	}

	public DepositoDTO getDeposito() {
		return deposito;
	}

	public void setDeposito(DepositoDTO deposito) {
		this.deposito = deposito;
	}

	public List<AreaDTO> getAreas() {
		return areas;
	}

	public void setAreas(List<AreaDTO> areas) {
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

	// TODO faltan metodos

}
