package org.repositorio.dtos;

public class EstadoComandaDTO {

	private boolean estadoCocina;
	private boolean estadoCafeteria;
	private boolean estadoBarra;

	public EstadoComandaDTO(boolean estadoCocina, boolean estadoCafeteria, boolean estadoBarra) {
		super();
		this.estadoCocina = estadoCocina;
		this.estadoCafeteria = estadoCafeteria;
		this.estadoBarra = estadoBarra;
	}

	public boolean isEstadoCocina() {
		return estadoCocina;
	}

	public void setEstadoCocina(boolean estadoCocina) {
		this.estadoCocina = estadoCocina;
	}

	public boolean isEstadoCafeteria() {
		return estadoCafeteria;
	}

	public void setEstadoCafeteria(boolean estadoCafeteria) {
		this.estadoCafeteria = estadoCafeteria;
	}

	public boolean isEstadoBarra() {
		return estadoBarra;
	}

	public void setEstadoBarra(boolean estadoBarra) {
		this.estadoBarra = estadoBarra;
	}

}
