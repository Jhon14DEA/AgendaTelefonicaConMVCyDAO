/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Usuario;
import java.util.Collection;
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

    public Usuario ingresarUsuario() {
        System.out.println("_________________Ingrese los datos del usuario_________________");
        String cedula = entrada.next();
        System.out.println("Ingrese el nombre del ususario");
        String nombre = entrada.next();
        System.out.println("Ingrese el apellido del ususario");
        String apellido = entrada.next();
        System.out.println("Ingrese eel correo electronico del ususario");
        String correo = entrada.next();
        System.out.println("Ingrese la contraseÃ±a del ususario");
        String contraseña = entrada.next();

        return new Usuario(cedula, nombre, apellido, correo, contraseña);
    }

    public Usuario actualizarUsuario() {
        System.out.println("_________________Ingresa la cedula del cliente a actualizar_________________");
        String cedula = entrada.next();
        System.out.println("Ingrese los nuevos Datos de usuario");
        System.out.println("Ingrese el  nombre del usuario");
        String nombre = entrada.next();
        System.out.println("Ingrese el apellido del ususario");
        String apellido = entrada.next();
        System.out.println("Ingrese eel correo electronico del ususario");
        String correo = entrada.next();
        System.out.println("Igrese contraseña del usuario");
        String contraseña = entrada.next();
        return new Usuario(cedula, nombre, apellido, correo, contraseña);
    }

    public Usuario eliminarUsuario() {
        System.out.println("Ingresa la cedula del usuario  a eliminar");
        String cedula = entrada.next();
        return new Usuario(cedula, null, null, null, null);
    }

    public String buscarUsuario() {
        System.out.println("Ingresa la cedula del usuario buscar");
        String cedula = entrada.next();
        return cedula;
    }

    public void verUsuario(Usuario usuario) {
        System.out.println("*******Datos del usuario*******" + usuario);
    }

    public void verUsuarios(Collection<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            System.out.println("*******Datos del los  usuarios*******" + usuario);
        }
    }

    public Usuario iniciarSesion() {
        System.out.println("Ingrese eel correo electronico del ususario ");
        String correo = entrada.next();
        System.out.println("Igrese contraseña del usuario");
        String contraseña = entrada.next();

        return new Usuario(null, null, null, correo, contraseña);
    }

}
