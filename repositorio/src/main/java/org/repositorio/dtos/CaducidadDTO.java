package org.repositorio.dtos;

import java.util.Date;

public class CaducidadDTO {

	private Date fechaCreacion;
	private Date fechaCaducidad;

	public CaducidadDTO(Date fechaCreacion, Date fechaCaducidad) {
		super();
		this.fechaCreacion = fechaCreacion;
		this.fechaCaducidad = fechaCaducidad;
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

}
