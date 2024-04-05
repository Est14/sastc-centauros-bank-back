package com.centaurosbank.sastc.infrastructure;

import com.centaurosbank.sastc.domain.SolicitudTarjeta;

public interface RepositorioSolicitudTarjeta {
    void guardarSolicitud(SolicitudTarjeta solicitud);
    SolicitudTarjeta obtenerSolicitudPorId(int id);
}
