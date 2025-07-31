package Modelo;
public class Peliculas {
    private String actores;
    private String clasificacion;
    private String director;
    private String nombre = "Película";
    private int duracion;

    public Peliculas(String actores, String clasificacion, String director, int duracion) {
        this.actores = actores;
        this.clasificacion = clasificacion;
        this.director = director;
        this.duracion = duracion;
    }

    public Peliculas(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setDuracion(int nuevaDuracion) {
        this.duracion = nuevaDuracion;
    }

    public String mostrarInfo() {
        return "Nombre: " + nombre +
               "\nActores: " + actores +
               "\nClasificación: " + clasificacion +
               "\nDirector: " + director +
               "\nDuración: " + duracion + " minutos";
    }

    public void nuevaInfo(String actores, String director) {
        this.actores = actores;
        this.director = director;
    }

    public void nuevaInfo(String actores) {
        this.actores = actores;
    }
}
