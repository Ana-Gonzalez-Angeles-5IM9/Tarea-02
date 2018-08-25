/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1ana;

/**
 *
 * @author Alumno
 */
public class main {
    public static void main (String args[]){
        Maroon5 cancion = new Maroon5 ("Animals","V", 2014,"3:52");
        Maroon5 premio = new Maroon5 ("Mejor Artista Nuevo","Grammy", 2005);
        Maroon5 concierto = new Maroon5 ("2:20:00", "CDMX", "Foro Sol", "29 Febrero 2016", "World Tour");
        Maroon5 integrante = new Maroon5("Adam Levine", 39);
        Maroon5 album = new Maroon5("V", "Pop rock Dance pop", "Interescope Records");
        System.out.println(cancion.toString());
        System.out.println(premio.toString());
        System.out.println(concierto.toString());
        System.out.println(integrante.toString());
        System.out.println(album.toString());
    }
}
