/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Telefono;
import java.util.Collection;
import java.util.Scanner;
/**
 *
 * @author JHON
 */
public class VistaTelefono {

    private Scanner teclado;

    public VistaTelefono() {
        teclado = new Scanner(System.in);
    }
    
    public Telefono ingresarTelefono() {
        teclado = new Scanner(System.in);
        System.out.println("_________ingrese los datos del telefono___________");
        System.out.println("Ingrese el codigo");
        String codigo = teclado.next();
        System.out.println("Ingrese numero");
        String numero= teclado.next();
        System.out.println("Ingrese tipo");
        String tipo = teclado.next();
        System.out.println("Ingrese la operadora");
        String operadora=teclado.next();
        return new Telefono(numero, tipo, operadora,codigo);
    }

    public Telefono actualizarTelefono() {
        teclado = new Scanner(System.in);
        System.out.println("_____Ingrese el codigo del telefono a actualizaar______");
        String codigo = teclado.next();
        System.out.println("______Ingrese los nuevos datos del telefono_______");
        System.out.println("Ingrese numero");
        String numero= teclado.next();
        System.out.println("Ingrese tipo");
        String tipo = teclado.next();
        System.out.println("Ingrese la operadora");
        String operadora=teclado.next();
        return new Telefono(numero, tipo, operadora, codigo);
    }

    public Telefono eliminarTelefono() {
        teclado = new Scanner(System.in);
        System.out.println("Ingresa el codigo del telefono a eliminar");
        String codigo = teclado.next();
        return new Telefono(null, null, null, codigo);
    }

    public String buscarTelefono() {
        teclado = new Scanner(System.in);
        System.out.println("Ingresa el codigo del telefono a buscar");
        String codigo = teclado.next();
        return codigo;
    }

    public void verTelefono(Telefono telefono) {
        System.out.println("*******Datos del telefono*******\n " + telefono);
    }

    public void verTelefonos(Collection<Telefono> telefonos) {
        for (Telefono telefono : telefonos) {
           System.out.println("*******Datos  de los telefonos*******\n" +telefono);
        }
    }
 
}
