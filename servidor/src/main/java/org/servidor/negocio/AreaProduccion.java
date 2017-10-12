package org.servidor.negocio;

import java.util.List;

import org.repositorio.dtos.ComandaDTO;
import org.repositorio.dtos.EncargadoAreaDTO;
import org.repositorio.dtos.InsumoDTO;
import org.repositorio.dtos.PlatoDTO;
import org.repositorio.dtos.StockDTO;

public abstract class AreaProduccion {
	private String TipoArea;
	private EncargadoAreaDTO encargadoArea;
	private StockDTO stock;
	private List<ComandaDTO> comandas;

	public AreaProduccion(String tipoArea, EncargadoAreaDTO encargadoArea, StockDTO stock, List<ComandaDTO> comandas) {
		super();
		TipoArea = tipoArea;
		this.encargadoArea = encargadoArea;
		this.stock = stock;
		this.comandas = comandas;
	}

	public void solicitarADeposito(List<InsumoDTO> insumos) {

	}

	public abstract boolean prepararComanda(ComandaDTO comanda);

	public List<PlatoDTO> pedidoListo(ComandaDTO comanda) {
		return null;
	}

	public String getTipoArea() {
		return TipoArea;
	}

	public void setTipoArea(String tipoArea) {
		TipoArea = tipoArea;
	}

	public EncargadoAreaDTO getEncargadoArea() {
		return encargadoArea;
	}

	public void setEncargadoArea(EncargadoAreaDTO encargadoArea) {
		this.encargadoArea = encargadoArea;
	}

	public StockDTO getStock() {
		return stock;
	}

	public void setStock(StockDTO stock) {
		this.stock = stock;
	}

	public List<ComandaDTO> getComandas() {
		return comandas;
	}

	public void setComandas(List<ComandaDTO> comandas) {
		this.comandas = comandas;
	}

	// TODO faltan metodos, no puedo justificar la herencia, asi que le meti un
	// parametro tipoArea, en la cual dice que area es ya que por el momento no
	// tienen comportamiento diferente.

}
