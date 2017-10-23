package org.repositorio.bussinessDelegate;

import java.rmi.Naming;

import org.repositorio.dtos.ComandaDTO;
import org.repositorio.dtos.ItemComandaDTO;
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
		this.setBussinessDelegate((IAppRemote) Naming.lookup(IAppRemote.URL_SERVICIO));
	}

	public IAppRemote getBussinessDelegate() {
		return bussinessDelegate;
	}

	public void setBussinessDelegate(IAppRemote bussinessDelegate) {
		this.bussinessDelegate = bussinessDelegate;
	}



}
