package org.servidor.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.servidor.entities.AdministracionEntity;
import org.servidor.entities.AreaEntity;
import org.servidor.entities.AreaProduccionEntity;
import org.servidor.entities.CajaEntity;
import org.servidor.entities.CartaEntity;
import org.servidor.entities.ComandaEntity;
import org.servidor.entities.DepositoCentralEntity;
import org.servidor.entities.DepositoEntity;
import org.servidor.entities.ElaboradoEntity;
import org.servidor.entities.EncargadoAreaEntity;
import org.servidor.entities.EncargadoCajaEntity;
import org.servidor.entities.EncargadoEntity;
import org.servidor.entities.EstadoMesaEntity;
import org.servidor.entities.FacturaEntity;
import org.servidor.entities.InsumoEntity;
import org.servidor.entities.ItemComandaEntity;
import org.servidor.entities.ItemListadoEntity;
import org.servidor.entities.ItemPlandeProduccionEntity;
import org.servidor.entities.ItemStockEntity;
import org.servidor.entities.LimpiezaEntity;
import org.servidor.entities.ListadoComprasEntity;
import org.servidor.entities.LocalEntity;
import org.servidor.entities.MateriaPrimaEntity;
import org.servidor.entities.MesaEntity;
import org.servidor.entities.MozoEntity;
import org.servidor.entities.PlandeProduccionEntity;
import org.servidor.entities.PlatoEntity;
import org.servidor.entities.ProductoComestibleEntity;
import org.servidor.entities.ReservaEntity;
import org.servidor.entities.RestaurantEntity;
import org.servidor.entities.SalonEntity;
import org.servidor.entities.SectorEntity;
import org.servidor.entities.SemiElaboradoEntity;
import org.servidor.entities.StockEntity;

public class HibernateUtil {

	private static final SessionFactory sessionFactory;
	static {
		try {
			Configuration config = new Configuration();
			config.addAnnotatedClass(AdministracionEntity.class);
			config.addAnnotatedClass(AreaEntity.class);
			config.addAnnotatedClass(AreaProduccionEntity.class);
			config.addAnnotatedClass(CajaEntity.class);
			config.addAnnotatedClass(CartaEntity.class);
			config.addAnnotatedClass(ComandaEntity.class);
			config.addAnnotatedClass(DepositoCentralEntity.class);
			

			config.addAnnotatedClass(DepositoEntity.class);
			config.addAnnotatedClass(ElaboradoEntity.class);
			config.addAnnotatedClass(EncargadoAreaEntity.class);
			config.addAnnotatedClass(EncargadoCajaEntity.class);
			config.addAnnotatedClass(EncargadoEntity.class);
			config.addAnnotatedClass(EstadoMesaEntity.class);
			config.addAnnotatedClass(FacturaEntity.class);

	
			config.addAnnotatedClass(InsumoEntity.class);
			config.addAnnotatedClass(ItemComandaEntity.class);
			config.addAnnotatedClass(ItemListadoEntity.class);
			config.addAnnotatedClass(ItemPlandeProduccionEntity.class);
			config.addAnnotatedClass(ItemStockEntity.class);
			config.addAnnotatedClass(LimpiezaEntity.class);
			config.addAnnotatedClass(ListadoComprasEntity.class);
			config.addAnnotatedClass(LocalEntity.class);
			config.addAnnotatedClass(MateriaPrimaEntity.class);
			config.addAnnotatedClass(MesaEntity.class);
			config.addAnnotatedClass(MozoEntity.class);
			config.addAnnotatedClass(PlandeProduccionEntity.class);
			config.addAnnotatedClass(PlatoEntity.class);
			config.addAnnotatedClass(ProductoComestibleEntity.class);

			
			config.addAnnotatedClass(ReservaEntity.class);
			config.addAnnotatedClass(SalonEntity.class);
			config.addAnnotatedClass(SectorEntity.class);
			config.addAnnotatedClass(RestaurantEntity.class);
			config.addAnnotatedClass(SemiElaboradoEntity.class);
			config.addAnnotatedClass(StockEntity.class);

			
			sessionFactory = config.buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed. -->" + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}