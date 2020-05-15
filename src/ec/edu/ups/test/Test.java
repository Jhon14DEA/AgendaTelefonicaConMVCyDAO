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
        System.out.println("📱 📱 📱 📱 📱 📱 📱 📱 ✆AGENDA TELEFONICA✆ 📱 📱 📱 📱 📱 📱 📱 📱");
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
                    System.out.println("░░░░░░░░░░░░░░░░  REGISTRAR USUARIO ░░░░░░░░░░░░░░░░");
                    controladorUsuario.registrar();
                    controladorUsuario.verUsuarios();
                    break;

                case 2:
                    System.out.println(" ░░░░░░░░░░░░░░░░ INICIAR SESION ░░░░░░░░░░░░░░░░");
                    String cedula = verificarSesion();
                    if (cedula == null) {
                        break;
                        
                    }else{ 
                        System.out.println("Usuario y contraseña incorrecta");
                    }
                    boolean opcion = false;
                    while (opcion == false) {
                         System.out.println("1: Registrar\n"
                                + "2: Modificar.\n"
                                + "3: eliminar.\n"
                                + "4: buscar.\n"
                                + "5: listar sus telefonos.\n"
                                + "6: Salir");

                        int menu2 = entrada.nextInt();

                        switch (menu2) {
                            case 1:
                                System.out.println("←←←←←←←←←←←← REGISTRAR  ←←←←←←←←←←←←\n");
                                controladorTelefono.registrar();
                                controladorUsuario.agregarTelefono(cedula);
                                break;
                            case 2:
                                System.out.println("←←←←←←←←←←←← MODIFICAR  ←←←←←←←←←←←←\n");
                                controladorTelefono.actualizar();
                                controladorUsuario.actualizarTelefono(cedula);
                                break;
                            case 3:
                                System.out.println("←←←←←←←←←←←← ELIMINAR ←←←←←←←←←←←←\n");
                                controladorTelefono.eliminar();
                                controladorUsuario.eleiminarTelefono(cedula);
                                break;
                            case 4:
                                System.out.println("←←←←←←←←←←←← BUSCAR ←←←←←←←←←←←←\n");
                                controladorUsuario.buscarTelefono(cedula);
                                break;
                            case 5:
                                System.out.println("←←←←←←←←←←←← Lista de telefonos del usuario ←←←←←←←←←←←←\n");
                                controladorUsuario.listaTelefonos(cedula);
                                break;
                            case 6:
                                System.out.println("Salir");
                                opcion = true;
                                break;
                        }
                    }

                    break;
                case 3:
                    System.out.println("✆✆✆✆✆✆✆ Lista de telefonos ✆✆✆✆✆✆✆\n");
                    controladorTelefono.verTelefonos();
                    break;
                case 4:
                    System.out.println("✆✆✆✆✆✆✆ Lista de Usuarios ✆✆✆✆✆✆✆\n");
                    controladorUsuario.verUsuarios();
                    break;
                case 5:
                    System.out.println(" END ");
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
         Usuario usuarion = controladorUsuario.verificar();
        if (usuarion == null) {
            return null;
            
        } else {
            return usuarion.getCedula();
        }
    }
}

    
    

