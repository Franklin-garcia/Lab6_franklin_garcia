
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
            private Date fecha;
            private String pais;
            private String telefono;
            private String contrasena;
            private ArrayList no_leidos=new ArrayList();
            private ArrayList leidos=new ArrayList();
            private ArrayList no_deseados=new ArrayList();
            private ArrayList spam=new ArrayList();
            private ArrayList borradores;
            private ArrayList enviados=new ArrayList();
            private ArrayList eliminados=new ArrayList();
            private ArrayList importantes=new ArrayList();

    public Personas() {
    }

    public Personas(String nombre, String apellido, String correo, Date fecha, String pais, String telefono, String contrasena, ArrayList borradores) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fecha = fecha;
        this.pais = pais;
        this.telefono = telefono;
        this.contrasena = contrasena;
        this.borradores = borradores;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
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

    public ArrayList getNo_leidos() {
        return no_leidos;
    }

    public void setNo_leidos(ArrayList no_leidos) {
        this.no_leidos = no_leidos;
    }

    public ArrayList getLeidos() {
        return leidos;
    }

    public void setLeidos(ArrayList leidos) {
        this.leidos = leidos;
    }

    public ArrayList getNo_deseados() {
        return no_deseados;
    }

    public void setNo_deseados(ArrayList no_deseados) {
        this.no_deseados = no_deseados;
    }

    public ArrayList getSpam() {
        return spam;
    }

    public void setSpam(ArrayList spam) {
        this.spam = spam;
    }

    public ArrayList getBorradores() {
        return borradores;
    }

    public void setBorradores(ArrayList borradores) {
        this.borradores = borradores;
    }

    public ArrayList getEnviados() {
        return enviados;
    }

    public void setEnviados(ArrayList enviados) {
        this.enviados = enviados;
    }

    public ArrayList getEliminados() {
        return eliminados;
    }

    public void setEliminados(ArrayList eliminados) {
        this.eliminados = eliminados;
    }

    public ArrayList getImportantes() {
        return importantes;
    }

    public void setImportantes(ArrayList importantes) {
        this.importantes = importantes;
    }
            
}
