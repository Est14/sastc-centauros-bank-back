package com.centaurosbank.sastc.application.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


public class SolicitudTarjetaDto {

    private double ingresosMensuales;
    private String direccion;
    private String ocupacion;
    private String telefono;

    public SolicitudTarjetaDto() {
    }

    public SolicitudTarjetaDto(double ingresosMensuales, String direccion, String ocupacion, String telefono) {
        this.ingresosMensuales = ingresosMensuales;
        this.direccion = direccion;
        this.ocupacion = ocupacion;
        this.telefono = telefono;
    }

    public double getIngresosMensuales() {
        return ingresosMensuales;
    }

    public void setIngresosMensuales(double ingresosMensuales) {
        this.ingresosMensuales = ingresosMensuales;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
