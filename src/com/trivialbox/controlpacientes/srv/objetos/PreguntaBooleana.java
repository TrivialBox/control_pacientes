package com.trivialbox.controlpacientes.srv.objetos;


public class PreguntaBooleana extends Pregunta<Boolean, Boolean>{
    
    private Boolean respuesta = null;
    
    public PreguntaBooleana(int id, int idEncuesta, String titulo, boolean esOpcional){
        super(id, idEncuesta, titulo, esOpcional);
    }

    @Override
    public void responder(Boolean respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    protected Boolean respuesta() {
        return this.respuesta;
    }

    @Override
    protected Boolean getRespuestaPorDefecto() {
        return null;
    }

    @Override
    protected boolean preguntaRespondida() {
        return this.respuesta != null;
    }

    private boolean  esNula(Boolean respuesta){
        return respuesta == null;
    }
        
}
