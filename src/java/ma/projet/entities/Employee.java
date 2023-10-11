/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.entities;

import java.util.logging.Logger;
import javax.persistence.Entity;

/**
 *
 * @author hp
 */
import javax.persistence.Entity;

/**
 *
 * @author YOUNSE
 */
@Entity
public class Employee extends User {
 
    public Employee() {
    }  

    public Employee(String email, String password) {
        super(email, password);
    }
    
}  
