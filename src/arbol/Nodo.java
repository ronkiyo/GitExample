/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;

/**
 *
 * @author Armando Ronquillo
 */
public class Nodo {
    
    private final int dato;
    private Nodo izq;
    private Nodo der;
    
    //Constructor 
    public Nodo(int dato){
        this.dato = dato;
    }
    //Para saber el nodo izquierdo
    public Nodo getNodoIzquierdo(){
        return izq;
    }
    //Para saber el nodo derecho
    public Nodo getNodoDerecho(){
        return der;
    }
    //Se crea nodo derecho
    public void setNodoDerecho(Nodo nodo){
        der = nodo;
    }
    //Se crea nodo Izquierdo
    public void setNodoIzquierdo(Nodo nodo){
        izq = nodo;
    }
    
    public int getDato(){
        return dato;
    }
    
}
