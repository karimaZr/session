/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.util.Date;
import ma.projet.entities.Client;
import ma.projet.entities.Employee;
import ma.projet.service.ClientService;
import ma.projet.service.EmployeeService;
import ma.projet.util.HibernateUtil;
import sun.applet.Main;

/**
 *
 * @author Lachgar
 */
public class Test {
    public static void main (String [] args){
        
        EmployeeService es=new EmployeeService();
        ClientService cs=new ClientService();
        Employee emp1=new Employee("kbdbc;sc","gcskcs");
        es.create(emp1);
        cs.create(new Client("karima","Zrayouil",new Date(2022,12,12),";wnx",",wnw"));
    }
}
