package br.ufc.great.juliana.util;

import javax.validation.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.service.ServiceRegistryBuilder;

/*public class HibernateUtil {
    
    private static final SessionFactory sessionFactory;
    
    // Para armazenar a sessão Hibernate
    public static final String HIBERNATE_SESSION = "hibernate_session";
    
    static{
        try {
            System.out.println("Tentando abrir uma SF (session factory)");
            Configuration configuration = new Configuration().configure();
            ServiceRegistryBuilder serviceRegistryBuilder = new ServiceRegistryBuilder();
            sessionFactory = configuration.buildSessionFactory(s);
        } catch (Exception e) {
        }
    }
    
}
*/