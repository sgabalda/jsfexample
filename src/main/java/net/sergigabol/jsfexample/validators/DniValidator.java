/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sergigabol.jsfexample.validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import net.sergigabol.jsfexample.model.Dni;

/**
 *
 * @author gabalca
 */
@FacesValidator("dniValidator")
public class DniValidator implements Validator<Dni>{

    @Override
    public void validate(FacesContext fc, UIComponent uic, Dni t) throws ValidatorException {
        String lletres = "TRWAGMYFPDXBNJZSQVHLCKET";
        int index = t.getNumero()%23;
        if(t.getLletra()!=lletres.charAt(index)){
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "DNI incorrecte al camp "+uic.getClientId(),
                    "La lletra del DNI no correspon al número");
            throw new ValidatorException(message);
        }
    }
    
}
