package com.centaurosbank.sastc.controller;

import com.centaurosbank.sastc.application.VerificadorCredito;
import com.centaurosbank.sastc.domain.VerificacionCredito;

public class ControladorVerificacionCredito {

    private VerificadorCredito verificadorCredito;

    public ControladorVerificacionCredito(VerificadorCredito verificadorCredito) {
        this.verificadorCredito = verificadorCredito;
    }

    public VerificacionCredito verificarCredito(int idSolicitud) {
        return verificadorCredito.verificarCredito(idSolicitud);
    }
}
