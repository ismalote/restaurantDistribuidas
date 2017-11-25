package org.repositorio.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import org.repositorio.dtos.AbrirMesaDTO;
import org.repositorio.dtos.AgregarItemComandaDTO;
import org.repositorio.dtos.AgregarItemsComandaDTO;
import org.repositorio.dtos.CrearComandaDTO;
import org.repositorio.dtos.ItemComandaDTO;
import org.repositorio.dtos.MesaDTO;

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
}