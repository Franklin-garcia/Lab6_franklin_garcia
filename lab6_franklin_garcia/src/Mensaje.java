/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Franklin Garcia
 */
public class Mensaje {
    private String mensaje;
    private int clasificar;
    private int destinatario;
    
    public Mensaje() {
    }

    public Mensaje(String mensaje, int clasificar, int destinatario) {
        this.mensaje = mensaje;
        this.clasificar = clasificar;
        this.destinatario = destinatario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getClasificar() {
        return clasificar;
    }

    public void setClasificar(int clasificar) {
        this.clasificar = clasificar;
    }

    public int getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(int destinatario) {
        this.destinatario = destinatario;
    }
  
    
}
