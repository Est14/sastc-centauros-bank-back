package com.centaurosbank.sastc.application.dtos;

public class UsuarioDto {

    private String nombre;
    private String apellido;
    private String email;
    private String tipoDni;
    private String dni;
    private String nombreUsuario;

    public UsuarioDto() {
    }

    public UsuarioDto(String nombre, String apellido, String email, String tipoDni, String dni, String nombreUsuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.tipoDni = tipoDni;
        this.dni = dni;
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
}
