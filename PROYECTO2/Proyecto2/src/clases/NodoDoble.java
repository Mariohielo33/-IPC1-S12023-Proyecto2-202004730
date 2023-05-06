/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Pedro
 */
public class NodoDoble {
    private String valor;
    private String rut;
    private NodoDoble siguiente;
    private NodoDoble anterior;

    public NodoDoble(String valor, String rut) {
        this.valor = valor;
        this.rut = rut;
        this.siguiente = null;
        this.anterior=null;  
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public String getValor() {
        return valor;
    }
    
    public String getRut(){
        return rut;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }
    public void setRut(String rut){
        this.rut=rut;
    }
    
    public void setSigAnt(NodoDoble siguiente, NodoDoble anterior){
        this.siguiente=siguiente;
        this.anterior=anterior;
    }
    




}

