package org.repositorio.interfaces;

import java.rmi.Remote;
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

public interface IAppRemote extends Remote {
	String URL_SERVICIO = "localhost/RestaurantDistribuida";
	Integer PORT_SERVICIO = 1099;

	boolean crearComanda(CrearComandaDTO comanda) throws RemoteException;

	boolean agregarItemAComanda(AgregarItemComandaDTO item) throws RemoteException;

	AgregarItemsComandaDTO agregarItemsAComanda(AgregarItemsComandaDTO item) throws RemoteException;

	boolean cerrarcomanda(int idComanda) throws RemoteException;

	void cerrarMesa(int idMesa) throws RemoteException;

	void abrirMesa(AbrirMesaDTO dto) throws RuntimeException, RemoteException;

	List<MesaDTO> mesasLibres(Integer numeroSector) throws RemoteException;

	void AbrirMesaNueva(List<Integer> nrosMesas) throws RemoteException;
	
	List<ItemComandaDTO> listarItemComanda (int idComanda) throws RemoteException;

	void cambiarItemCRECLAMADO(int idItemComanda)throws RemoteException ;
	
	void cambiarItemCLISTO(int idItemComanda)throws RemoteException ;
	
	void cambiarItemCPRODUCCION(int idItemComanda)throws RemoteException;
	
	List<ItemComandaDTO> PedidoXSector(Integer idArea,Integer idLocal) throws RemoteException;
	
	boolean reservarMesa(Integer cantidadComensales, String descripcion, Date fechaHora) throws RemoteException;
	
	List<ProductosAPedirDTO> listarProductosParaPedir() throws RemoteException;
	
	List<PlatoMenuDTO> platosDelMenu() throws RemoteException;
	
	void pedirPorductos(String area, List<ProductosAPedirDTO> prods) throws RemoteException;
	
	void finalizarPlato(Integer idItemComanda) throws RemoteException;
	
	void aprobarCompra(Integer idCompra) throws RemoteException;
	
	void rechazarCompra(Integer idCompra) throws RemoteException;
	
	boolean cerrarCaja (Integer idLocal, Float monto) throws RemoteException;
	
	void abrirCaja (Integer idLocal, Float monto) throws RemoteException;
	
	ObtenerPlatoDto obtenerPlatoporId(int idPlato)throws RemoteException;
	
	
	
	
	
	
	List<ListadoComprasDTO> listarComprasPedidas() throws RemoteException;
	
	List<ItemListadoDTO> listarProdDePedido(Integer idListadoCompras) throws RemoteException;
}