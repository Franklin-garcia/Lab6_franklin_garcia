
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
        FileWriter ft = null;
        BufferedWriter bw = null;
        try {
            //String nombre, String apellido, String correo, Date fecha, String pais, String telefono, String contrasena
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
                }
                bw.write(",");
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                ft.close();
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
                String nombre;
                String apellido;
                String correo;
                String fecha;
                String pais;
                String telefono;
                String contrasena;

                ArrayList<Mensaje> temp = new ArrayList();
                nombre = sc.next();
                apellido = sc.next();
                correo = sc.next();
                fecha = sc.next();
                pais = sc.next();
                telefono = sc.next();
                contrasena = sc.next();

                Scanner s2 = new Scanner(sc.next());
                s2.useDelimiter(";");
                while (s2.hasNext()) {
                    temp.add(new Mensaje(s2.next(),s2.nextInt(),s2.nextInt())); 
                }
                listaPersonas.add(new Personas(nombre, apellido, correo, fecha, pais, telefono, contrasena));
                listaPersonas.get(listaPersonas.size() - 1).setBorradores(temp);

            }
        } catch (Exception ex) {
        } finally {
            sc.close();
        }

    }
}
