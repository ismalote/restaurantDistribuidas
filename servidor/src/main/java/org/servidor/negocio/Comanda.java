package org.servidor.negocio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.repositorio.dtos.ComandaDTO;
import org.repositorio.dtos.CrearComandaDTO;
import org.repositorio.dtos.PlatoDTO;
import org.servidor.dao.ComandaDAO;
import org.servidor.dao.MesaDAO;
import org.servidor.dao.MozoDAO;
import org.servidor.entities.ComandaEntity;
import org.servidor.entities.PlatoEntity;

public class Comanda {

	private Integer idComanda;
	private List<Plato> platos;
	private Mozo mozo;
	private Boolean comandaLista;
	private Mesa mesa;
	private EstadoComanda estadoComanda;
	private Factura fact;
	private Date fecha;
	private Local Local;

	
	public Comanda(Integer idComanda, List<Plato> platos, Mozo mozo, Boolean comandaLista, Mesa mesa,
			EstadoComanda estadoComanda, Factura fact, Date fecha, org.servidor.negocio.Local local) {
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
		this.platos = new ArrayList<Plato>();
		for (PlatoEntity plato : entity.getPlatos()) {
			this.platos.add(new Plato(plato));
		}
		this.estadoComanda = new EstadoComanda(entity.getEstadoComanda());
		this.mozo = new Mozo(entity.getMozo());
		this.mesa = new Mesa(entity.getMesa());
		this.fact = new Factura(entity.getFact());
	}

	public Comanda(ComandaDTO dto) {
		this.platos = new ArrayList<Plato>();
		for (PlatoDTO plato : dto.getPlatos()) {
			this.platos.add(new Plato(plato));
		}
		this.estadoComanda = new EstadoComanda(dto.getEstadoComanda());
		this.mozo = new Mozo(dto.getMozo());
		this.mesa = new Mesa(dto.getMesa());
		this.fact = new Factura(dto.getFactura());

	}
	public Comanda( CrearComandaDTO comanda) {
		this.mozo = MozoDAO.getInstancia().obtenerMozo(1);
		this.mesa= MesaDAO.getInstancia().obtenerMesaPorNumero(comanda.getNumeroMesa());
		this.fecha= new Date();
		
		
		}

	public List<Plato> getPlatos() {
		return platos;
	}

	public void setPlatos(List<Plato> platos) {
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

	public EstadoComanda getEstadoComanda() {
		return estadoComanda;
	}

	public void setEstadoComanda(EstadoComanda estadoComanda) {
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
	
	public void save(){
		
		ComandaDAO.getInstancia().grabarComanda(this);
	}

	
}
