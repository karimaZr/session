/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.service;

import antlr.Utils;
import java.util.List;
import ma.projet.dao.IDao;
import ma.projet.entities.Employee;
import ma.projet.util.HibernateUtil;
import ma.projet.util.Util;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author hp
 */
public class EmployeeService implements IDao<Employee>{
    @Override
    public boolean create(Employee o){
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
        public boolean update(Employee o){
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
        public boolean delete(Employee o){
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
    public List<Employee> findAll() {
        List<Employee> categories = null;
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



        public Employee findById(int id){
            Employee employee= null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            employee= (Employee) session.get(Employee.class, id);
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
        public  Employee getByEmail(String email){
            Employee c = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        c = (Employee) session.createQuery("from Client where email = ?").setParameter(0, email).uniqueResult();
        session.getTransaction().commit();
        return c;

        } 
    }

