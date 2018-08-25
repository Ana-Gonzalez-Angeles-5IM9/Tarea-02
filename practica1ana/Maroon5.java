package practica1ana;

public class Maroon5 {

    String cancion, album, premio, evento, concierto, lugar, fecha, tour, integrante, genero, discografica, duracion;
    int año, edad;
    
    public Maroon5 (String cancion, String album, int año, String duracion){
        this.album = album;
        this.año = año;
        this.cancion = cancion;
        this.duracion = duracion;
    }

    public Maroon5(String premio, String evento, int año) {
        this.premio = premio;
        this.evento = evento;
        this.año = año;
    }

    public Maroon5(String duracion, String concierto, String lugar, String fecha, String tour) {
        this.duracion = duracion;
        this.concierto = concierto;
        this.lugar = lugar;
        this.fecha = fecha;
        this.tour = tour;
    }

    public Maroon5(String integrante,  int edad) {
        this.integrante = integrante;
        this.edad = edad;
    }

    public Maroon5(String album, String genero, String discografica) {
        this.album = album;
        this.genero = genero;
        this.discografica = discografica;
    }

    @Override
    public String toString() {
        return "Maroon5{" + "cancion=" + cancion + ", album=" + album + ", año=" + año + ", duracion=" + duracion + ", premio=" + premio + ", evento=" + evento + ", concierto=" + concierto + ", lugar=" + lugar + ", fecha=" + fecha + ", tour=" + tour + ", integrante=" + integrante + ", edad=" + edad + ", genero=" + genero + ", discografica=" + discografica + '}';
    }
    
}
