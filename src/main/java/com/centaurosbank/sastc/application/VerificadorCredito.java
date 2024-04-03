package com.centaurosbank.sastc.application;

import com.centaurosbank.sastc.domain.RepositorioSolicitudTarjeta;
import com.centaurosbank.sastc.domain.VerificacionCredito;

public class VerificadorCredito {
    private RepositorioSolicitudTarjeta repositorioSolicitudTarjeta;

    public VerificadorCredito(RepositorioSolicitudTarjeta repositorioSolicitudTarjeta) {
        this.repositorioSolicitudTarjeta = repositorioSolicitudTarjeta;
    }

    public VerificacionCredito verificarCredito(int idSolicitud) {
        // Lógica para verificar el crédito
        // Se obtiene la solicitud de tarjeta de crédito del repositorio
        // Se realiza la verificación y se devuelve el resultado

        return null;
    }
}
