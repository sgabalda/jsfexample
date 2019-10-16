/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sergigabol.jsfexample.validators;

import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Named;

/**
 *
 * @author gabalca
 */
@Named
@RequestScoped
public class DatesBean {
    
    //metode que valida que la data sigui anterior a l'actual
    public void validateDatePast(FacesContext context, UIComponent ui,Object value){
        Date data = (Date)value;
        if((new Date()).before(data)){
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "Data invàlida al camp "+ui.getClientId(),
                    "La data de naixement no pot ser al futur ");
            
            throw new ValidatorException(message);
        }
    }
    
}
