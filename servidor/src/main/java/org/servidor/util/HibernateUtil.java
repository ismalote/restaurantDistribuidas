package org.servidor.util;

import org.hibernate.SessionFactory;


<<<<<<< HEAD
=======
/**
 */
public class HibernateUtil {
>>>>>>> branch 'master' of https://github.com/ismalote/restaurantDistribuidas.git




public class HibernateUtil
{
    private static final SessionFactory sessionFactory;
    static
    {
        try
        {
        	 AnnotationConfiguration config = new AnnotationConfiguration();
       
             sessionFactory = config.buildSessionFactory();
        }
        catch (Throwable ex)
        {
            System.err.println("Initial SessionFactory creation failed. -->" + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }
}