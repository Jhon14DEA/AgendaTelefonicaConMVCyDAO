/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.ITelefonoDAO;
import ec.edu.ups.modelo.Telefono;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author JHON
 */
public class TelefonoDAO implements ITelefonoDAO {

    private List<Telefono> listaTelefono;

    public TelefonoDAO() {
        listaTelefono = new ArrayList<>();
    }
   
        
        
    @Override
    public void create(Telefono telefono) {
        listaTelefono.add(telefono);
    }

    @Override
    public Telefono read(int id) {
        for (Telefono telefono : listaTelefono) {
            if (telefono.getCodigo() == id) {
                return telefono;
            }
        }
        return null;
    }

    @Override
    public void update(Telefono telefono) {
        for (int i = 0; i < listaTelefono.size(); i++) {
            Telefono t = listaTelefono.get(i);
            if (t.getCodigo() == telefono.getCodigo()) {
                listaTelefono.set(i, telefono);
                break;
            }
        }
    }

    @Override
    public void delete(Telefono telefono) {
        Iterator<Telefono> it = listaTelefono.iterator();
        while (it.hasNext()) {
            Telefono t = it.next();
            if (t.getCodigo() == telefono.getCodigo()) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Telefono> findAll() {
        return listaTelefono;

    }

}
