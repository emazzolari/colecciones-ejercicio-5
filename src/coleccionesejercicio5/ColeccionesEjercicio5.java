
package coleccionesejercicio5;

import servicios.PaisServicio;

public class ColeccionesEjercicio5 {

    public static void main(String[] args) {
       PaisServicio p1= new PaisServicio ();
       
       p1.crearPais();
       p1.mostrarPais();
       p1.buscarYeliminarPais();
    }
    
}
