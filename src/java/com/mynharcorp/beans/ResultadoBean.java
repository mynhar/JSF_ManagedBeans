/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mynharcorp.beans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Harold M Bonilla L
 */
@Named(value = "resultadoBean")
@RequestScoped
public class ResultadoBean {
    
    private String resultado;

    /**
     * Creates a new instance of ResultadoBean
     */
    public ResultadoBean() {
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

}
