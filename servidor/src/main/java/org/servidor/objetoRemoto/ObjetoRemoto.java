package org.servidor.objetoRemoto;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import org.repositorio.dtos.AbrirMesaDTO;
import org.repositorio.dtos.AgregarItemComandaDTO;
import org.repositorio.dtos.AgregarItemsComandaDTO;
import org.repositorio.dtos.CrearComandaDTO;
import org.repositorio.interfaces.IAppRemote;
import org.servidor.controlador.Controlador;

public class ObjetoRemoto extends UnicastRemoteObject implements IAppRemote {

	private static final long serialVersionUID = 1L;

	private Controlador controlador;

	public ObjetoRemoto() throws RemoteException {
		super();
		this.controlador = Controlador.getInstancia();
	}

	public boolean crearComanda(CrearComandaDTO comanda) {
		return this.controlador.crearNuevacomanda(comanda);
	}

	@Override
	public boolean agregarItemAComanda(AgregarItemComandaDTO item) {
		return this.controlador.agregarItemAComanda(item);
	}

	@Override
	public AgregarItemsComandaDTO agregarItemsAComanda(AgregarItemsComandaDTO item) throws RemoteException {
		return this.controlador.agregarItemsAComanda(item);
	}

	@Override
	public boolean cerrarcomanda(int idComanda) {
		return this.controlador.cerrarComanda(idComanda);
	}

	@Override
	public void cerrarMesa(int idMesa) throws RemoteException {
		this.controlador.cerrarMesa(idMesa);
	}
	public void AbrirMesa(AbrirMesaDTO dto) throws RemoteException{
		Controlador.getInstancia().AbrirMesa(dto);
	}
	
	public AbrirMesaDTO mesasLibres(Integer numeroSector, Integer cantidadComensales){
	
	return Controlador.getInstancia().mesasLibres(numeroSector,cantidadComensales);
	}

	@Override
	public void AbrirMesaNueva(List<Integer> nrosMesas) throws RemoteException {
		// TODO Auto-generated method stub
		
	}




}