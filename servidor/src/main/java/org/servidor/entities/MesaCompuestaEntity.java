package org.servidor.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue(value = "comp")
public class MesaCompuestaEntity extends MesaEntity {

	@OneToMany(cascade = CascadeType.ALL)
	private List<MesaEntity> mesas;

	public MesaCompuestaEntity() {
	}

	public List<MesaEntity> getMesas() {
		return mesas;
	}

	public void setMesas(List<MesaEntity> mesas) {
		this.mesas = mesas;
	}

}
