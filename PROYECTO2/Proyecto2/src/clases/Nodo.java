/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.io.Serializable;

/**
 *
 * @author Pedro
 */
public class Nodo implements Serializable {
    
    private String usuarioo;
    private Nodo siguiente;

    public Nodo(String usuarioo) {
        this.usuarioo = usuarioo;
        this.siguiente = null;
    }
    public Nodo getSiguiente(){
        return siguiente;
    }
    public String getUsu(){
        return usuarioo;
    }
    public void setSiguiente(Nodo siguiente){
        this.siguiente=siguiente;
    }
    public void setUsu(String usuarioo){
        this.usuarioo=usuarioo;
    }
}
