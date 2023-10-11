/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.service;

import ma.projet.util.Util;
import java.util.List;
import ma.projet.dao.IDao;
import ma.projet.entities.Client;
import ma.projet.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author hp
 */
public class ClientService implements IDao<Client>{
    @Override
    public boolean create(Client o){
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            o.setPassword(Util.MD5(o.getPassword()));
            
            session.save(o);
            tx.commit();
            return true;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return false;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
    @Override
        public boolean update(Client o){
            Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            o.setPassword(Util.MD5(o.getPassword()));
            session.update(o);
            tx.commit();
            return true;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return false;
        } finally {
            if (session != null) {
                session.close();
            }
        }
        }
        @Override
        public boolean delete(Client o){
            Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.delete(o);
            tx.commit();
            return true;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return false;
        } finally {
            if (session != null) {
                session.close();
            }
        }
        }
        @Override
    public List<Client> findAll() {
        List<Client> categories = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            categories = session.createQuery("from Categorie").list();
            tx.commit();
            return categories;
        } catch (HibernateException ex) {
            if(tx != null)
                tx.rollback();
            return categories;
        } finally {
            if(session != null)
                session.close();
        }
    }



        public Client findById(int id){
            Client employee= null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            employee= (Client) session.get(Client.class, id);
            tx.commit();
            return employee;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return employee;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
        @Override
        public  Client getByEmail(String email){
            Client c = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        c = (Client) session.createQuery("from Client where email = ?").setParameter(0, email).uniqueResult();
        session.getTransaction().commit();
        return c;

        } 
    }



