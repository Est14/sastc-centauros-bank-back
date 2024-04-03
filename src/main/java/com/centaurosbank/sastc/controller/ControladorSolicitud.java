package com.centaurosbank.sastc.controller;

import com.centaurosbank.sastc.application.ProcesadorSolicitud;
import com.centaurosbank.sastc.domain.SolicitudTarjeta;

public class ControladorSolicitud {

    private ProcesadorSolicitud procesadorSolicitud;

    public ControladorSolicitud(ProcesadorSolicitud procesadorSolicitud) {
        this.procesadorSolicitud = procesadorSolicitud;
    }

    public void manejarSolicitud(String datosSolicitud) {
        // Parsear los datos de la solicitud
        SolicitudTarjeta solicitud = parsearSolicitud(datosSolicitud);
        // Procesar la solicitud usando el procesador
        procesadorSolicitud.procesarSolicitud(solicitud);
    }

    private SolicitudTarjeta parsearSolicitud(String datosSolicitud) {
        // Implementación para parsear los datos de la solicitud y crear un objeto SolicitudTarjeta
        return null;
    }
}
