package org.servidor.entities;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "encargado")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Encargado_type")
public abstract class OperadorEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Integer idEncargado;
	protected String Nombre;
	protected String Apellido;
	@OneToOne(mappedBy = "encargado")
	protected AreaProduccionEntity areaProdu;
	@ManyToOne
	private LocalEntity localRestaurante;

	public OperadorEntity(Integer idEncargado, String nombre, String apellido, AreaProduccionEntity areaProdu,
			LocalEntity localRestaurante) {
		super();
		this.idEncargado = idEncargado;
		Nombre = nombre;
		Apellido = apellido;
		this.areaProdu = areaProdu;
		this.localRestaurante = localRestaurante;
	}
	
	public OperadorEntity() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdOperador() {
		return idEncargado;
	}

	public void setIdOperador(Integer idEncargado) {
		this.idEncargado = idEncargado;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public AreaProduccionEntity getAreaProdu() {
		return areaProdu;
	}

	public void setAreaProdu(AreaProduccionEntity areaProdu) {
		this.areaProdu = areaProdu;
	}

	public LocalEntity getLocalRestaurante() {
		return localRestaurante;
	}

	public void setLocalRestaurante(LocalEntity localRestaurante) {
		this.localRestaurante = localRestaurante;
	}

}
