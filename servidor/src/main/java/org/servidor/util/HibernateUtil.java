package org.servidor.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.servidor.entities.AdministracionEntity;
import org.servidor.entities.AreaProduccionEntity;
import org.servidor.entities.CajaEntity;
import org.servidor.entities.CartaEntity;
import org.servidor.entities.CierredeCajaEntity;
import org.servidor.entities.ComandaEntity;
import org.servidor.entities.DepositoCentralEntity;
import org.servidor.entities.DepositoEntity;
import org.servidor.entities.EncargadoAreaEntity;
import org.servidor.entities.EncargadoCajaEntity;
import org.servidor.entities.EncargadoEntity;
import org.servidor.entities.FacturaEntity;
import org.servidor.entities.InsumoEntity;
import org.servidor.entities.ItemComandaEntity;
import org.servidor.entities.ItemListadoEntity;
import org.servidor.entities.ItemPlandeProduccionEntity;
import org.servidor.entities.ItemStockEntity;
import org.servidor.entities.LimpiezaEntity;
import org.servidor.entities.ListadoComprasEntity;
import org.servidor.entities.LocalEntity;
import org.servidor.entities.MesaCompuestaEntity;
import org.servidor.entities.MesaEntity;
import org.servidor.entities.MesaSimpleEntity;
import org.servidor.entities.MozoEntity;
import org.servidor.entities.PlandeProduccionEntity;
import org.servidor.entities.PlatoEntity;
import org.servidor.entities.ProductoComestibleEntity;
import org.servidor.entities.ProductoSimpleEntity;
import org.servidor.entities.ReservaEntity;
import org.servidor.entities.SemiElaboradoEntity;
import org.servidor.entities.StockEntity;

public class HibernateUtil {

	private static final SessionFactory sessionFactory;
	static {
		try {
			Configuration config = new Configuration();

			config.addAnnotatedClass(InsumoEntity.class);
			// config.addAnnotatedClass(EstadoMesaEntity.class);
			config.addAnnotatedClass(ItemStockEntity.class);
			config.addAnnotatedClass(StockEntity.class);
			config.addAnnotatedClass(AreaProduccionEntity.class);
			config.addAnnotatedClass(ReservaEntity.class);

			config.addAnnotatedClass(MozoEntity.class);
			config.addAnnotatedClass(MesaEntity.class);
			config.addAnnotatedClass(MesaSimpleEntity.class);
			config.addAnnotatedClass(MesaCompuestaEntity.class);

			config.addAnnotatedClass(EncargadoEntity.class);
			config.addAnnotatedClass(EncargadoAreaEntity.class);
			config.addAnnotatedClass(EncargadoCajaEntity.class);

			config.addAnnotatedClass(CajaEntity.class);
			config.addAnnotatedClass(CierredeCajaEntity.class);

			config.addAnnotatedClass(ItemComandaEntity.class);
			config.addAnnotatedClass(ComandaEntity.class);

			config.addAnnotatedClass(DepositoCentralEntity.class);
			config.addAnnotatedClass(LimpiezaEntity.class);

			config.addAnnotatedClass(ProductoComestibleEntity.class);

			config.addAnnotatedClass(SemiElaboradoEntity.class);
			config.addAnnotatedClass(ProductoSimpleEntity.class);

			config.addAnnotatedClass(PlatoEntity.class);
			config.addAnnotatedClass(CartaEntity.class);

			config.addAnnotatedClass(ItemListadoEntity.class);
			config.addAnnotatedClass(ItemPlandeProduccionEntity.class);

			config.addAnnotatedClass(PlandeProduccionEntity.class);
			config.addAnnotatedClass(AdministracionEntity.class);

			config.addAnnotatedClass(DepositoEntity.class);
			config.addAnnotatedClass(FacturaEntity.class);

			config.addAnnotatedClass(ListadoComprasEntity.class);

			config.addAnnotatedClass(LocalEntity.class);

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