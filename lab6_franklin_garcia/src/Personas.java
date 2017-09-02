
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Franklin Garcia
 */
public class Personas {
            private String nombre;
            private String apellido;
            private String correo;
            private String fecha;
            private String pais;
            private String telefono;
            private String contrasena;
            private ArrayList<Mensaje>mensajes=new ArrayList();
           ///
            private ArrayList<Mensaje> no_leidos=new ArrayList();
            private ArrayList<Mensaje> leidos=new ArrayList();
            private ArrayList<Mensaje> no_deseados=new ArrayList();
            private ArrayList<Mensaje> spam=new ArrayList();
            private ArrayList<Mensaje> borradores=new ArrayList();
            private ArrayList<Mensaje> enviados=new ArrayList();
            private ArrayList<Mensaje> eliminados=new ArrayList();
            private ArrayList<Mensaje> importantes=new ArrayList();

    public Personas() {
    }

    public Personas(String nombre, String apellido, String correo, String fecha, String pais, String telefono, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fecha = fecha;
        this.pais = pais;
        this.telefono = telefono;
        this.contrasena = contrasena;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    public ArrayList<Mensaje> getNo_leidos() {
        return no_leidos;
    }

    public void setNo_leidos(ArrayList<Mensaje> no_leidos) {
        this.no_leidos = no_leidos;
    }

    public ArrayList<Mensaje> getLeidos() {
        return leidos;
    }

    public void setLeidos(ArrayList<Mensaje> leidos) {
        this.leidos = leidos;
    }

    public ArrayList<Mensaje> getNo_deseados() {
        return no_deseados;
    }

    public void setNo_deseados(ArrayList<Mensaje> no_deseados) {
        this.no_deseados = no_deseados;
    }

    public ArrayList<Mensaje> getSpam() {
        return spam;
    }

    public void setSpam(ArrayList<Mensaje> spam) {
        this.spam = spam;
    }

    public ArrayList<Mensaje> getBorradores() {
        return borradores;
    }

    public void setBorradores(ArrayList<Mensaje> borradores) {
        this.borradores = borradores;
    }

    public ArrayList<Mensaje> getEnviados() {
        return enviados;
    }

    public void setEnviados(ArrayList<Mensaje> enviados) {
        this.enviados = enviados;
    }

    public ArrayList<Mensaje> getEliminados() {
        return eliminados;
    }

    public void setEliminados(ArrayList<Mensaje> eliminados) {
        this.eliminados = eliminados;
    }

    public ArrayList<Mensaje> getImportantes() {
        return importantes;
    }

    public void setImportantes(ArrayList<Mensaje> importantes) {
        this.importantes = importantes;
    }

   

    
    @Override
    public String toString() {
        return nombre;
    }
   
            
}
