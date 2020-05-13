/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Telefono;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author JHON
 */
public class VistaTelefono {

    private Scanner entrada;

    public VistaTelefono() {
        entrada = new Scanner(System.in);
    }

    public Telefono ingresarTelefono() {
        entrada = new Scanner(System.in);
        System.out.println("_________ingrese los datos del telefono___________");
        System.out.print("Ingrese el codigo: ");
        int codigo = entrada.nextInt();
        System.out.print("Ingrese el numero: ");
        String numero = entrada.next();
        System.out.print("Ingrese el tipo: ");
        String tipo = entrada.next();
        System.out.print("ingrese la operadoara: ");
        String operadora = entrada.next();

        return new Telefono(codigo, numero, tipo, operadora);

    }
    public Telefono actualizarelefono(){
    entrada = new Scanner(System.in);
        System.out.println("_____Ingrese el codigo del telefono a actualizaar______");
        int codigo = entrada.nextInt();
        System.out.println("______Ingrese los nuevos datos del telefono_______");
        System.out.print("Ingrese el numero: ");
        String numero = entrada.next();
        System.out.print("Ingrese el tipo: ");
        String tipo = entrada.next();
        System.out.print("ingrese la operadoara: ");
        String operadora = entrada.next();
        return new Telefono(codigo, numero, tipo, operadora);               
    }
   public Telefono eliminarTelefono() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa el codigo del telefono a eliminar");
        int  codigo  = entrada.nextInt();
        return new Telefono(codigo, null, null, null);
    }

    public int buscarTelefono() {
        entrada = new Scanner(System.in);
        System.out.println("Ingrese el codigo del telefono a buscar");
        int codigo = entrada.nextInt();
        return codigo;
    }

    public void verTelefono(Telefono  telefono) {
        System.out.println("*******Datos datos del telefono*******\n " + telefono);
    }

    public void verTelefonos(List<Telefono>telefonos) {
        for (Telefono telefono : telefonos) {
            System.out.println("*******Datos  de los telefonos*******\n" +telefono);
        }
    }
 
}
