package com.centaurosbank.sastc.application.dtos;

import lombok.Data;

public class CreacionUsuarioDto {

    private String nombre;

    private String apellido;

    private String email;

    private String tipoDni;

    private String dni;
    private String nombreUsuario;
    private String contrasena;


    public CreacionUsuarioDto() {
    }

    public CreacionUsuarioDto(String nombre, String apellido, String email, String tipoDni, String dni, String nombreUsuario, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.tipoDni = tipoDni;
        this.dni = dni;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoDni() {
        return tipoDni;
    }

    public void setTipoDni(String tipoDni) {
        this.tipoDni = tipoDni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
