package com.centaurosbank.sastc.controller;

import com.centaurosbank.sastc.application.ProcesarSolicitudTarjeta;
import com.centaurosbank.sastc.domain.SolicitudTarjeta;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class SolicitudTarjetaController {
    private final ProcesarSolicitudTarjeta procesarSolicitudTarjeta;

    public SolicitudTarjetaController(ProcesarSolicitudTarjeta procesarSolicitudTarjeta) {
        this.procesarSolicitudTarjeta = procesarSolicitudTarjeta;
    }

    @PostMapping("/solicitud-tarjeta")
    public void procesarSolicitud(@RequestBody SolicitudTarjeta solicitud) {
        procesarSolicitudTarjeta.procesar(solicitud);
    }
}
