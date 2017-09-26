package org.servidor.negocio;

import java.util.Date;

public class Caducidad  {
	
	private Date fechaCreacion;
	private Date fechaCaducidad;
	
	public Caducidad(Date fechaCreacion, Date fechaCaducidad) {
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
