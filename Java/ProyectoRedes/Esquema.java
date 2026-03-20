package Java.ProyectoRedes;
import java.util.*;
/* TO-DO CHANGE */
public class Esquema {
    private String direccionIp;
    private String barra;
    private static Set<Router> routers;

    
    private static Set<Red> redes;
    private static Set<SubRed> subredes;
    Esquema(String ip, String barra) {
        this.direccionIp = ip;
        this.barra = barra;
    }

    public String getDireccionIp() {
        return direccionIp;
    }
    public void setDireccionIp(String dIRECCION_IP) {
        direccionIp = dIRECCION_IP;
    }
    public String getBarra() {
        return barra;
    }
    public void setBarra(String barra) {
        this.barra = barra;
    }
    public static Set<Red> getRedes() {
        return redes;
    }
    public static Set<SubRed> getSubredes() {
        return subredes;
    }
    public static Set<Router> getRouters() {
        return routers;
    }

    public int deducirTipoRed() {
        int cuadrante = Integer.parseInt(direccionIp.substring(0,2));
        int tipo;
        if (cuadrante <= 127) {
            tipo = 0;
        } else if (cuadrante >= 128) {
            tipo = 1;
        } else {
            tipo = 2;
        }
        return tipo;
        /* a=0,b=1,c=2 */
        /* TODO: EXCEPCIONES */

    }

    public int sacarSubRedes() {
        int n = routers.size();
        return (n*(n-3))+n;
    }

    public int sacarNumBitsSubRed() {
        int bits = 0;
        int potencia = 0;
        while (bits < sacarSubRedes()) {
            bits = Math.powExact(2, potencia++);
        }
        return potencia;
    }

    public String sacarMascaraRed() {
        String mascara = "";
        for (int i = 0; i < deducirTipoRed()+1;i++) {
            mascara += "255.";
        }
        String binarioHost = "";
        int numBits = sacarNumBitsSubRed();
        for (int i = 0; i < numBits; i++) {
            binarioHost += "1";
            if (i == numBits - 1) {
                for (int j = 0; j < 8-numBits; j++) {
                    binarioHost += "0";
                }
            }
        }
        /* Claro pero cuando es un tipo a se queda asi 255.224, tendria que ser 255.224.0.0 */
        /* Se puede usar unsigned con el tipo Byte */
        int resultadoHost = Integer.parseInt(binarioHost,2);
        return mascara + resultadoHost;
        

    }

}
