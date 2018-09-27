/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal2;

import java.util.*;

/**
 *
 * @author rober
 */
public class Operacion implements ValidaStringInt, Comparable {

    PilaOperacion<Double> miPila = new PilaOperacion<>();

    private String exprAux;
    private Double aux;

    public String getExprAux() {
        return exprAux;
    }

    public Double getAux() {
        return aux;
    }

    public void setAux(Double aux) {
        this.aux = aux;
    }

    public Operacion(String exprAux) {
        this.exprAux = exprAux;
    }

    public Operacion() {
    }

    public Operacion(String exprAux, Double aux) {
        this.exprAux = exprAux;
        this.aux = aux;
    }
    
   

    public void split(String expr) {
        this.exprAux = expr;
        String[] cadena = expr.split("\\s");

        System.out.println(Arrays.toString(cadena));
        System.out.println("Input\tOperation\tEnPila");

        for (String partesCadena : cadena) {
            //sYSTEM MUESTRA INPUT INGRESADO POR USUARIO 
            System.out.print(partesCadena + "\t");

            if (isNumber(partesCadena)) {
                miPila.push(Double.valueOf(partesCadena));
                System.out.print("Push->\t\t");
            }

            switch (partesCadena) {
                case "PLUS":
                    System.out.print("+\t\t");
                    miPila.push(miPila.pop() + miPila.pop());
                    break;
                case "LESS":
                    System.out.print("-\t\t");
                    miPila.push(-miPila.pop() + miPila.pop());
                    break;
                case "TIMES":
                    System.out.print("*\t\t");
                    miPila.push(miPila.pop() * miPila.pop());
                    break;
                case "DIVIDE":
                    System.out.print("/\t\t");
                    if (miPila.pop() == 0.0) {
                        throw new ArithmeticException("Cannot divide by zero!");
                    }
                    miPila.push(miPila.pop() / miPila.pop());
                    break;
            }
            //SYSTEM MUESTRA LO QUE HAY EN PILA 
            System.out.println(miPila);
        }
        aux = miPila.pop();
        System.out.println("Final Answer: " + aux);
        
//        NodoPilaOperacion numDouble = new NodoPilaOperacion();
//        numDouble.setData(aux);
        

    }

    @Override
    public boolean isNumber(String expr) {
        if (expr == null) {
            return false;
        }
        try {
            Double.parseDouble(expr);

        } catch (NumberFormatException nfe) {
            //System.out.print("Error: 123456");
            //porque si dejo el mensaje lanza error?
            return false;
        }
        return true;
    }

    @Override
    public Double compareTo(Operacion opera) {

        return (this.aux - opera.getAux());
    }
}
