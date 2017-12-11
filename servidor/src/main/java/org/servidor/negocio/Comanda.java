package org.servidor.negocio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.repositorio.dtos.AgregarItemsComandaDTO;
import org.repositorio.dtos.ComandaDTO;
import org.repositorio.dtos.CrearComandaDTO;
import org.repositorio.dtos.ItemComandaDTO;
import org.repositorio.exceptions.ComandaNotFoundException;
import org.repositorio.exceptions.ItemComandaFailException;
import org.repositorio.exceptions.MesaNotFoundException;
import org.repositorio.exceptions.MozoNotFoundException;
import org.servidor.dao.ComandaDAO;
import org.servidor.dao.ItemComandaDAO;
import org.servidor.dao.LocalDAO;
import org.servidor.dao.MesaDAO;
import org.servidor.dao.MozoDAO;
import org.servidor.entities.ComandaEntity;
import org.servidor.entities.ItemComandaEntity;

public class Comanda {

	private Integer idComanda;
	private List<ItemComanda> platos;
	private Mozo mozo;
	private boolean cerrada;
	private Mesa mesa;
	private Integer cantidadComensales;
	private Factura fact;
	private Date fecha;
	private Local Local;

	public Comanda(Integer idComanda, List<ItemComanda> platos, Mozo mozo, Boolean cerrada, Mesa mesa,
			int cantidadComensales, Factura fact, Date fecha, Local local) {
		super();
		this.idComanda = idComanda;
		this.platos = platos;
		this.mozo = mozo;
		this.cerrada = cerrada;
		this.mesa = mesa;
		this.cantidadComensales = cantidadComensales;
		this.fact = fact;
		this.fecha = fecha;
		this.Local = local;
	}

	public Integer getIdComanda() {
		return idComanda;
	}

	public void setIdComanda(Integer idComanda) {
		this.idComanda = idComanda;
	}

	public Comanda(ComandaEntity entity) {
		this.platos = new ArrayList<ItemComanda>();
		for (ItemComandaEntity plato : entity.getPlatos()) {
			this.platos.add(ItemComandaDAO.getInstancia().toNegocio(plato));
		}
		this.idComanda = entity.getIdComanda();
		this.cantidadComensales = entity.getCantidadComensales();
		this.mozo = new Mozo(entity.getMozo());
		this.mesa = MesaDAO.getInstancia().toNegocio2(entity.getMesa());
		this.Local = LocalDAO.getInstance().toNegocio(entity.getLocalRestaurante());
		// this.fact = new Factura(entity.getFact());
	}

	public Comanda() {
		// TODO Auto-generated constructor stub
	}

	public Comanda(ComandaDTO dto) throws MozoNotFoundException, MesaNotFoundException {
		if (dto.getMozo() == null) {
			throw new MozoNotFoundException("new Comanda(ComandaEntity entity)");
		}
		this.mozo = new Mozo(dto.getMozo());

		if (dto.getMesa() == null) {
			throw new MesaNotFoundException("new Comanda(ComandaEntity entity)");
		}
		this.mesa = getMesa(dto);

		this.platos = new ArrayList<ItemComanda>();
		for (ItemComandaDTO item : dto.getPlatos()) {
			this.platos.add(new ItemComanda(item));
		}

		if (dto.getCantidadComensales() == null) {
			this.cantidadComensales = 0; // TODO
		} else {
			this.cantidadComensales = (dto.getCantidadComensales());
		}

		if (dto.getFactura() == null) {
			this.fact = null;
		} else {
			this.fact = new Factura(dto.getFactura());
		}
	}

	public Mesa getMesa(ComandaDTO dto) {
		return MesaDAO.getInstancia().obtenerMesaPorNumero(dto.getMesa().getIdMesa());
	}

	public Comanda(CrearComandaDTO comanda) {
		this.mozo = MozoDAO.getInstancia().obtenerMozo(comanda.getIdMozo());
		this.mesa = MesaDAO.getInstancia().getMesa(comanda.getNumeroMesa());
		this.cantidadComensales = comanda.getCantidadComensales();
		this.Local = LocalDAO.getInstance().findById(comanda.getIdLocal());
		this.fecha = new Date();
	}

