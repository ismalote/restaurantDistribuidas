package org.servidor.entities;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;;

@Entity
@Table(name ="areaProduccion")
public class AreaProduccionEntity {
	
	@Id
	private Integer idAreaProducion;

	@OneToMany(mappedBy = "AreaProdu")
	protected List<ProductoComestibleEntity> productos;

	protected String TipoArea;
	@OneToOne
	@JoinColumn(name = "idEncargado")
	protected EncargadoEntity encargado;

	@ManyToOne
	protected LocalEntity localRestaurante;
//	@OneToMany(mappedBy = "areaProduccion")
//	protected List<ComandaEntity> comandas;



	

}
