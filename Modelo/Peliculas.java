package Modelo;
public class Peliculas {
    public String actores;
    public String clasificacion;
    public String director;
    public String nombre;
    public int duracion;

    public Peliculas(String pelicula,String actores, String clasificacion, String director, Integer duracion) {
        this.nombre = nombre;
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
