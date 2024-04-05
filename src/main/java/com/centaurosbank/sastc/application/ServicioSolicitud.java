package com.centaurosbank.sastc.application;

import com.centaurosbank.sastc.application.dtos.SolicitudTarjetaDto;
import com.centaurosbank.sastc.domain.SolicitudTarjeta;
import com.centaurosbank.sastc.infrastructure.RepositorioSolicitudTarjeta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioSolicitud {

    @Autowired
    private RepositorioSolicitudTarjeta repositorioSolicitudTarjeta;


    public void procesarSolicitud(SolicitudTarjetaDto solicitudDto) {
        SolicitudTarjeta solicitud = new SolicitudTarjeta(solicitudDto.getIngresosMensuales(),
                solicitudDto.getDireccion(), solicitudDto.getOcupacion(), solicitudDto.getTelefono());
        repositorioSolicitudTarjeta.guardarSolicitud(solicitud);

    }
}
