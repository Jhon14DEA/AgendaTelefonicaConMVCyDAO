/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;


import ec.edu.ups.idao.IUsuarioDAO;
import ec.edu.ups.modelo.Usuario;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author JHON
 */
public class UsuarioDAO implements IUsuarioDAO {

    private Map<String, Usuario> listaUsuarios;

    public UsuarioDAO() {
        listaUsuarios = new HashMap<String, Usuario>();
    }
    
    @Override
    public void create(Usuario usuario) {
       listaUsuarios.put(usuario.getCedula(), usuario);
    }

    @Override
    public Usuario read(String cedula) {
        return listaUsuarios.get(cedula);
    }
    
    @Override
    public void update(Usuario usuario) {
        listaUsuarios.put(usuario.getCedula(), usuario);
    }

    @Override
    public void delete(Usuario usuario) {
        listaUsuarios.remove(usuario.getCedula());
    }

    @Override
    public Collection <Usuario> findAll() {
        Collection<Usuario> usuarios = this.listaUsuarios.values();
        return usuarios;
        
    }

    


}
