
package lab8p2_mariocalix_22041098;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminEstrella {
    
    private ArrayList<Estrella> listaEstrellas = new ArrayList();
    private File archivo = null;
    
    public adminEstrella(String path) {
        archivo = new File(path);
    }

    public ArrayList<Estrella> getListaEstrellas() {
        return listaEstrellas;
    }

    public void setListaEstrellas(ArrayList<Estrella> listaEstrellas) {
        this.listaEstrellas = listaEstrellas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setEstrella(Estrella a){
        listaEstrellas.add(a);
    }
    
    
    public void cargarArchivo() {
        try {            
            listaEstrellas = new ArrayList();
            Estrella temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Estrella) objeto.readObject()) != null) {
                        listaEstrellas.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Estrella t : listaEstrellas) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
