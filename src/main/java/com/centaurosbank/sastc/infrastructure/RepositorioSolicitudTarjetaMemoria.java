package com.centaurosbank.sastc.infrastructure;

import com.centaurosbank.sastc.domain.RepositorioSolicitudTarjeta;
import com.centaurosbank.sastc.domain.SolicitudTarjeta;

import java.util.HashMap;
import java.util.Map;

public class RepositorioSolicitudTarjetaMemoria implements RepositorioSolicitudTarjeta {

    private Map<Integer, SolicitudTarjeta> memoria = new HashMap<>();


    @Override
    public void guardarSolicitud(SolicitudTarjeta solicitud) {
        memoria.put(solicitud, solicitud);
    }

    @Override
    public SolicitudTarjeta obtenerSolicitudPorId(int id) {
        return memoria.get(id);
    }
}
