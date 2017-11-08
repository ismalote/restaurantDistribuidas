package org.servidor.negocio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.repositorio.dtos.ComandaDTO;
import org.repositorio.dtos.CrearComandaDTO;
import org.repositorio.dtos.ItemComandaDTO;
import org.repositorio.exceptions.MesaNotFoundException;
import org.repositorio.exceptions.MozoNotFoundException;
import org.servidor.dao.ComandaDAO;
import org.servidor.dao.MesaDAO;
import org.servidor.dao.MozoDAO;
import org.servidor.entities.ComandaEntity;

public class Comanda {

	private Integer idComanda;
	private List<ItemComanda> platos;
	private Mozo mozo;
	private Boolean comandaLista;
	private Mesa mesa;
	private Integer estadoComanda;
	private Factura fact;
	private Date fecha;
	private Local Local;

	public Comanda(Integer idComanda, List<ItemComanda> platos, Mozo mozo, Boolean comandaLista, Mesa mesa,
			int estadoComanda, Factura fact, Date fecha, org.servidor.negocio.Local local) {
		super();
		this.idComanda = idComanda;
		this.platos = platos;
		this.mozo = mozo;
		this.comandaLista = comandaLista;
		this.mesa = mesa;
		this.estadoComanda = estadoComanda;
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
		// for (PlatoEntity plato : entity.getPlatos()) {
		// this.platos.add(new Plato(plato));
		// }
		this.estadoComanda = (entity.getEstadoComanda());
		this.mozo = new Mozo(entity.getMozo());
		this.mesa = new Mesa(entity.getMesa());
		this.fact = new Factura(entity.getFact());
	}

	public Comanda(ComandaDTO dto) {
		if (dto.getMozo() == null) {
			throw new MozoNotFoundException("new Comanda(ComandaEntity entity)");
		}
		this.mozo = new Mozo(dto.getMozo());

		if (dto.getMesa() == null) {
			throw new MesaNotFoundException("new Comanda(ComandaEntity entity)");
		}
		this.mesa = new Mesa(dto.getMesa());

		this.platos = new ArrayList<ItemComanda>();
		for (ItemComandaDTO item : dto.getPlatos()) {
			this.platos.add(new ItemComanda(item));
		}

		if (dto.getEstadoComanda() == null) {
			this.estadoComanda = 0; // TODO
		} else {
			this.estadoComanda = (dto.getEstadoComanda());
		}

		if (dto.getFactura() == null) {
			this.fact = null;
		} else {
			this.fact = new Factura(dto.getFactura());
		}
	}

	public Comanda(CrearComandaDTO comanda) { // TODO Revisar con otro constructor
		this.mozo = MozoDAO.getInstancia().obtenerMozo(1);
		this.mesa = MesaDAO.getInstancia().obtenerMesaPorNumero(comanda.getNumeroMesa());
		this.fecha = new Date();
	}

	/*
	 * Public Business Methods
	 * 
	 */

	public boolean agregarItem(ItemComandaDTO item) {
		ItemComanda itemNuevo = new ItemComanda(item);
		if (this.platos.add(itemNuevo)) {
			return save();
		}
		return false;
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

	public Boolean getComandaLista() {
		return comandaLista;
	}

	public void setComandaLista(Boolean comandaLista) {
		this.comandaLista = comandaLista;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public Integer getEstadoComanda() {
		return estadoComanda;
	}

	public void setEstadoComanda(Integer estadoComanda) {
		this.estadoComanda = estadoComanda;
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

	public boolean save() {
		return ComandaDAO.getInstancia().save(this);
	}

}
