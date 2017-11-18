package org.repositorio.bussinessDelegate;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

import org.repositorio.dtos.AbrirMesaDTO;
import org.repositorio.dtos.AgregarItemComandaDTO;
import org.repositorio.dtos.AgregarItemsComandaDTO;
import org.repositorio.dtos.CrearComandaDTO;
import org.repositorio.dtos.MesaDTO;
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
	private BussinessDelegate() throws MalformedURLException, RemoteException, NotBoundException {
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

	public boolean agregarItemAComanda(AgregarItemComandaDTO item) {
		try {
			return this.objetoRemoto.agregarItemAComanda(item);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}

	public AgregarItemsComandaDTO agregarItemsAComanda(AgregarItemsComandaDTO item) throws RemoteException {
		return this.objetoRemoto.agregarItemsAComanda(item);
	}

	public boolean cerrarcomanda(int idComanda) throws RemoteException {
		return this.objetoRemoto.cerrarcomanda(idComanda);
	}

	public void cerrarMesa(int idMesa) throws RemoteException {
		this.objetoRemoto.cerrarMesa(idMesa);
	}

	public void abrirMesaNueva(List<Integer> nrosMesas) throws RemoteException {
		AbrirMesaDTO dto = new AbrirMesaDTO();

		dto.setNumerodeMesa(nrosMesas);
		objetoRemoto.abrirMesa(dto);

	}

	public List<MesaDTO> listarMesasLibres(Integer sector) throws RemoteException {
		return objetoRemoto.mesasLibres(sector);
	}

	public void AbrirMesa(AbrirMesaDTO dto) throws RuntimeException, RemoteException {
		// TODO Auto-generated method stub

	}

	public AbrirMesaDTO mesasLibres(Integer numeroSector) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public AbrirMesaDTO mesasLibres(Integer numeroSector, Integer cantidadComensales) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}