package com.centaurosbank.sastc.infrastructure;

import com.centaurosbank.sastc.domain.Usuario;

public interface RepositorioUsuario {

    void guardar(Usuario usuario);
    Usuario buscarPorNombreUsuario(String nombreUsuario);
    void actualizar(String nombreUsuario, Usuario usuario);

    void eliminarUsuario(String nombreUsuario);
}
