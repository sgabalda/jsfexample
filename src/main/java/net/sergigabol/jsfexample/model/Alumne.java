/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sergigabol.jsfexample.model;

import java.util.Date;
import javax.enterprise.inject.Model;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

/**
 *
 * @author gabalca
 */
@Model
//@ViewScoped
public class Alumne {
    
    private String nom;
    private String cognom;
    private Date naixement;
    private int edat;
    @PositiveOrZero
    private double credit;
    private Dni dni;
    
    private String estat;
    private String provincia;

    public String getEstat() {
        return estat;
    }

    public void setEstat(String estat) {
        this.estat = estat;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    
    public Date getNaixement() {
        return naixement;
    }

    public void setNaixement(Date naixement) {
        this.naixement = naixement;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public Dni getDni() {
        return dni;
    }

    public void setDni(Dni dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }
    
    public void printAlumne(){
        System.out.println("Alumne: "+this);
    }

    @Override
    public String toString() {
        return "Alumne{" + "nom=" + nom + ", cognom=" + cognom + ", naixement=" + naixement + ", edat=" + edat + ", credit=" + credit + ", dni=" + dni + '}';
    }


    
}
