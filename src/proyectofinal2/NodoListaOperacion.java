/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal2;

/**
 *
 * @author rober
 */
public class NodoListaOperacion {

    private Operacion data;
    private NodoListaOperacion next;
 
    public Operacion getData() {
        return data;
    }

    public void setData(Operacion data) {
        this.data = data;
    }

    public NodoListaOperacion getNext() {
        return next;
    }

    public void setNext(NodoListaOperacion next) {
        this.next = next;
    }

    public NodoListaOperacion() {
    }

    
}
