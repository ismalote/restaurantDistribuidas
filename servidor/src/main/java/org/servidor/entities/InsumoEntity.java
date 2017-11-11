package org.servidor.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "insumo")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "Insumo_type")
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class InsumoEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Integer idInsumo;
	protected Float precio;
	protected Date fechaCreacion;
	protected Date fechaCaducidad;
	protected String descripcion;
	protected String unidad;
	
	@ManyToOne
	private RestaurantEntity restauranteInsumos;

	public InsumoEntity(Integer idInsumo, Float precio, Date fechaCreacion, Date fechaCaducidad, String descripcion,
			String unidad) {
		super();
		this.idInsumo = idInsumo;
		this.precio = precio;
		this.fechaCreacion = fechaCreacion;
		this.fechaCaducidad = fechaCaducidad;
		this.descripcion = descripcion;
		this.unidad = unidad;
	}
	public InsumoEntity() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdInsumo() {
		return idInsumo;
	}

	public void setIdInsumo(Integer idInsumo) {
		this.idInsumo = idInsumo;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

}
