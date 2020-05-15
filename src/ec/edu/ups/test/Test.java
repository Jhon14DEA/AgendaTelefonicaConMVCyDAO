/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.controlador.ControladorUsuario;
import ec.edu.ups.controlador.ControladorTelefono;
import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.vista.VistaUsuario;
import ec.edu.ups.vista.VistaTelefono;
import ec.edu.ups.modelo.Usuario;
import java.util.Scanner;

/**
 *
 * @author JHON
 */
public class Test {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        boolean menu = true;
        System.out.println("📱 📱 📱 📱 ✆AGENDA TELEFONICA✆ 📱 📱 📱 📱");
        while (menu) {
            System.out.println("\n✆✆✆✆✆✆✆ MENU ✆✆✆✆✆✆✆");
            System.out.println("1: Registrarce.\n"
                    + "2: Iniciar sesion.\n"
                    + "3: Listar Telefonos.\n"
                    + "4: Listar telefono\n"
                    + "5: Salir\n\n");

            VistaUsuario vista = new VistaUsuario();
            VistaTelefono vistaT = new VistaTelefono();
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            TelefonoDAO telefonoDAO = new TelefonoDAO();
            ControladorUsuario controladorUsuario = new ControladorUsuario(vista, vistaT, usuarioDAO, telefonoDAO);
            ControladorTelefono controladorTelefono = new ControladorTelefono(vistaT, telefonoDAO);

            int numero = entrada.nextInt();
            switch (numero) {
                case 1:
                    System.out.println("---Registrar Usuario---");
                    controladorUsuario.registrar();
                    System.out.println("Usuarios Registrados");
                    controladorUsuario.verUsuarios();
                    break;

                case 2:
                    System.out.println("---Iniciar Secion---");
                    String cedula = verificarSesion();
                    if (cedula == null) {
                        break;
                    }
                    boolean salir = false;
                    while (salir == false) {
                        System.out.println("-INICIAR SESION- â–‘â–‘â–‘â–‘â–‘â–‘");
                        System.out.println("1: Registrar\n"
                                + "2: Modificar.\n"
                                + "3: eliminar.\n"
                                + "4: buscar.\n"
                                + "5: listar sus telÃ©fon.\n"
                                + "6: Salir");

                        int respuesta2 = entrada.nextInt();

                        switch (respuesta2) {
                            case 1:
                                System.out.println("---Registrar telefono---");
                                controladorTelefono.registrar();
                                controladorUsuario.agregarTelefono(cedula);
                                break;
                            case 2:
                                System.out.println("---Modificar telefono---");
                                controladorTelefono.actualizar();
                                controladorUsuario.actualizarTelefono(cedula);
                                break;
                            case 3:
                                System.out.println("---Eliminar telefono---");
                                controladorTelefono.eliminar();
                                controladorUsuario.eleiminarTelefono(cedula);
                                break;
                            case 4:
                                System.out.println("---Buscar telefono---");
                                controladorUsuario.buscarTelefono(cedula);
                                break;
                            case 5:
                                System.out.println("---Lista de telefonos del usuario---");
                                controladorUsuario.listaTelefonos(cedula);
                                break;
                            case 6:
                                System.out.println("---Salir---");
                                salir = true;
                                break;
                        }
                    }

                    break;
                case 3:
                    System.out.println("---Lista de telefonos---");
                    controladorTelefono.verTelefonos();
                    break;
                case 4:
                    System.out.println("---Lista de Usuarios---");
                    controladorUsuario.verUsuarios();
                    break;
                case 5:
                    System.out.println("---Fin del programa---");
                    menu = true;
                    break;

            }
             
    }
          

}   
    public static String verificarSesion() {
        Usuario usuario = new Usuario();
        VistaUsuario vista = new VistaUsuario();
        VistaTelefono vistaT = new VistaTelefono();
        TelefonoDAO telefonoDAO = new TelefonoDAO();
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        ControladorUsuario controladorUsuario = new ControladorUsuario(vista, vistaT, usuarioDAO, telefonoDAO);
         Usuario usuario1 = controladorUsuario.verificar();
        if (usuario1 == null) {
            return null;
        } else {
            return usuario1.getCedula();
        }
    }
}

    
    

