/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sergigabol.jsfexample.converters;

import java.text.DecimalFormat;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import net.sergigabol.jsfexample.model.Dni;

/**
 *
 * @author gabalca
 */
//@FacesConverter("conversorDni")
@FacesConverter(forClass = Dni.class)
public class DniConverter implements Converter<Dni>{

    @Override
    public Dni getAsObject(FacesContext fc, UIComponent uic, String string) {
        Dni dni = new Dni();
        if(string==null || string.length()!=9){
            //Error, el DNI no es podrà convertir
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "Error en la conversió del DNI al camp "+uic.getClientId(),
                    "La llargada ha de ser 9 caràcters");
            fc.addMessage(uic.getClientId(), message);
            throw new ConverterException(message);
        }
        try{
            dni.setNumero(Integer.parseInt(string.substring(0, 8)));
        }catch(NumberFormatException ex){
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "Error en la conversió del DNI al camp "+uic.getClientId(),
                    "Els primers 8 caràcters han de ser un número");
            fc.addMessage(uic.getClientId(), message);
            throw new ConverterException(message);
        }
        
        dni.setLletra(string.charAt(8));
        return dni;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Dni t) {
        return new DecimalFormat("########").format(t.getNumero())+t.getLletra();
    }
    
}
