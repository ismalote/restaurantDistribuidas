package org.servidor.negocio;

import java.util.List;

import org.repositorio.dtos.AreaDTO;
import org.repositorio.dtos.CartaDTO;
import org.repositorio.dtos.DepositoDTO;
import org.repositorio.dtos.EncargadoDTO;
import org.repositorio.dtos.ListadoComprasDTO;
import org.repositorio.dtos.MozoDTO;
import org.repositorio.dtos.SalonDTO;

public class Local {

	private List<EncargadoDTO> encargadosAreas;
	private List<MozoDTO> mozos;
	private SalonDTO salon;
	private DepositoDTO deposito;
	private List<AreaDTO> areas;
	private CartaDTO carta;
	private List<ListadoComprasDTO> listadosCompras;

	public Local(List<EncargadoDTO> encargadosAreas, List<MozoDTO> mozos, SalonDTO salon, DepositoDTO deposito,
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
