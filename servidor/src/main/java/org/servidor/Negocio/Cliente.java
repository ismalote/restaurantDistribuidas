package edu.uade.prendaDistribuida.negocio;

import edu.uade.prendaDistribuida.dao.ClienteDao;
import edu.uade.prendaDistribuida.dto.ClienteDTO;
import edu.uade.prendaDistribuida.dto.CuentaCorrienteDTO;
import edu.uade.prendaDistribuida.dto.EstadoCliente;
import edu.uade.prendaDistribuida.dto.TipoFacturacion;
import edu.uade.prendaDistribuida.entities.ClienteEntity;
import edu.uade.prendaDistribuida.entities.CuentaCorrienteEntity;
import edu.uade.prendaDistribuida.exception.BusinessException;
import edu.uade.prendaDistribuida.negocio.base.BaseNegocio;

public class Cliente extends BaseNegocio<ClienteEntity, ClienteDTO> {
	
    private static final Double LIMITE_CC_INICIAL = 200000d;

	private Long legajo;
	private String nombre;
	private TipoFacturacion tipoFacturacion;
	private String cuit;
	private String ubicacion;
	private EstadoCliente estadoCliente;
	private Sucursal sucursal;
	private CuentaCorriente cuentaCorriente;

    public Cliente(ClienteEntity entity) {
        super(entity);
    }

    public Cliente(ClienteDTO dto) {
        super(dto);
    }

    @SuppressWarnings("Duplicates")
    @Override
	protected void fromDto(ClienteDTO dto) {
		setLegajo(dto.getLegajo());
		setNombre(dto.getNombre());
		setTipoFacturacion(dto.getTipoFacturacion());
		setCuit(dto.getCuit());
		setUbicacion(dto.getUbicacion());
		setEstadoCliente(dto.getEstadoCliente());
        if (dto.getSucursal() != null) {
            setSucursal(new Sucursal(dto.getSucursal()));
        }
		if (dto.getCuentaCorriente() != null){
            setCuentaCorriente(new CuentaCorriente(dto.getCuentaCorriente()));
        }
	}

	@SuppressWarnings("Duplicates")
    @Override
	protected void fromEntity(ClienteEntity entity) {
        setLegajo(entity.getLegajo());
        setNombre(entity.getNombre());
        setTipoFacturacion(entity.getTipoFacturacion());
        setCuit(entity.getCuit());
        setUbicacion(entity.getUbicacion());
        setEstadoCliente(entity.getEstadoCliente());
        if (entity.getSucursal() != null){
            setSucursal(new Sucursal(entity.getSucursal()));
        }
        if (entity.getCuentaCorriente() != null) {
            setCuentaCorriente(new CuentaCorriente(entity.getCuentaCorriente()));
        }
	}

    @Override
	public ClienteDTO toDto (){
		ClienteDTO dto = new ClienteDTO();
		dto.setLegajo(this.getLegajo());
		dto.setNombre(this.getNombre());
		dto.setTipoFacturacion(this.getTipoFacturacion());
		dto.setCuit(this.getCuit());
		dto.setUbicacion(this.getUbicacion());
		dto.setEstadoCliente(this.getEstadoCliente());
		dto.setCuentaCorriente(this.getCuentaCorriente().toDto());
		dto.setSucursal(this.getSucursal().toDto());
		return dto;
	}

    @Override
	public ClienteEntity toEntity(){
		ClienteEntity entity = new ClienteEntity();

		entity.setLegajo(this.getLegajo());
		entity.setNombre(this.getNombre());
		entity.setTipoFacturacion(this.getTipoFacturacion());
		entity.setCuit(this.getCuit());
		entity.setUbicacion(this.getUbicacion());
		entity.setEstadoCliente(this.getEstadoCliente());
        entity.setSucursal(this.getSucursal().toEntity());
//        entity.setSucursal(this.getSucursal().toEntityBD());

		CuentaCorrienteEntity cuentaCorrienteEntity = this.getCuentaCorriente().toEntity();
		cuentaCorrienteEntity.setCliente(entity);

		entity.setCuentaCorriente(cuentaCorrienteEntity);
		return entity;
	}
	
	// GET Y SET

	public Long getLegajo() {
		return legajo;
	}
	public void setLegajo(Long legajo) {
		this.legajo = legajo;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoFacturacion getTipoFacturacion() {
		return tipoFacturacion;
	}
	public void setTipoFacturacion(TipoFacturacion tipoFacturacion) {
		this.tipoFacturacion = tipoFacturacion;
	}

	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public EstadoCliente getEstadoCliente() {
		return estadoCliente;
	}
	public void setEstadoCliente(EstadoCliente estadoCliente) {
		this.estadoCliente = estadoCliente;
	}

    public CuentaCorriente getCuentaCorriente() {
        return cuentaCorriente;
    }
    public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }
    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
    // OPERACIONES

    public void altaBD() throws BusinessException {
	    generarCuentaCorrienteNueva();
	    try {
            ClienteEntity entity = this.toEntity();
            ClienteEntity entityInsertado = ClienteDao.getInstancia().alta(entity);
		    fromEntity(entityInsertado);
        } catch (Exception e){
	        throw new BusinessException("Error al dar de alta el Cliente");
        }
	}

    private void generarCuentaCorrienteNueva() {
        CuentaCorrienteDTO dto = new CuentaCorrienteDTO();
        dto.setLimite(LIMITE_CC_INICIAL);
        dto.setSaldo(LIMITE_CC_INICIAL);
        setCuentaCorriente(new CuentaCorriente(dto));
    }

    public void modificacionBD() throws BusinessException {
	    try {
            ClienteEntity entity = this.toEntity();
            ClienteEntity entityModificado = ClienteDao.getInstancia().modificacion(entity);
            fromEntity(entityModificado);
        } catch (Exception e){
            throw new BusinessException("Error al modificar el Cliente");
        }
	}

	public Boolean bajaBD() throws BusinessException {
		Boolean resultado = false;
		try {
            ClienteEntity entity = this.toEntity();
            resultado = ClienteDao.getInstancia().baja(entity);
        } catch (Exception e){
            throw new BusinessException("Error al dar de baja el Cliente");
        }
		return resultado;
	}

    public Boolean bajaLogica() throws BusinessException {
        Boolean resultado = true;
        try {
            ClienteEntity entity = this.toEntity();
            entity.setEstadoCliente(EstadoCliente.INACTIVO);
            ClienteDao.getInstancia().modificacion(entity);
        } catch (Exception e){
            throw new BusinessException("Error al dar de baja el Cliente");
        }
        return resultado;
    }
}
