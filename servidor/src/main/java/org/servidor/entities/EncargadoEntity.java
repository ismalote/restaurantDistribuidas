package org.servidor.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="encargado")
public abstract class EncargadoEntity {
	
	@Id
	@Column(name="idEncargado")
	protected Integer idEncargado;
	protected String Nombre;
	protected String Apellido;
	@OneToOne(mappedBy="encargado")
	protected AreaProduccionEntity areaProdu;
	
	public EncargadoEntity(Integer idEncargado, String nombre, String apellido, AreaProduccionEntity areaProdu) {
		super();
		this.idEncargado = idEncargado;
		Nombre = nombre;
		Apellido = apellido;
		this.areaProdu = areaProdu;
	}

	public Integer getIdEncargado() {
		return idEncargado;
	}

	public void setIdEncargado(Integer idEncargado) {
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



}
