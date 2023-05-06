/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import javax.swing.JOptionPane;
import proyecto2.EstructuraDeDatos;

/**
 *
 * @author Pedro
 */
public class ListaDobleenlazada extends EstructuraDeDatos{
    
    private NodoDoble inicio;
    private final String msj1;
    private NodoDoble recorrido;
    
    public ListaDobleenlazada(){
        this.index=0;
        this.inicio=null;
        this.recorrido=null;
        this.msj1= "La imagen con el nombre ";
        this.nombre="";
    }

  
    public void mostrarNormal(){
        NodoDoble temporal = this.inicio;
        while(temporal!=null){
            System.out.println("El valor del nodo es:" +temporal.getValor());
            temporal = temporal.getSiguiente();
        }
    }
    
    public void mostrarReversa(){
        NodoDoble temporal = this.inicio;
        while(temporal.getSiguiente() != null){
            temporal = temporal.getSiguiente();
        }
        while(temporal != null){
            System.out.println("El valor del nodo es: " +temporal.getValor());
            temporal = temporal.getAnterior();
        }
    }

    @Override
    public void add(Object e) {
        
    NodoDoble newImage = (NodoDoble)e;
    if(find(newImage.getValor())== null){
            /* Si es la primera imagen */
            if(this.index==0) addFirstImage(newImage);
            else{
                newImage.setSigAnt(inicio.getAnterior().getSiguiente(), inicio.getAnterior());
                if(index==1) inicio.setSigAnt(newImage, newImage);
                else{
                    inicio.getAnterior().setSiguiente(newImage);
                    inicio.setAnterior(newImage);
                }
                ImagenAgregada(newImage.getValor());
            }
        }
        /* Si ya existe se muentra un mensaje */
        else Mensaje("Ya existe una imagen con el nombre "+ newImage.getValor());
    }
    
        private void addFirstImage(NodoDoble newImage){
        /* ****************************************************************** *
         * Al ser el primer elemento de la lista y al ser una lista circular  *
         * se deben los apuntadores en esta caso hacia el mismo               *
         * ****************************************************************** * */
        newImage.setSigAnt(newImage, newImage);
        /* Ahora si asigna a start la nueva imagen ya que ahi inicia la lista */
        inicio = newImage;
        ImagenAgregada(newImage.getValor());
    }
    
    private void ImagenAgregada(String nombre){
        Mensaje(msj1+nombre+" se agrego a la lista");
        this.index++;
    }
        private void Mensaje(String m){
        //System.out.println(m);
        JOptionPane.showMessageDialog(null, m);
    }
           
    
    public Object getBack() {
        if(recorrido==null) recorrido = inicio;
        recorrido = recorrido.getAnterior();
        //System.out.println("Nombre "+recorrido.getName());
        return recorrido;
    }
    
       
    @Override
    public Object peek() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object find(Object e) {
        /* Seconvierte el objeto recibido a un String */
        String name = (String)e;
        /* Se crea un Nodo temporal que se usara para recorrer la lista */
        NodoDoble actual = inicio;
        /* Se recorre la lista usando un for usando como limite la cantidad de elementos en ella */
        for (int i = 0; i < index; i++) {
            /* ************************************************************** *
             * Se verifica si el nombre elemento analizdo son iguales con el  *
             * nombre ingresado si son iguales regresa el elemento            *
             * ************************************************************** */
            if(actual.getValor().equals(name)) return actual;
            /* Si son diferentes se mueve al siguiente elemento */
            else actual = actual.getSiguiente();
        }
        return null;
    }

    @Override
    public Object getNext() {
        if(recorrido==null) recorrido = inicio;
        recorrido = recorrido.getSiguiente();
        //System.out.println("Nombre "+recorrido.getName());
        return recorrido;
    }

    @Override
    public int getSize() {
        return this.index;
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
        /* ********************************************************************
         * Se busca el elemento usando el metodo Find y asignandolo a una     *
         * variable de tipo objeto                                            *
         * ****************************************************************** */
        Object imagenAEliminar = find(e);
        /* ********************************************************************
         * Se verifica que lo que se obtuvo es diferente de null para poder   *
         * convertirlo a nuestro nodo de tipo ImagenP                         *
         * ****************************************************************** */
        if(imagenAEliminar!=null){
            /* Se convierte el objeto a tipo ImagenP */
            NodoDoble actual = (NodoDoble)imagenAEliminar;
            /* ************************************************************** *
             * Si solo existe una imagen en la lista y se elimina solo se     *
             * reinicia la variable start con null                            *
             * ************************************************************** */
            if(index==1) inicio = null;
            /* ************************************************************** *
             * Si existe mas de una imagen se deben cambiar los apuntadores   *
             * de la imagen anterior y siguiente del la imagen actual         *
             *  - Se le indica a la imagen anterior que su siguiente es la    *
             *    imagen siguiente de actual                                  *
             *  - Se le indica a la imagen siguiente que su anterior es la    *
             *    imagen anterior de actual                                   *
             * ************************************************************** */
            else{
                actual.getAnterior().setSiguiente(actual.getSiguiente());
                actual.getSiguiente().setAnterior(actual.getAnterior());
            }
            Mensaje(msj1+actual.getValor()+" se ha eliminado de la lista");
            /* Se reduce en uno la cantidad de elementos en la lista */
            index--;
        }        
        /* ******************************************************************* *
         * Si devuelve un valor null la imagen con el nombre buscado no existe *
         * Por lo que solo se mostrara un mensaje indicando eso                *
         * ******************************************************************* */
        else{
            if(index==0) Mensaje("Eliminacion: Lista vacia");
            else Mensaje(msj1+(String)e+" no existe en la lista");
        }
    }
    
    public void update(String name, String path){
        
        /* ********************************************************************
         * Se busca el elemento usando el metodo Find y asignandolo a una     *
         * variable de tipo objeto                                            *
         * ****************************************************************** */
        Object imagenAEliminar = find(name);
        /* ********************************************************************
         * Se verifica que lo que se obtuvo es diferente de null para poder   *
         * convertirlo a nuestro nodo de tipo ImagenP                         *
         * ****************************************************************** */
        if(imagenAEliminar!=null){
            /* Se convierte el objeto a tipo ImagenP */
            NodoDoble actual = (NodoDoble)imagenAEliminar;
            actual.setRut(path);
            Mensaje(msj1+name+" actualizo la ubicacion");
        }
        else{
            if(index==0) Mensaje("Actualizacion: Lista vacia");
            else Mensaje(msj1+name+" no existe en la lista");
        }
    }
    
}
