package com.centaurosbank.sastc.controller;

import com.centaurosbank.sastc.application.ServicioSolicitud;
import com.centaurosbank.sastc.application.dtos.SolicitudTarjetaDto;
import com.centaurosbank.sastc.domain.SolicitudTarjeta;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ControladorSolicitud {


    private final ServicioSolicitud servicioSolicitud;

    public ControladorSolicitud(ServicioSolicitud servicioSolicitud) {
        this.servicioSolicitud = servicioSolicitud;
    }


    @PostMapping("/solicitud-tarjeta")
    public void manejarSolicitud(SolicitudTarjetaDto solicitudDto) {

        servicioSolicitud.procesarSolicitud(solicitudDto);
    }

    private SolicitudTarjeta parsearSolicitud(String datosSolicitud) {
        // Implementación para parsear los datos de la solicitud y crear un objeto SolicitudTarjeta
        return null;
    }
}
