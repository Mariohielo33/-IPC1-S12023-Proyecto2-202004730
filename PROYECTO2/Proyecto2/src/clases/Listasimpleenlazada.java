/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.io.Serializable;
import proyecto2.EstructuraDeDatos;

/**
 *
 * @author Pedro
 */
public class Listasimpleenlazada extends EstructuraDeDatos{
 private Nodo inicio;

    public Listasimpleenlazada() {
        this.inicio = null;
    }
    
    public void add(Object e){
            String name = (String)e;
            Nodo nuevoNodo = new Nodo(name);
        
        if (inicio==null) {
            inicio=nuevoNodo;            
        }else{
          Nodo temporal = inicio;
          while(temporal.getSiguiente()!=null){
            temporal=temporal.getSiguiente();
        }
          temporal.setSiguiente(nuevoNodo);
        }
}
    
//    public void agregar(String usuarioo){
//        Nodo nuevoNodo = new Nodo(usuarioo);
//        
//        if (inicio==null) {
//            inicio=nuevoNodo;            
//        }else{
//          Nodo temporal = inicio;
//          while(temporal.getSiguiente()!=null){
//            temporal=temporal.getSiguiente();
//        }
//          temporal.setSiguiente(nuevoNodo);
//        }
//    }
 public void mostarusuarios(){
     Nodo temporal = inicio;
     while(temporal!=null){
         System.out.println("El ususario es: "+ temporal.getUsu());
         temporal= temporal.getSiguiente();
     }
 }
 
 public void setInicio(Nodo inicio){
     this.inicio=inicio;
 }
 
 public Nodo getInicio(){
     return inicio;
 }
 public boolean estaEnlaLista(String elemento){
     Nodo temporal1 =inicio;
     while(temporal1!=null && !temporal1.getUsu().equals(elemento)){
         temporal1 = temporal1.getSiguiente();
     }
     return temporal1!=null;
 }

    @Override
    public Object peek() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object find(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getNext() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getSize() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object pop() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
