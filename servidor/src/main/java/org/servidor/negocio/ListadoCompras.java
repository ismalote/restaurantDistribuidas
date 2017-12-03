package org.servidor.negocio;

import java.util.List;

import org.repositorio.dtos.ListadoComprasDTO;
import org.servidor.Enum.EstadoPedidoCompra;
import org.servidor.Enum.TipoArea;
import org.servidor.dao.ListadoCompraDAO;

public class ListadoCompras {

	private Integer idListadoCompras;
	private TipoArea areaSolicitante;
	private List<ItemListado> insumos;
	private EstadoPedidoCompra estado;

	public ListadoCompras(Integer idListadoCompras, TipoArea areaSolicitante) {
		super();
		this.idListadoCompras = idListadoCompras;
		this.areaSolicitante = areaSolicitante;
	}
	
	public ListadoCompras(Integer idListadoCompras, TipoArea areaSolicitante, List<ItemListado> insumos, EstadoPedidoCompra estado) {
		super();
		this.idListadoCompras = idListadoCompras;
		this.areaSolicitante = areaSolicitante;
		this.insumos = insumos;
		this.estado = estado;
	}
	

	public ListadoCompras(TipoArea areaSolicitante, List<ItemListado> insumos, EstadoPedidoCompra estado) {
		super();
		this.areaSolicitante = areaSolicitante;
		this.insumos = insumos;
		this.estado = estado;
	}

	public ListadoCompras(){
		
	}
	
	public Integer getIdListadoCompras() {
		return idListadoCompras;
	}

	public void setIdListadoCompras(Integer idListadoCompras) {
		this.idListadoCompras = idListadoCompras;
	}

	public TipoArea getAreaSolicitante() {
		return this.areaSolicitante;
	}

	public void setAreaSolicitante(TipoArea areaSolicitante) {
		this.areaSolicitante = areaSolicitante;
	}

	public List<ItemListado> getInsumos() {
		return insumos;
	}

	public void setInsumos(List<ItemListado> insumos) {
		this.insumos = insumos;
	}

	public void save() {
		ListadoCompraDAO.getInstancia().save(this);
		
	}

	public EstadoPedidoCompra getEstado() {
		return estado;
	}
	
	public void setEstado(EstadoPedidoCompra estado) {
		this.estado = estado;
	}
	
	public ListadoComprasDTO toDTO(){
		return new ListadoComprasDTO(this.getIdListadoCompras(), this.getAreaSolicitante().toString(), null);
	}
}
