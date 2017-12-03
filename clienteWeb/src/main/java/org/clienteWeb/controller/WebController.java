package org.clienteWeb.controller;

import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;

import org.repositorio.bussinessDelegate.BussinessDelegate;
import org.repositorio.dtos.AbrirMesaDTO;
import org.repositorio.dtos.AgregarItemComandaDTO;
import org.repositorio.dtos.AgregarItemsComandaDTO;
import org.repositorio.dtos.CrearComandaDTO;
import org.repositorio.dtos.ItemComandaDTO;
import org.repositorio.dtos.MesaDTO;
import org.repositorio.dtos.ObtenerPlatoDto;
import org.repositorio.dtos.PlatoMenuDTO;
import org.repositorio.dtos.ProductosAPedirDTO;
import org.repositorio.exceptions.BusinessException;

public class WebController {

	private static WebController instancia;
	private BussinessDelegate servidor = null;

	private WebController() {
		inicializacion();
	}

	private void inicializacion() {
		try {
			servidor = BussinessDelegate.getInstancia();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public BussinessDelegate getServidor() {
		return servidor;
	}

	public static WebController getInstancia() {
		if (instancia == null) {
			instancia = new WebController();
		}
		return instancia;
	}
	
	public boolean crearComanda(CrearComandaDTO comanda) {
		
		return BussinessDelegate.getInstancia().crearComanda(comanda);
		
	}

	public boolean agregarItemAComanda(AgregarItemComandaDTO item) {
		return BussinessDelegate.getInstancia().agregarItemAComanda(item);
		
	}

	public AgregarItemsComandaDTO agregarItemsAComanda(AgregarItemsComandaDTO item) {
		
		
		return BussinessDelegate.getInstancia().agregarItemsAComanda(item);
		
	}

	public boolean cerrarcomanda(int idComanda) {
		return BussinessDelegate.getInstancia().cerrarcomanda(idComanda);
		
	}

	public void cerrarMesa(int idMesa) {
		BussinessDelegate.getInstancia().cerrarMesa(idMesa);
	}

	public void abrirMesaNueva(List<Integer> nrosMesas) {
		AbrirMesaDTO dto = new AbrirMesaDTO();

		dto.setNumerodeMesa(nrosMesas);
		try {
			BussinessDelegate.getInstancia().AbrirMesa(dto);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}

	public List<MesaDTO> listarMesasLibres(Integer sector) {
		return BussinessDelegate.getInstancia().listarMesasLibres(sector);
		
	}

	public void AbrirMesa(AbrirMesaDTO dto) throws RuntimeException, RemoteException {
		BussinessDelegate.getInstancia().AbrirMesa(dto);

	}

	public AbrirMesaDTO mesasLibres(Integer numeroSector) {
		return BussinessDelegate.getInstancia().mesasLibres(numeroSector);
	}

	

	public List<ItemComandaDTO> listarItemComanda(int idComanda) {
		return BussinessDelegate.getInstancia().listarItemComanda(idComanda);
		
	}

	public List<ItemComandaDTO> PedidoXSector(Integer idArea, Integer idLocal) {
		return BussinessDelegate.getInstancia().PedidoXSector(idArea, idLocal);
		
	}

	public boolean reservarMesa(int cantidadComensales, String descripcion, Date fechaHora) {
		return BussinessDelegate.getInstancia().reservarMesa(cantidadComensales, descripcion, fechaHora);
		
	}
	
	//listado de productos para pedir en las areas
	public List<ProductosAPedirDTO> listarProductosParaPedir(){
		return BussinessDelegate.getInstancia().listarProductosParaPedir();
		
	}
	
	//menu para el mozo
	public List<PlatoMenuDTO> platosDelMenu(){
		return BussinessDelegate.getInstancia().platosDelMenu();
	
	}
	
	public void pedirPorductos(String area, List<ProductosAPedirDTO> prods)  throws RemoteException {
		BussinessDelegate.getInstancia().pedirPorductos(area, prods);

	}
	
	public void finalizarPlato(Integer idItemComanda) throws RemoteException {
		BussinessDelegate.getInstancia().finalizarPlato(idItemComanda);

	}
	
	public void aprobarCompra(Integer idCompra) throws RemoteException {
		BussinessDelegate.getInstancia().aprobarCompra(idCompra);

	}
	
	public void rechazarCompra(Integer idCompra) throws RemoteException {
		BussinessDelegate.getInstancia().rechazarCompra(idCompra);

	}
	
	public ObtenerPlatoDto obtenerPlatoporId(int idPlato) {
		return BussinessDelegate.getInstancia().obtenerPlatoporId(idPlato);
		
	}
	
	
	
}
