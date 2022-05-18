package br.com.ifce.connection;

import java.lang.module.Configuration;
import java.util.Properties;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import br.com.ifce.model.Filme;

public class Connection {
    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory(){
        if(sessionFactory == null){
            try{
                org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration();

                Properties settings = new Properties();

                settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                settings.put(Environment.URL, "jdbc:mysql://localhost:3306/hibernate_seu_banco_de_dados?useSSL=false");
                settings.put(Environment.USER, "root");
                settings.put(Environment.PASS, "1234");
                settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");

                settings.put(Environment.SHOW_SQL, "true");

                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

                settings.put(Environment.HBM2DDL_AUTO, "create-drop");

                configuration.setProperties(settings);
                
                configuration.addAnnotatedClass(Filme.class);

                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySetting(configuration.getProperty()).build();

                sessionFactory = configuration.buildSessionFactory(serviceRegistry);

            } catch (Exception e){
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}
