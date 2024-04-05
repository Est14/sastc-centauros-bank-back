package com.centaurosbank.sastc.application;

import com.centaurosbank.sastc.application.dtos.ActualizarUsuarioDto;
import com.centaurosbank.sastc.application.dtos.CreacionUsuarioDto;
import com.centaurosbank.sastc.application.dtos.UsuarioDto;
import com.centaurosbank.sastc.domain.Usuario;
import com.centaurosbank.sastc.infrastructure.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioUsuario {

    @Autowired
    private RepositorioUsuario repositorioUsuario;

    public void registrarUsuario(CreacionUsuarioDto usuarioDto) {
        if (repositorioUsuario.buscarPorNombreUsuario(usuarioDto.getNombreUsuario()) != null) {
            throw new IllegalArgumentException("El usuario ya existe");
        }

        Usuario nuevoUsuario = new Usuario(usuarioDto.getNombre(), usuarioDto.getApellido(),
                usuarioDto.getEmail(), usuarioDto.getTipoDni(), usuarioDto.getDni(), usuarioDto.getNombreUsuario(), usuarioDto.getContrasena());
        repositorioUsuario.guardar(nuevoUsuario);
    }

    public UsuarioDto buscarUsuario(String nombreUsuario) throws Exception {
        Usuario usuario1 = repositorioUsuario.buscarPorNombreUsuario(nombreUsuario);
        if(!usuario1.isEstadoActivo()){
            throw new Exception("Usuario no exite");
        }
        return  new UsuarioDto(usuario1.getNombre(), usuario1.getApellido(),
                usuario1.getEmail(), usuario1.getTipoDni(), usuario1.getDni(), usuario1.getNombreUsuario());
    }

    public UsuarioDto actualizarUsuario(String nombreUsuario, ActualizarUsuarioDto usuarioDto) throws Exception {
        Usuario usuario1 = repositorioUsuario.buscarPorNombreUsuario(nombreUsuario);
        if(!usuario1.isEstadoActivo()){
            throw new Exception("Usuario no exite");
        }
        usuario1.setNombre(usuarioDto.getNombre());
        usuario1.setApellido(usuarioDto.getApellido());
        usuario1.setEmail(usuarioDto.getEmail());

        repositorioUsuario.actualizar(nombreUsuario, usuario1);

        return  new UsuarioDto(usuario1.getNombre(), usuario1.getApellido(),
                usuario1.getEmail(), usuario1.getTipoDni(), usuario1.getDni(), usuario1.getNombreUsuario());
    }

    public void eliminarUsuario(String nombreUsuario) throws Exception {
        Usuario usuario1 = repositorioUsuario.buscarPorNombreUsuario(nombreUsuario);
        if(!usuario1.isEstadoActivo()){
            throw new Exception("Usuario no exite");
        }
        repositorioUsuario.eliminarUsuario(nombreUsuario);
    }
}
