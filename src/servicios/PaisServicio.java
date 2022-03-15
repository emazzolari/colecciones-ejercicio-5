package servicios;

import entidades.Pais;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class PaisServicio {

    private TreeSet<Pais> nuevoMapa; // Creo el mapa
    private Scanner leer; // Creo el Scanner para utilizar en toda mi clase

    //Esta es una muy buena practica
    public PaisServicio() {
        this.nuevoMapa = new TreeSet<>(); // Creo el espacio en memoria del LISTAS
        this.leer = new Scanner(System.in).useDelimiter("\n");// Cuando se invoca la clase, habilita el flujo de datos
    }

    public void crearPais() {

        String respuesta = "";

        do {
            //Pais pais = new Pais();
            System.out.println("Ingrese el País deseado");
            String pai = (leer.next());

           // pais.setPais(pai);

            nuevoMapa.add(new Pais(pai));

            System.out.println("Quiere ingresar otro País?");
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("S"));

    }

    public void mostrarPais() {
        System.out.println("");
        System.out.println("Lista de Paises");
        for (Pais pais : nuevoMapa) {
            System.out.println(pais);
        }
    }
    
    public void buscarYeliminarPais() {
        System.out.println("");
        System.out.println("Ingrese el País a buscar y eliminar");
        String paisABuscar = leer.next();
         boolean aux = false;
        Iterator<Pais> it = nuevoMapa.iterator();
        //Pais m = new Pais();
        while (it.hasNext()) {      
            if (it.next().getPais().equals(paisABuscar)) { 
                it.remove(); 
                aux=true;
            }           
        }
       if (aux == false){
           System.out.println("");
           System.out.println("El Pais no se encuentra");
            }
        for (Pais pais : nuevoMapa) {
            System.out.println("");
            System.out.println(pais);
        }
    
    }
         
}
