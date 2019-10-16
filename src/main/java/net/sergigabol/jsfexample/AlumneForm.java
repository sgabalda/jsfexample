/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sergigabol.jsfexample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Inject;
import javax.inject.Named;
import net.sergigabol.jsfexample.business.AlumneBean;
import net.sergigabol.jsfexample.model.Alumne;

/**
 *
 * @author gabalca
 */
@Named
@RequestScoped
public class AlumneForm {
    
    @Inject
    private Alumne alumne;
    
    @EJB
    private AlumneBean alumneBean;
    
    
    public List<String> getEstats(){
        return Arrays.asList("Zimbawe","Botswana","Cambodja");
    }
    
    public void estatChanged(ValueChangeEvent event){
        String newValue = (String)event.getNewValue();
        
        if(newValue.equals("Zimbawe")){
            provincies = Arrays.asList("Zimbawe1","Zim2");
        }else if(newValue.equals("Botswana")){
            provincies = Arrays.asList("Botswana1","Botswana2");
        }else{
            provincies = Arrays.asList("cam1","Cam2");
        }
        
    }
    
    List<String> provincies=Collections.EMPTY_LIST;
    
    public List<String> getProvincies(){
        return provincies;
    }
    
    public String processaEnviamentNouAlumne(){
        System.out.println("Processant enviament de l'alumne "+alumne);
        try{
            alumneBean.saveAlumne(alumne);
            return "success";
        }catch(Exception e){
            System.out.println("Error guardant ");
            return "error";
        }
    }
    
}
