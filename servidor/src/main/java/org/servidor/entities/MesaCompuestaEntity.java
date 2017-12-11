package org.servidor.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.servidor.Enum.EstadoMesa;

@Entity
@DiscriminatorValue(value = "comp")
public class MesaCompuestaEntity extends MesaEntity {

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<MesaEntity> mesas;

	public MesaCompuestaEntity() {
		this.mesas = new ArrayList<MesaEntity>();
	}

	public List<MesaEntity> getMesas() {
		return mesas;
	}

	public void setMesas(List<MesaEntity> mesas) {
		this.mesas = mesas;
	}

	@Override
	public void setEstadoMesa(EstadoMesa estadoMesa) {
		for (MesaEntity mesaEntity : mesas) {
			mesaEntity.setEstadoMesa(estadoMesa);
		}
		super.setEstadoMesa(estadoMesa);
	}

}
