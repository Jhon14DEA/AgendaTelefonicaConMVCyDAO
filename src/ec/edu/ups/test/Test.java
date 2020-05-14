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
        while (menu){
        System.out.println("✆✆✆✆✆✆✆ MENU ✆✆✆✆✆✆✆");
        System.out.println("1: Registrarce.\n"
                + "2: Iniciar sesion.\n"
                + "3: Listar Telefonos.\n"
                + "4: Salir");
        int numero = entrada.nextInt();
        switch (numero) {
            //El usuario podra registrarce
            case 1:
                //vista
                VistaUsuario vistaUsuario = new VistaUsuario();
                VistaTelefono vistaTelefono = new VistaTelefono();
                //daos
                UsuarioDAO usuarioDAO= new UsuarioDAO();
                TelefonoDAO telefonoDAO = new TelefonoDAO();
                
                ControladorUsuario controladorUsuario = new ControladorUsuario(vistaUsuario, vistaTelefono, usuarioDAO, telefonoDAO);
                //guarda un cliente atraves del controlador
                controladorUsuario.registrar();   
                
                 break;
                //Iniciar sesion con su correo y contraseña
            case 2:
                
                
                
                
                break;
            case 3:
                break;
            case 4:
                System.out.println("Fin del algoritmo");
                menu = false;
                break;
            default: System.out.println("Ingrese bien el numero verga");
            break;
        }
    }
    }
}
