/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.idao.ITelefonoDAO;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.vista.VistaTelefono;
import java.util.List;

/**
 *
 * @author JHON
 */
public class ControladorTelefono {
    //objetos vist

    private VistaTelefono vistaTelefono;
    private Telefono telefono;
    private ITelefonoDAO telefonoDAO;

    // constructor
    public ControladorTelefono(VistaTelefono vistaTelefono, ITelefonoDAO telefonoDAO) {
        this.vistaTelefono = vistaTelefono;
        this.telefonoDAO = telefonoDAO;
    }

    //llama al DAO para guardar un telefono
    public void registrar() {
        telefono = vistaTelefono.ingresarTelefono();
        telefonoDAO.create(telefono);
    }

    //llama al DAO para obtener un telefono por el codigo y luego los muestra en la vista
    public void veTelefono() {
        int codigo = vistaTelefono.buscarTelefono();
        telefono = telefonoDAO.read(codigo);
        vistaTelefono.verTelefono(telefono);
    }

    //llama al DAO para actualizar un telefono
    public void actualizarTelefono() {
        telefono = vistaTelefono.actualizarelefono();
        telefonoDAO.update(telefono);
    }

    //llama al DAO para eliminar un telefono
    public void eliminarTelefono() {
        telefono = vistaTelefono.eliminarTelefono();
        telefonoDAO.delete(telefono);
    }

    //llama al DAO para obtener todos los clientes y luego los muestra en la vista
    public void verTelefonos() {
        List<Telefono> telefonos;
        telefonos = telefonoDAO.findAll();
        vistaTelefono.verTelefono(telefono);
    }

}
