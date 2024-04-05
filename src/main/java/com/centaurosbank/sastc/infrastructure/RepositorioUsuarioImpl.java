package com.centaurosbank.sastc.infrastructure;

import com.centaurosbank.sastc.domain.Usuario;
import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;

@Repository
public class RepositorioUsuarioImpl implements RepositorioUsuario{

    Map<String, Usuario> usuarios = new HashMap<>();

    @Override
    public void guardar(Usuario usuario) {
        usuario.setEstadoActivo(true);
        usuarios.put(usuario.getNombreUsuario(), usuario);

    }

    @Override
    public Usuario buscarPorNombreUsuario(String nombreUsuario) {
        return usuarios.get(nombreUsuario);
    }

    @Override
    public void actualizar(String nombreUsuario, Usuario usuario) {
        usuarios.put(nombreUsuario, usuario);
    }

    @Override
    public void eliminarUsuario(String nombreUsuario) {
        Usuario usuario = buscarPorNombreUsuario(nombreUsuario);
        usuario.setEstadoActivo(false);
    }
}
