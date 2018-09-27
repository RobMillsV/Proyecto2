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
public class ListaOperacion {
//    ListaOperacion listaTemp = new ListaOperacion();

    private NodoListaOperacion cabeza;
    private NodoListaOperacion listado;
    private int contador;

    public NodoListaOperacion getCabeza() {
        return cabeza;
    }

    public int getContador() {
        return contador;
    }

    public void setCabeza(NodoListaOperacion cabeza) {
        this.cabeza = cabeza;
        cabeza = listado;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public ListaOperacion() {
    }

    public ListaOperacion(NodoListaOperacion cabeza) {
        this.cabeza = cabeza;
    }

    public void agregar(Operacion operacion) {
        if (operacion == null) {
            return;
        }

        NodoListaOperacion nodo = new NodoListaOperacion();
        nodo.setData(operacion);
        if (this.getContador() == 0) {
            cabeza = nodo;
                  } else {
            nodo.setNext(cabeza);
            cabeza = nodo;
          //  listado = cabeza;
            System.out.println("se agrego: " + nodo.getData().getExprAux());
          }
        contador++;
        System.out.println("Se calcularon: " + this.getContador() + " operaciones");
    }

    public void listar() {
        NodoListaOperacion lista = getCabeza();
        listado = lista;

        try {
            int conta = this.getContador();

            while (conta > 0) {

                for (int i = 0; i < conta; i++) {
                    System.out.println("Contador: " + conta);
                    System.out.println("Operacion: " + listado.getData().getExprAux());
                    System.out.println("Resultado: " + listado.getData().getAux());
                    System.out.println();
                    System.out.println("- - - - - - - - - - - - - - -");
                    Operacion aux = lista.getData();

                    listado.setData(aux);
                    listado = listado.getNext();
                    conta--;
                }
                

            }

        } catch (Throwable error) {
            System.out.println("Error: " + error);
        }
        //return null;
    }

    public void ordernarAsc() {
        ListaOperacion nueva = new ListaOperacion();
        NodoListaOperacion nodo;
        nodo = this.cabeza;

        int indice;

        int n = contador;
        for (int i = 0; i <= n - 1; i++) {
            nueva.agregar(nodo.getData());
            indice = i;

            for (int j = i + 1; j <= n; j++) {
                if (nueva.cabeza.getData().compareTo(nodo.getData()) == 0.0) {
                    nueva.cabeza.setData(nodo.getData());
                    System.out.println("IGUAL " + nueva.getCabeza().getData().getAux());
                } else if (nueva.cabeza.getData().compareTo(nodo.getData()) == -1.0) {
                    nueva.cabeza.getNext();
                    System.out.println("ES MENOR " + nueva.getCabeza().getData().getAux());
                }
                nueva.setCabeza(nodo);

                System.out.println("lista nueva " + nueva.getCabeza().getData().getAux());
                indice = j;
                System.out.println("indiceJ: " + j);

                //}
                i = j;
                System.out.println("indiceI: " + i);
                System.out.println("- - - - - - - - - - - - - - - - - - - ");

            }

            nodo = nodo.getNext();
        }
    }
}