	/*
	 * Public Business Methods
	 * 
	 */

	public boolean agregarItem(ItemComandaDTO item) {
		ItemComanda itemNuevo = new ItemComanda(item);
		if (this.platos.add(itemNuevo)) {
			// por cada agregado le baja el Stock
			for (ItemComanda plato : this.platos) {
				plato.getPlato().getProductos();
				for (ProductoComestible prod : plato.getPlato().getProductos()) {
					prod.bajarStock(this.Local, plato.getPlato().getArea());
				}
			}
			return save();
		}
		return false;
	}

	public boolean agregarItems(AgregarItemsComandaDTO dto) {
		List<ItemComandaDTO> items = dto.getItems();
		int i = 0;
		while (i < items.size()) {
			ItemComandaDTO itemActual = items.get(i);
			ItemComanda itemNuevo = new ItemComanda(itemActual); // Negocio

			if (!this.platos.add(itemNuevo)) {
				throw new ItemComandaFailException("agregarItems(AgregarItemsComandaDTO dto)");
			}
			i++;
		}

		// por cada agregado le baja el Stock
		for (ItemComanda plato : this.platos) {
			for (ProductoComestible prod : plato.getPlato().getProductos()) {
				prod.bajarStock(this.Local, plato.getPlato().getArea());
			}
		}
		return save();
	}

	public boolean save() {
		return ComandaDAO.getInstancia().save(this);
	}

	public boolean cerrarComanda() throws ComandaNotFoundException {
		if (this.cerrada) {
			throw new ComandaNotFoundException(" cerrarComanda() fail, because status's comanda close ");
		}

		this.cerrada = true;
		return save();
	}

	public float montoTotal() {
		float aux = 0;
		List<ItemComanda> item = this.getPlatos();
		for (ItemComanda ic : item) {

			aux = aux + ic.getPlato().getPrecio();
		}

		return aux;
	}

	public float montoTotalComision() {
		float aux = 0;
		List<ItemComanda> item = this.getPlatos();
		for (ItemComanda ic : item) {
			if (ic.getPlato().getArea().getId() != 1 )
			aux = aux + ic.getPlato().getPrecio() ;
		}

		return aux;
	}

	public float montoTotalComisionExtra() {
		float aux = 0;
		List<ItemComanda> item = this.getPlatos();
		for (ItemComanda ic : item) {
			if (ic.getPlato().getArea().getId() != 1 && ic.getPlato().getComisionExtra() > 0  )
			aux = aux + ( ic.getPlato().getPrecio() * ic.getPlato().getComisionExtra() );
		}

		return aux;
	}
	/*
	 * Getters & Setters
	 */

	public List<ItemComanda> getPlatos() {
		return platos;
	}

	public void setPlatos(List<ItemComanda> platos) {
		this.platos = platos;
	}

	public Mozo getMozo() {
		return mozo;
	}

	public void setMozo(Mozo mozo) {
		this.mozo = mozo;
	}

	public boolean estaCerrada() {
		return cerrada;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public Integer getCantidadComensales() {
		return cantidadComensales;
	}

	public void setCantidadComensales(Integer cantidadComensales) {
		this.cantidadComensales = cantidadComensales;
	}

	public Factura getFact() {
		return fact;
	}

	public void setFact(Factura fact) {
		this.fact = fact;
	}

	public Local getLocal() {
		return Local;
	}

	public void setLocal(Local local) {
		Local = local;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public boolean isCerrada() {
		return cerrada;
	}

	public void setCerrada(boolean cerrada) {
		this.cerrada = cerrada;
	}

	public ComandaDTO toDTO() {
		return new ComandaDTO(idComanda, this.mozo.toDTO(), this.cerrada, this.mesa.toDTO(), cantidadComensales);
	}

}
