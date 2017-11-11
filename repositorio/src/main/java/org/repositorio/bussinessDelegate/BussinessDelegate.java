package org.repositorio.bussinessDelegate;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.List;

import org.repositorio.dtos.AbrirMesaDTO;
import org.repositorio.dtos.AgregarItemComandaDTO;
import org.repositorio.dtos.AgregarItemsComandaDTO;
import org.repositorio.dtos.CrearComandaDTO;
import org.repositorio.interfaces.IAppRemote;

public class BussinessDelegate implements IAppRemote {

	private static BussinessDelegate instancia;

	private IAppRemote objetoRemoto;

	public static BussinessDelegate getInstancia() throws Exception {
		if (instancia == null) {
			instancia = new BussinessDelegate();
		}
		return instancia;
	}

	/*
	 * 
	 * contructor
	 */
	private BussinessDelegate() throws Exception {
		super();
		this.objetoRemoto = (IAppRemote) Naming.lookup(IAppRemote.URL_SERVICIO);
	}

	public boolean crearComanda(CrearComandaDTO comanda) {
		try {
			return objetoRemoto.crearComanda(comanda);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean agregarItemAComanda(AgregarItemComandaDTO item) {
		try {
			return this.objetoRemoto.agregarItemAComanda(item);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public AgregarItemsComandaDTO agregarItemsAComanda(AgregarItemsComandaDTO item) throws RemoteException {
		return this.objetoRemoto.agregarItemsAComanda(item);
	}

	@Override
	public boolean cerrarcomanda(int idComanda) throws RemoteException {
		return this.objetoRemoto.cerrarcomanda(idComanda);
	}

	@Override
	public void cerrarMesa(int idMesa) throws RemoteException {
		this.objetoRemoto.cerrarMesa(idMesa);
	}

	@Override
	public void AbrirMesaNueva(List<Integer> nrosMesas) throws RemoteException {
		 AbrirMesaDTO dto = new AbrirMesaDTO();
		 
		 dto.setNumerodeMesa(nrosMesas);
		 objetoRemoto.AbrirMesa(dto);
		
	}

	@Override
	public boolean AbrirMesa(List<Integer> nrosMesas) throws RuntimeException, RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}