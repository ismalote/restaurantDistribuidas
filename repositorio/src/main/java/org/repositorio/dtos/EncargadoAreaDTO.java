package org.repositorio.dtos;

import java.io.Serializable;

public class EncargadoAreaDTO extends EncargadoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4034024290307345428L;

	public EncargadoAreaDTO(Integer idEncargado, String nombre, String apellido, AreaProduccionDTO area) {
		super(idEncargado, nombre, apellido, area);
		// TODO Auto-generated constructor stub
	}

	// TODO que onda con este?

}
