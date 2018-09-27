package proyectofinal2;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.Array;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class OperacionTest {

    public static void main(String[] args) throws IOException {
        ListaOperacion lista = new ListaOperacion();

        System.out.println("Menu\tOperation\tEnPila");
        Scanner sc = new Scanner(System.in);
        int opcionUsuario;
        String datos;
        boolean flag = false;
               

//            miObjeto.split("5 1 2 PLUS 4 TIMES PLUS 3 LESS");
//            miObjeto.split("2 1.5 TIMES");
//             miObjeto.split("3 2 3 3 4 2 PLUS DIVIDE TIMES PLUS LESS  ");
        Operacion miObjeto = new Operacion();
        do {
            System.out.println("Elija una opcion:");
            System.out.println("1. Ingresar Operacion");
            System.out.println("2. Historial de operaciones");
            System.out.println("3. Imprimir a Notepad");
            System.out.println("4. Salga del programa");
            opcionUsuario = sc.nextInt();
            System.out.println();

            switch (opcionUsuario) {
                case 1:
                    System.out.print("Ingrese operacion: ");
                    datos = sc.next();
                    datos += sc.nextLine();

                    miObjeto.split(datos);
                    System.out.println("_________________________________________________________________");
                    lista.agregar(miObjeto);
                    System.out.println("_________________________________________________________________");
                    break;
                case 2:
                    System.out.println("Historial de operaciones: ");
                    lista.listar();
                    //lista.ordernarAsc();
                    break;
                case 3:
                   
//                    String txt = miObjeto;
//                    try {
//                        //Whatever the file path is.
//                        File OperacionRPN = new File("C:\\Users\\rober\\Desktop\\OperacionRPN.txt");
//                        FileOutputStream fos = new FileOutputStream(OperacionRPN);
//                        OutputStreamWriter osw = new OutputStreamWriter(fos);
//                        Writer writer = new BufferedWriter(osw);
//                        writer.write( );
//                         writer.write((int) lista.getCabeza().data.getAux());
//                        writer.close();
//                    } catch (IOException e) {
//                        System.err.println("Problem writing to the file statsTest.txt");
//                    }

                default:
                    System.out.println("Ha ingresado un numero invalido, vuelva a escoger una opcion");
            }

        } while (flag != true);
    }

}
