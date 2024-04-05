package com.centaurosbank.sastc.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


public class SolicitudTarjeta {

    private Integer id;
    private double ingresosMensuales;
    private String direccion;
    private String ocupacion;
    private String telefono;
    private Double socreCrediticio;
    private boolean aprobado;
    private BigDecimal montoAprobado;

    public SolicitudTarjeta() {
    }

    public SolicitudTarjeta(double ingresosMensuales, String direccion, String ocupacion, String telefono) {
        this.ingresosMensuales = ingresosMensuales;
        this.direccion = direccion;
        this.ocupacion = ocupacion;
        this.telefono = telefono;
    }

    public SolicitudTarjeta(double ingresosMensuales, String direccion, String ocupacion, String telefono, Double socreCrediticio, boolean aprobado, BigDecimal montoAprobado) {
        this.ingresosMensuales = ingresosMensuales;
        this.direccion = direccion;
        this.ocupacion = ocupacion;
        this.telefono = telefono;
        this.socreCrediticio = socreCrediticio;
        this.aprobado = aprobado;
        this.montoAprobado = montoAprobado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Double getSocreCrediticio() {
        return socreCrediticio;
    }

    public void setSocreCrediticio(Double socreCrediticio) {
        this.socreCrediticio = socreCrediticio;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }

    public BigDecimal getMontoAprobado() {
        return montoAprobado;
    }

    public void setMontoAprobado(BigDecimal montoAprobado) {
        this.montoAprobado = montoAprobado;
    }
}
