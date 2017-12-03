package org.servidor.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "localRestaurante")
public class LocalEntity {

	public LocalEntity() {
	}

	@Id
	private Integer idLocal;

	@OneToMany(mappedBy = "localRestaurante")
	private List<ComandaEntity> comandas;

	@OneToMany(mappedBy = "listasCompras")
	private List<ListadoComprasEntity> listadosCompras;
	
	@ManyToMany
	private StockEmbeddeEntity stock;

	public Integer getIdLocal() {
		return idLocal;
	}

	public void setIdLocal(Integer idLocal) {
		this.idLocal = idLocal;
	}

	public List<ComandaEntity> getComandas() {
		return comandas;
	}

	public void setComandas(List<ComandaEntity> comandas) {
		this.comandas = comandas;
	}

	public List<ListadoComprasEntity> getListadosCompras() {
		return listadosCompras;
	}

	public void setListadosCompras(List<ListadoComprasEntity> listadosCompras) {
		this.listadosCompras = listadosCompras;
	}
}
