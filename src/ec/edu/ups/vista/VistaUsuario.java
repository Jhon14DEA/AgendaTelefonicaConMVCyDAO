/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Usuario;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author JHON
 */
public class VistaUsuario {

    private Scanner entrada;

    public VistaUsuario() {
        entrada = new Scanner(System.in);
    }

    public Usuario ingreseUsuario() {
        entrada = new Scanner(System.in);
        System.out.println("__________Ingrese los datos del usuario________");
        System.out.println("Ingrese el numero de cedula del usuario");
        String cedula = entrada.next();
        System.out.println("Ingrese el nombre del ususario");
        String nombre = entrada.next();
        System.out.println("Ingrese el apellido del ususario");
        String apeliido = entrada.next();
        System.out.println("Ingrese eel correo electronico del ususario");
        String correo = entrada.next();
        System.out.println("Ingrese la contraseña del ususario");
        String contrasena = entrada.next();
        return new Usuario(cedula, nombre, apeliido, correo, contrasena);
    }

    public Usuario actualizarUsuario() {
        entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de cedula del cliente a actualizar");
        String cedula = entrada.next();
        System.out.println("Ingrese el nombre del ususario");
        String nombre = entrada.next();
        System.out.println("Ingrese el apellido del ususario");
        String apeliido = entrada.next();
        System.out.println("Ingrese eel correo electronico del ususario");
        String correo = entrada.next();
        System.out.println("Ingrese la contraseña del ususario");
        String contrasena = entrada.next();
        return new Usuario(cedula, nombre, apeliido, correo, contrasena);
    }

    public Usuario eliminarUsuario() {
        entrada = new Scanner(System.in);
        System.out.println("Ingrese la contraseña del usuario a eliminar");
        String cedula = entrada.next();
        return new Usuario(cedula, null, null, null, null);
    }

    public String buscarUsuario() {
        entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de cedula del usuario a buscar");
        String cedula = entrada.next();
        return cedula;
    }

    public void verUsuario(Usuario usuario) {
        System.out.println("Datos del usuario: " + usuario);
    }

    public void verUsuarios(List<Usuario> usuario) {
        for (Usuario usuario1 : usuario) {
            System.out.println("Datos del usuario; " + usuario);
        }
    }
}
