package org.repositorio;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Map;

import org.repositorio.interfaces.IAppRemote;

public class BussinessDelegate implements IAppRemote {
	
	private static BussinessDelegate instancia;
	private IAppRemote bussinessDelegate;

	public static BussinessDelegate getInstancia() throws Exception {
		if (instancia == null){
			instancia = new BussinessDelegate();
		}
		return instancia;
	}
	
    private IAppRemote getBussinessDelegate() {
		return bussinessDelegate;
	}
	private void setBussinessDelegate(IAppRemote bussinessDelegate) {
		this.bussinessDelegate = bussinessDelegate;
	}

    private BussinessDelegate() throws Exception {
        super();        
        setBussinessDelegate( (IAppRemote) Naming.lookup(IAppRemote.URL_SERVICIO) );                
    }
    
}
