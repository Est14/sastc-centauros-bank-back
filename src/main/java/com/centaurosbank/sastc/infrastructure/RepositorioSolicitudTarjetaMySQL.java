package com.centaurosbank.sastc.infrastructure;

import com.centaurosbank.sastc.domain.RepositorioSolicitudTarjeta;
import com.centaurosbank.sastc.domain.SolicitudTarjeta;

public class RepositorioSolicitudTarjetaMySQL implements RepositorioSolicitudTarjeta {
    @Override
    public void guardarSolicitud(SolicitudTarjeta solicitud) {
        
    }

    @Override
    public SolicitudTarjeta obtenerSolicitudPorId(int id) {
        return null;
    }
}
