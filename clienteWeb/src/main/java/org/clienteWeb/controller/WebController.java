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
import org.repositorio.exceptions.ComandaNotFoundException;
import org.repositorio.exceptions.MesaNotFoundException;

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
	
	public boolean crearComanda(CrearComandaDTO comanda) throws BusinessException {
		
		return BussinessDelegate.getInstancia().crearComanda(comanda);
		
	}

	public boolean agregarItemAComanda(AgregarItemComandaDTO item) throws RemoteException {
		return BussinessDelegate.getInstancia().agregarItemAComanda(item);
		
	}

	public AgregarItemsComandaDTO agregarItemsAComanda(AgregarItemsComandaDTO item) throws BusinessException {
		
		
		return BussinessDelegate.getInstancia().agregarItemsAComanda(item);
		
	}

	public boolean cerrarcomanda(int idComanda) throws BusinessException {
		return BussinessDelegate.getInstancia().cerrarcomanda(idComanda);
		
	}

	public void cerrarMesa(int idMesa) throws BusinessException {
		BussinessDelegate.getInstancia().cerrarMesa(idMesa);
	}

	public void abrirMesaNueva(List<Integer> nrosMesas) throws BusinessException {
		AbrirMesaDTO dto = new AbrirMesaDTO();

		dto.setNumerodeMesa(nrosMesas);
		
			BussinessDelegate.getInstancia().AbrirMesa(dto);
	}

	public List<MesaDTO> listarMesasLibres() throws RemoteException {
		return BussinessDelegate.getInstancia().listarMesasLibres();
		
	}

	public void AbrirMesa(AbrirMesaDTO dto) throws RuntimeException, RemoteException, BusinessException {
		BussinessDelegate.getInstancia().AbrirMesa(dto);

	}

	public List<MesaDTO> mesasLibres() throws BusinessException {
		return BussinessDelegate.getInstancia().mesasLibres();
	}

	

	public List<ItemComandaDTO> listarItemComanda(int idComanda) throws BusinessException {
		return BussinessDelegate.getInstancia().listarItemComanda(idComanda);
		
	}

	public List<ItemComandaDTO> PedidoXSector(Integer idArea, Integer idLocal) throws BusinessException {
		return BussinessDelegate.getInstancia().PedidoXSector(idArea, idLocal);
		
	}

	public boolean reservarMesa(int cantidadComensales, String descripcion, Date fechaHora) throws BusinessException {
		return BussinessDelegate.getInstancia().reservarMesa(cantidadComensales, descripcion, fechaHora);
		
	}
	
	//listado de productos para pedir en las areas
	public List<ProductosAPedirDTO> listarProductosParaPedir() throws BusinessException{
		return BussinessDelegate.getInstancia().listarProductosParaPedir();
		
	}
	
	//menu para el mozo
	public List<PlatoMenuDTO> platosDelMenu() throws BusinessException{
		return BussinessDelegate.getInstancia().platosDelMenu();
	
	}
	
	public void pedirPorductos(String area, List<ProductosAPedirDTO> prods)  throws RemoteException, BusinessException {
		BussinessDelegate.getInstancia().pedirPorductos(area, prods);

	}
	
	public void finalizarPlato(Integer idItemComanda) throws RemoteException, BusinessException {
		BussinessDelegate.getInstancia().finalizarPlato(idItemComanda);

	}
	
	public void aprobarCompra(Integer idCompra) throws RemoteException, BusinessException {
		BussinessDelegate.getInstancia().aprobarCompra(idCompra);

	}
	
	public void rechazarCompra(Integer idCompra) throws RemoteException, BusinessException {
		BussinessDelegate.getInstancia().rechazarCompra(idCompra);

	}
	
	public ObtenerPlatoDto obtenerPlatoporId(int idPlato) throws BusinessException {
		return BussinessDelegate.getInstancia().obtenerPlatoporId(idPlato);
		
	}
	
	
	
}
