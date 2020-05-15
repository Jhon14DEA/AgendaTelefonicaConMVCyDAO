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
            //vista
            VistaUsuario vistaUsuario = new VistaUsuario();
            VistaTelefono vistaTelefono = new VistaTelefono();
            //daos
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            TelefonoDAO telefonoDAO = new TelefonoDAO();

            ControladorUsuario controladorUsuario = new ControladorUsuario(vistaUsuario, vistaTelefono, usuarioDAO, telefonoDAO);
            int numero = entrada.nextInt();
            switch (numero) {
                //El usuario podra registrarce
                case 1:
                    //guarda un cliente atraves del controlador
                    controladorUsuario.registrar();
                    // controladorUsuario.verUsuario();
                    break;
                //Iniciar sesion con su correo y contraseña
                case 2:
                    boolean submenu = true;
                    while (submenu) {
                        System.out.println("╠░░░░░░ -INICIAR SESION- ░░░░░░");
                        System.out.println("1: Registrar\n"
                                + "2: Modificar.\n"
                                + "3: eliminar.\n"
                                + "4: buscar.\n"
                                + "5: listar sus teléfon.\n"
                                + "6: Salir");
                        switch (numero) {
                            case 1:
                                controladorUsuario.agregarUsuario();
                                break;
                            case 2:
                                controladorUsuario.actualizarUsuario();
                                break;
                            case 3:
                                controladorUsuario.eliminarUsuario();
                                break;
                            case 4:
                                controladorUsuario.actualizarUsuario();
                                break;
                            case 5:
                            //controladorUsuario.telefo();
                            case 6:
                                submenu = false;
                                break;
                            default:
                                System.out.println("Opcion incorrecta");
                                break;
                        }
                    }

                    break;
                case 3:
                    //Listar los numeros de telefono de un usuario usando su numero de cedula

                    break;
                case 4:
                    controladorUsuario.verUsuarios();

                case 5:
                    System.out.println("Fin del algoritmo");
                    menu = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }
    }
}
