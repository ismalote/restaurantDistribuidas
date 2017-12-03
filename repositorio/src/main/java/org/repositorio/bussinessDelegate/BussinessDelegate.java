package org.repositorio.bussinessDelegate;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;

import org.repositorio.dtos.AbrirMesaDTO;
import org.repositorio.dtos.AgregarItemComandaDTO;
import org.repositorio.dtos.AgregarItemsComandaDTO;
import org.repositorio.dtos.CrearComandaDTO;
import org.repositorio.dtos.ItemComandaDTO;
import org.repositorio.dtos.ItemListadoDTO;
import org.repositorio.dtos.ListadoComprasDTO;
import org.repositorio.dtos.MesaDTO;
import org.repositorio.dtos.ObtenerPlatoDto;
import org.repositorio.dtos.PlatoMenuDTO;
import org.repositorio.dtos.ProductosAPedirDTO;
import org.repositorio.exceptions.BusinessException;
import org.repositorio.interfaces.IAppRemote;

public class BussinessDelegate {

	private static BussinessDelegate instancia;

	private IAppRemote objetoRemoto;

	public static BussinessDelegate getInstancia() {
		if (instancia == null) {
			try {
				instancia = new BussinessDelegate();
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		return instancia;
	}

	/*
	 * 
	 * contructor
	 */
	private BussinessDelegate() throws BusinessException  {
		super();
		try {
			this.objetoRemoto = (IAppRemote) Naming.lookup(IAppRemote.URL_SERVICIO);
		} catch (MalformedURLException e) {
			throw new BusinessException("Servidor no encontrado");
		} catch (RemoteException e) {
			//throw new BusinessException("Problemas en la red");
			e.printStackTrace();
		} catch (NotBoundException e) {
			throw new BusinessException("Recurso no encontrado");
		}
	}

	public boolean crearComanda(CrearComandaDTO comanda) throws BusinessException{
		try {
			return objetoRemoto.crearComanda(comanda);
		} catch (RemoteException e) {
			throw new BusinessException("Error de Acceso al servidor");	
		}
	
	}

	public boolean agregarItemAComanda(AgregarItemComandaDTO item) throws BusinessException{
		try {
			return this.objetoRemoto.agregarItemAComanda(item);
		} catch (RemoteException e) {
			throw new BusinessException("Error de Acceso al servidor");	
		}
		
	}

	public AgregarItemsComandaDTO agregarItemsAComanda(AgregarItemsComandaDTO item)throws BusinessException {
		try {
			return this.objetoRemoto.agregarItemsAComanda(item);
		} catch (RemoteException e) {
			throw new BusinessException("Error de Acceso al servidor");	
		}
		
	}

	public boolean cerrarcomanda(int idComanda) throws BusinessException{
		try {
			return this.objetoRemoto.cerrarcomanda(idComanda);
		} catch (RemoteException e) {
			throw new BusinessException("Error de Acceso al servidor");	
		}
		
	}

	public void cerrarMesa(int idMesa)throws BusinessException {
		try {
			this.objetoRemoto.cerrarMesa(idMesa);
		} catch (RemoteException e) {
			throw new BusinessException("Error de Acceso al servidor");	
		}
	}

	public void abrirMesaNueva(List<Integer> nrosMesas)throws BusinessException {
		AbrirMesaDTO dto = new AbrirMesaDTO();

		dto.setNumerodeMesa(nrosMesas);
		try {
			objetoRemoto.abrirMesa(dto);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	public List<MesaDTO> listarMesasLibres(Integer sector)throws BusinessException {
		try {
			return objetoRemoto.mesasLibres(sector);
		} catch (RemoteException e) {
			throw new BusinessException("Error de Acceso al servidor");	
		}
		
	}

	public void AbrirMesa(AbrirMesaDTO dto) throws BusinessException {
			try {
				objetoRemoto.abrirMesa(dto);
			} catch (RemoteException e) {
				throw new BusinessException("Error de Acceso al servidor");	
			} 

	}

	public List<MesaDTO> mesasLibres(Integer numeroSector)throws BusinessException {
				try {
					return objetoRemoto.mesasLibres(numeroSector);
				} catch (RemoteException e) {
					throw new BusinessException("Error de Acceso al servidor");	
				}
				
	}

	public AbrirMesaDTO mesasLibres(Integer numeroSector, Integer cantidadComensales)throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ItemComandaDTO> listarItemComanda(int idComanda)throws BusinessException {
		try {
			return objetoRemoto.listarItemComanda(idComanda);
		} catch (RemoteException e) {
			throw new BusinessException("Error de Acceso al servidor");	
		}
		
	}

	public List<ItemComandaDTO> PedidoXSector(Integer idArea, Integer idLocal) throws BusinessException{
		try {
			return objetoRemoto.PedidoXSector(idArea, idLocal);
		} catch (RemoteException e) {
			throw new BusinessException("Error de Acceso al servidor");	
		}
		
	}

	public boolean reservarMesa(int cantidadComensales, String descripcion, Date fechaHora) throws BusinessException{
		try {
			return this.objetoRemoto.reservarMesa(cantidadComensales, descripcion, fechaHora);
		} catch (RemoteException e) {
			throw new BusinessException("Error de Acceso al servidor");	
		}
		
	}
	
	//listado de productos para pedir en las areas
	public List<ProductosAPedirDTO> listarProductosParaPedir()throws BusinessException{
		try {
			return objetoRemoto.listarProductosParaPedir();
		} catch (RemoteException e) {
			throw new BusinessException("Error de Acceso al servidor");	
		}
	
	}
	
	//menu para el mozo
	public List<PlatoMenuDTO> platosDelMenu()throws BusinessException{
		try {
			return objetoRemoto.platosDelMenu();
		} catch (RemoteException e) {
			throw new BusinessException("Error de Acceso al servidor");	
		}
		
	}
	
	public void pedirPorductos(String area, List<ProductosAPedirDTO> prods)  throws BusinessException {
		try {
			objetoRemoto.pedirPorductos(area, prods);
		} catch (RemoteException e) {
			throw new BusinessException("Error de Acceso al servidor");	
			
		}

	}
	
	public void finalizarPlato(Integer idItemComanda) throws BusinessException {
		try {
			objetoRemoto.finalizarPlato(idItemComanda);
		} catch (RemoteException e) {
			throw new BusinessException("Error de Acceso al servidor");	
		}

	}
	
	public void aprobarCompra(Integer idCompra) throws BusinessException {
		try {
			objetoRemoto.aprobarCompra(idCompra);
		} catch (RemoteException e) {
			throw new BusinessException("Error de Acceso al servidor");	
		}

	}
	
	public void rechazarCompra(Integer idCompra) throws BusinessException {
		try {
			objetoRemoto.rechazarCompra(idCompra);
		} catch (RemoteException e) {
			throw new BusinessException("Error de Acceso al servidor");	
		}

	}
	
	public ObtenerPlatoDto obtenerPlatoporId(int idPlato) throws BusinessException{
		try {
			return objetoRemoto.obtenerPlatoporId(idPlato);
		} catch (RemoteException e) {
			throw new BusinessException("Error de Acceso al servidor");	
		}
	
	}
	
	public List<ListadoComprasDTO> listarComprasPedidas(){
		try {
			return objetoRemoto.listarComprasPedidas();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<ItemListadoDTO> listarProdDePedido(Integer idListadoCompras){
		try {
			return objetoRemoto.listarProdDePedido(idListadoCompras);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

}