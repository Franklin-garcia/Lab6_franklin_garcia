
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Franklin Garcia
 */
public class AdministrarPersonas {

    private ArrayList<Personas> listaPersonas = new ArrayList();
    private File archivo = null;

    public AdministrarPersonas(String Path) {
        archivo = new File(Path);
    }

    public ArrayList<Personas> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Personas> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaPersonas" + listaPersonas;
    }

    //mutador extra
    public void setPersona(Personas p) {
        this.listaPersonas.add(p);
    }
    //metodos de adiminstracion

    public void escribirPersonas() {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Personas t : listaPersonas) {
                bw.write(t.getNombre() + ";");
                bw.write(t.getApellido() + ";");
                bw.write(t.getCorreo() + ";");
                bw.write(t.getFecha() + ";");
                bw.write(t.getPais() + ";");
                bw.write(t.getTelefono() + ";");
                bw.write(t.getContrasena() + ";");
                for (Mensaje h : t.getMensajes()) {
                    bw.write(h.getMensaje() + ",");
                    bw.write(h.getClasificar() + ",");
                    bw.write(h.getDestinatario() + ",");
                    bw.write(h.getEmisor());
                }
                bw.write(",");
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {

            }
        }

    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaPersonas = new ArrayList();
        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                listaPersonas.add(new Personas(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next()));               
            }
        } catch (Exception ex) {
        } finally {
            sc.close();
        }
    }

}
