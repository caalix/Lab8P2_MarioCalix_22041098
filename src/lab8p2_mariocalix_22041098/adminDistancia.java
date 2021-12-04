
package lab8p2_mariocalix_22041098;

import javax.swing.JProgressBar;
import javax.swing.JSpinner;

public class adminDistancia extends Thread{
    
    private JProgressBar progBar_d;
    private boolean avanzar;
    private boolean vive;

    public adminDistancia(JProgressBar progBar_d) {
        this.progBar_d = progBar_d;
        avanzar = true;
        vive = true;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public void setVida(boolean vive) {
        this.vive = vive;
    }
}

    /*
    public void run() {
        while (vive) {
            if (avanzar) {
                progBar_d.setValue(Math.round(Integer.parseInt(
                        sp_velocidad.getValue().toString())
                        * (progBar_t.getValue() + 1))
                );
                progBar_d.setString(Integer.toString(
                        progBar_d.getValue()) + " Kilometros");

            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {

            }
        }

    }
    
}*/
