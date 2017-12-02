package org.servidor.objetoRemoto;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.util.List;

import org.repositorio.dtos.AbrirMesaDTO;
import org.repositorio.dtos.AgregarItemComandaDTO;
import org.repositorio.dtos.AgregarItemsComandaDTO;
import org.repositorio.dtos.CrearComandaDTO;
import org.repositorio.dtos.ItemComandaDTO;
import org.repositorio.dtos.MesaDTO;
import org.repositorio.dtos.ReservaDTO;
import org.repositorio.interfaces.IAppRemote;
import org.servidor.controlador.Controlador;

public class ObjetoRemoto extends UnicastRemoteObject implements IAppRemote {

	private static final long serialVersionUID = 1L;

	private Controlador controlador;

	public ObjetoRemoto() throws RemoteException {
		super();
		this.controlador = Controlador.getInstancia();
	}

	public boolean crearComanda(CrearComandaDTO comanda) throws RemoteException {
		return this.controlador.crearNuevacomanda(comanda);
	}

	public boolean agregarItemAComanda(AgregarItemComandaDTO item) throws RemoteException {
		return this.controlador.agregarItemAComanda(item);
	}

	public AgregarItemsComandaDTO agregarItemsAComanda(AgregarItemsComandaDTO item) throws RemoteException {
		return this.controlador.agregarItemsAComanda(item);
	}

	public boolean cerrarcomanda(int idComanda) throws RemoteException {
		return this.controlador.cerrarComanda(idComanda);
	}

	public void cerrarMesa(int idMesa) throws RemoteException {
		this.controlador.cerrarMesa(idMesa);
	}

	public void abrirMesa(AbrirMesaDTO dto) throws RemoteException {
		Controlador.getInstancia().AbrirMesa(dto);
	}

	public List<MesaDTO> mesasLibres(Integer numeroSector) throws RemoteException {

		return Controlador.getInstancia().mesasLibres(numeroSector);
	}

	public void AbrirMesaNueva(List<Integer> nrosMesas) throws RemoteException {
		// TODO Auto-generated method stub

	}

	public List<ItemComandaDTO> listarItemComanda(int idComanda) {
		return Controlador.getInstancia().listarPedidos(idComanda);
	}

	public void cambiarItemCRECLAMADO(int idItemComanda) {
		Controlador.getInstancia().cambiarItemCRECLAMADO(idItemComanda);
	}

	public void cambiarItemCLISTO(int idItemComanda) {
		Controlador.getInstancia().cambiarItemCLISTO(idItemComanda);

	}

	public void cambiarItemCPRODUCCION(int idItemComanda) {
		Controlador.getInstancia().cambiarItemCProduccion(idItemComanda);

	}

	public List<ItemComandaDTO> PedidoXSector(Integer idArea, Integer idLocal) {
//se cambio el nombre en el controlador, era la de la super query
		return Controlador.getInstancia().obtenerPlatosAProducir(idArea, idLocal);
	}

	@Override
	public boolean reservarMesa(Integer cantidadComensales, String descripcion, Date fechaHora) throws RemoteException {
		return controlador.reservarMesa(new ReservaDTO(fechaHora, cantidadComensales, descripcion));
	}

}