/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;
import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.idao.IUsuarioDAO;
import ec.edu.ups.idao.ITelefonoDAO;
import ec.edu.ups.modelo.Usuario;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.vista.VistaUsuario;
import ec.edu.ups.vista.VistaTelefono;
import java.util.List;

//import ec.edu.ups.modelo.Usuario;
/**
 *
 * @author JHON
 */
public class ControladorUsuario {
    //objetos vist

    private VistaUsuario vistaUsuario;
    private VistaTelefono vistaTelefono;
    //objetos modelo
    private Usuario usuario;
    private Telefono telefono;
    //objetos DAO
    private IUsuarioDAO usuarioDAO;
    private ITelefonoDAO telefonoDAO;
    // constructor

    public ControladorUsuario(VistaUsuario vistaUsuario,
            VistaTelefono vistaTelefono,
            IUsuarioDAO usuarioDAO,
            ITelefonoDAO telefonoDAO) {
        this.vistaUsuario = vistaUsuario;
        this.usuarioDAO = usuarioDAO;
        this.vistaTelefono = vistaTelefono;
        this.telefonoDAO = telefonoDAO;
    }
    
    //llamar al dao para guardar el usuario
    public  void  registrar () {
        usuario = vistaUsuario.ingrUsuario();
        usuarioDAO.create(usuario);        
    }/**
     * 
     */
    //llama al DAO para obtener un cliente por el id y luego los muestra en la vista
    public void verUsuario() {
        String cedula = vistaUsuario.buscarUsuario();
        usuario = usuarioDAO.read(1);
        vistaUsuario.verUsuario(usuario);
    }
    //llama al DAO para actualizar un cliente
    public void actualizarUsuario() {
       usuario = vistaUsuario.actualizarUsuario();
        usuarioDAO.update(usuario);
    }

    //llama al DAO para eliminar un cliente
    public void eliminarUsuario() {
        usuario = vistaUsuario.eliminarUsuario();
        usuarioDAO.delete(usuario);
    }

    //llama al DAO para obtener todos los clientes y luego los muestra en la vista
    public void verUsuarios() {
        List<Usuario> clientes;
        clientes = usuarioDAO.findAll();
        vistaUsuario.verUsuario(usuario);
    }
    
    //ejemplo de agregacion
    public void agregarUsuario(){
        String  cedula = vistaUsuario.buscarUsuario();
        telefono = telefonoDAO.read(1);
        usuario.agregarTelefono(telefono);
        usuarioDAO.update(usuario);        
    }



}
