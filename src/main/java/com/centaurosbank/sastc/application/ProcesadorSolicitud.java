package com.centaurosbank.sastc.application;

import com.centaurosbank.sastc.domain.RepositorioSolicitudTarjeta;
import com.centaurosbank.sastc.domain.SolicitudTarjeta;

public class ProcesadorSolicitud {
    private RepositorioSolicitudTarjeta repositorioSolicitudTarjeta;

    public ProcesadorSolicitud(RepositorioSolicitudTarjeta repositorioSolicitudTarjeta) {
        this.repositorioSolicitudTarjeta = repositorioSolicitudTarjeta;
    }

    public void procesarSolicitud(SolicitudTarjeta solicitud) {
        // Lógica para procesar la solicitud
        repositorioSolicitudTarjeta.guardarSolicitud(solicitud);
        // Otro procesamiento necesario
    }
}
