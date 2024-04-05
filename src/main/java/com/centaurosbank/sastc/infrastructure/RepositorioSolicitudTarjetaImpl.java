package com.centaurosbank.sastc.infrastructure;

import com.centaurosbank.sastc.domain.SolicitudTarjeta;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class RepositorioSolicitudTarjetaImpl implements RepositorioSolicitudTarjeta {

    private Map<SolicitudTarjeta, SolicitudTarjeta> memoria = new HashMap<>();


    @Override
    public void guardarSolicitud(SolicitudTarjeta solicitud) {
        memoria.put(solicitud, solicitud);
    }

    @Override
    public SolicitudTarjeta obtenerSolicitudPorId(int id) {
        return memoria.get(id);
    }
}
