
package tabla;

/* Importo lo necesario para poder dibujar ventanas */

import javax.swing.*;
/* Importo la Clase Vector que se encuentra en el package java.util */
import java.util.Vector;
 
/* mi clase Tabla hereda de JFrame */
public class Tabla extends JFrame {
     
    public Tabla() {
        /* Le setearé el titulo a la ventana */
        super("Mi tabla");
        /* a la ventana le doy dimensiones de 300 de ancho x 200 de alto */
        this.setSize(300,200);
         
        /* Creo una instancia de la clase Vector llamada 'columnas' */
        Vector columnas = new Vector();
        /* 
            A ese vector le agrego datos, estos datos vendrán a ser las
            columnas de la tabla.
        */
        columnas.add("Notas 1");
        columnas.add("Notas 2");
        columnas.add("Notas 3");
        columnas.add("Promedio");
 
         
        /* 
            Creo una instancia de la clase Vector llamada 'filas' , este vector
            tendrá todas las filas de la tabla.
        */
        Vector filas = new Vector();
       
       
         
        /*
            Creo otro objeto de la clase Vector llamado 'fila', esto representará a
            una fila en particular y cada elemento que agregue a este vector
            será una celda.
         */
        Vector fila = new Vector();
         
        fila.add("");
        fila.add("");
        fila.add("");
        fila.add("");
   
        /* Agrego la fila al vector que contiene todas las filas */
        filas.add(fila);
         
        /* 
            Creo una instancia de JTable y le paso como parametro los dos Vectores:
                -filas
                -columnas   
         */
        JTable tbl = new JTable(filas,columnas);
        /* Creo una instancia de JScrollPane y le paso como parametro la tabla */
        JScrollPane panel =new JScrollPane(tbl);
        /* Por ultimo agrego ese objeto de JScrollPane al contenedor de la ventana */
        this.getContentPane().add(panel);
         
        this.setVisible(true);
    }
    public static void main(String[] args) {
        Tabla tabla = new Tabla();
        tabla.show();
    }
}
