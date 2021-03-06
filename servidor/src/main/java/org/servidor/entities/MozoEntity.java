package org.servidor.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.servidor.negocio.Mozo;

@Entity
@Table(name = "mozo")
public class MozoEntity {

	@Id
	private Integer idMozo;
	private Float porcentajeComision;
	private String nombre;
	private String apellido;
	private Integer antiguedad;

	@OneToMany
	private List<MesaEntity> mesasMozo;

	@ManyToOne
	private LocalEntity localRestaurante;

	public MozoEntity(Integer idMozo, Float porcentajeComision, String nombre, String apellido, Integer antiguedad,
			List<MesaEntity> mesasMozo, LocalEntity localRestaurante) {
		super();
		this.idMozo = idMozo;
		this.porcentajeComision = porcentajeComision;
		this.nombre = nombre;
		this.apellido = apellido;
		this.antiguedad = antiguedad;
		this.mesasMozo = mesasMozo;
		this.localRestaurante = localRestaurante;
	}

	public MozoEntity() {
		// TODO Auto-generated constructor stub
	}

	public MozoEntity(Mozo mozo) {
		this.antiguedad = mozo.getAntiguedad();
		this.apellido = mozo.getApellido();
		this.idMozo = mozo.getIdMozo();
		this.nombre = mozo.getNombre();
		this.porcentajeComision = mozo.getPorcentajeComision();
	}

	public Integer getIdMozo() {
		return idMozo;
	}

	public void setIdMozo(Integer idMozo) {
		this.idMozo = idMozo;
	}

	public Float getPorcentajeComision() {
		return porcentajeComision;
	}

	public void setPorcentajeComision(Float porcentajeComision) {
		this.porcentajeComision = porcentajeComision;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}

	public List<MesaEntity> getMesasMozo() {
		return mesasMozo;
	}

	public void setMesasMozo(List<MesaEntity> mesasMozo) {
		this.mesasMozo = mesasMozo;
	}

	public LocalEntity getLocalRestaurante() {
		return localRestaurante;
	}

	public void setLocalRestaurante(LocalEntity localRestaurante) {
		this.localRestaurante = localRestaurante;
	}

}
