/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mynharcorp.beans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Harold M Bonilla L
 */
@Named(value = "personaBean")
@RequestScoped
public class PersonaBean {
    
    private String nombre;

    /**
     * Creates a new instance of PersonaBean
     */
    public PersonaBean() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Poner en memoria el bean ResultadoBean
     */
    public void transferir(){
        FacesContext contexto = FacesContext.getCurrentInstance();
        ResultadoBean resultado = contexto.getApplication().evaluateExpressionGet(contexto, "#{resultadoBean}", ResultadoBean.class);
        
        resultado.setResultado(this.nombre);
        
    }
    
}
