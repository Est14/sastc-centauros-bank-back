package com.centaurosbank.sastc.domain;

public interface RepositorioSolicitudTarjeta {
    void guardarSolicitud(SolicitudTarjeta solicitud);
    SolicitudTarjeta obtenerSolicitudPorId(int id);
}
