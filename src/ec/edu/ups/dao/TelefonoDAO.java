/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;


import ec.edu.ups.idao.ITelefonoDAO;
import ec.edu.ups.modelo.Telefono;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author NANCY
 */
public class TelefonoDAO implements ITelefonoDAO {

    private Map<String, Telefono> listaTelefonos;

    //Constructor
    public TelefonoDAO() {
        listaTelefonos = new HashMap<String, Telefono>();
    }
    @Override
    public void create(Telefono telefono) {
        listaTelefonos.put(telefono.getCodigo(), telefono);
    }
    
    @Override
    public Telefono read(String codigo) {
        return listaTelefonos.get(codigo);
    }
   

    @Override
    public void update(Telefono telefono) {
        listaTelefonos.put(telefono.getCodigo(), telefono);
    }

    @Override
    public void delete(Telefono telefono) {
        listaTelefonos.remove(telefono.getCodigo());
    }

    @Override
    public Collection <Telefono> findAll() {
        Collection<Telefono> telefonos =this.listaTelefonos.values();
        return telefonos;
    }
}
