/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sergigabol.jsfexample.business;

import javax.ejb.Stateless;
import net.sergigabol.jsfexample.model.Alumne;

/**
 *
 * @author gabalca
 */
@Stateless
public class AlumneBean {
    
    public void saveAlumne(Alumne a){
        if(Math.random()>0.5){
            throw new RuntimeException();
        }
    }
    
}
