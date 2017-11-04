package org.repositorio.bussinessDelegate;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.List;

import org.repositorio.dtos.ComandaDTO;
import org.repositorio.dtos.CrearComandaDTO;
import org.repositorio.dtos.ItemComandaDTO;
import org.repositorio.exceptions.BusinessException;
import org.repositorio.interfaces.IAppRemote;

public class BussinessDelegate implements IAppRemote {

	private static BussinessDelegate instancia;
	
	private IAppRemote bussinessDelegate;

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
		this.bussinessDelegate = (IAppRemote) Naming.lookup(IAppRemote.URL_SERVICIO);
	}

	
	
	public void crearComanda(CrearComandaDTO comanda) throws Exception,BusinessException{
		bussinessDelegate.crearComanda(comanda);
	}

	@Override
	public boolean agregarItemAComanda(ItemComandaDTO item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void pedirItemDeComanda(String idItemComanda) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean cerrarcomanda(String idComanda) {
		// TODO Auto-generated method stub
		return false;
	}

}
