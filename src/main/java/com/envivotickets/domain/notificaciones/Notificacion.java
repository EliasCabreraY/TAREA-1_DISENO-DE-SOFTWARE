
package com.envivotickets.domain.notificaciones;

public class Notificacion {
    private String id;
    private String canal; // email/sms/push
    private String asunto;
    private String cuerpo;
    private String estadoEnvio;

    public Notificacion(String id, String canal, String asunto, String cuerpo, String estadoEnvio) {
        this.id = id;
        this.canal = canal;
        this.asunto = asunto;
        this.cuerpo = cuerpo;
        this.estadoEnvio = estadoEnvio;
    }

    public String getId() { return id; }
    public String getCanal() { return canal; }
    public String getAsunto() { return asunto; }
    public String getCuerpo() { return cuerpo; }
    public String getEstadoEnvio() { return estadoEnvio; }
}
