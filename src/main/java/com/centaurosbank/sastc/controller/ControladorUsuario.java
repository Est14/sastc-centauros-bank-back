package com.centaurosbank.sastc.controller;

import com.centaurosbank.sastc.application.ServicioUsuario;
import com.centaurosbank.sastc.application.dtos.ActualizarUsuarioDto;
import com.centaurosbank.sastc.application.dtos.CreacionUsuarioDto;
import com.centaurosbank.sastc.application.dtos.UsuarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/centauros-bank-api/v1/usuarios")
public class ControladorUsuario {

    @Autowired
    private ServicioUsuario servicioUsuario;

    @PostMapping()
    public void crearUsuario(@RequestBody CreacionUsuarioDto usuarioDto) {
        try {
            servicioUsuario.registrarUsuario(usuarioDto);
            System.out.println("Usuario registrado exitosamente");
        } catch (IllegalArgumentException e) {
            System.err.println("Error durante el registro: " + e.getMessage());
        }
    }


    @GetMapping("/{nombreUsuario}")
    public UsuarioDto buscarUsuario(@PathVariable String nombreUsuario) throws Exception {
        return servicioUsuario.buscarUsuario(nombreUsuario);
    }

    @PutMapping("/{nombreUsuario}")
    public UsuarioDto actualizarUsuario(@PathVariable String nombreUsuario, @RequestBody ActualizarUsuarioDto usuarioDto) throws Exception {
        return servicioUsuario.actualizarUsuario(nombreUsuario, usuarioDto);
    }

    @DeleteMapping("/{nombreUsuario}")
    public void eliminarUsuario(@PathVariable String nombreUsuario) throws Exception {
        servicioUsuario.eliminarUsuario(nombreUsuario);
    }
}
