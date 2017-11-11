package org.servidor.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "listadoCompras")
public class ListadoComprasEntity {

	@Id
	private Integer idListadoCompras;
	private String AreaSolicitante;
	@OneToMany(mappedBy = "lc")
	private List<ItemListadoEntity> insumos;

	@ManyToOne
	private RestaurantEntity restauranteLista;
	@ManyToOne
	private LocalEntity listasCompras;

	public ListadoComprasEntity(Integer idListadoCompras, String areaSolicitante, List<ItemListadoEntity> insumos) {
		super();
		this.idListadoCompras = idListadoCompras;
		AreaSolicitante = areaSolicitante;
		this.insumos = insumos;
	}

	public ListadoComprasEntity() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdListadoCompras() {
		return idListadoCompras;
	}

	public void setIdListadoCompras(Integer idListadoCompras) {
		this.idListadoCompras = idListadoCompras;
	}

	public String getAreaSolicitante() {
		return AreaSolicitante;
	}

	public void setAreaSolicitante(String areaSolicitante) {
		AreaSolicitante = areaSolicitante;
	}

	public List<ItemListadoEntity> getInsumos() {
		return insumos;
	}

	public void setInsumos(List<ItemListadoEntity> insumos) {
		this.insumos = insumos;
	}

}
