package br.com.ifce.repository;

import javax.transaction.Transaction;

import org.hibernate.Session;

import br.com.ifce.connection.Connection;
import br.com.ifce.model.Filme;

public class FilmeRepository {

    public void registerRepository(Filme filme){
        Transaction transaction = null;
        Session session = Connection.getSessionFactory().openSession();

        session.beginTransaction();

        session.save(filme);

        transaction.commit();
    }
    
    public void attRepository(Filme filme){
        Transaction transaction = null;
        Session session = Connection.getSessionFactory().openSession();

        session.beginTransaction();

        session.saveOrUpdate(filme);

        transaction.commit();
    }

    public void removeRepository(Filme filme){
        Transaction transaction = null;
        Session session = Connection.getSessionFactory().openSession();

        session.beginTransaction();

        session.remove(filme);

        transaction.commit();
    }

    public Filme findId(Long id){
        Transaction transaction = null;
        Session session = Connection.getSessionFactory().openSession();

        session.beginTransaction();

        Filme filme = session.get(Filme.class, id);

        transaction.commit();

        return filme;
    }
}
