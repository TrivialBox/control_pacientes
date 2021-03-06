package com.trivialbox.controlpacientes.dao.exceptions;

public class EncuestaNoPermitidaException extends RuntimeException {

    public EncuestaNoPermitidaException(String idPaciente) {
        super("El usuario " + idPaciente + " no tiene acceso a responder la encuesta.");
    }
    
}
