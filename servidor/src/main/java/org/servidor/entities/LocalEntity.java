package org.servidor.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "localRestaurante")
public class LocalEntity {



	public LocalEntity() {
	}

	@Id
	private Integer idLocal;

	@OneToMany(mappedBy = "localRestaurante")
	private List<EncargadoEntity> encargadosAreas;

	@OneToMany(mappedBy = "localRestaurante")
	private List<MozoEntity> mozos;


	@OneToMany(mappedBy = "localRestaurante")
	private List<MesaEntity> mesas;
	
	@OneToMany(mappedBy = "localRestaurante")
	private List<ComandaEntity> comandas;


	@OneToOne
	@JoinColumn(name = "idDeposito")
	private DepositoEntity deposito;


	@OneToOne
	@JoinColumn(name = "idCaja")
	private CajaEntity caja;
	
	
	@OneToMany(mappedBy = "localRestaurante")
	private List<AreaProduccionEntity> areas;

	@OneToOne
	@JoinColumn(name = "idCarta")
	private CartaEntity carta;

	@OneToMany(mappedBy = "listasCompras")
	private List<ListadoComprasEntity> listadosCompras;

	@ManyToOne
	private RestaurantEntity restaurante;

	
}
