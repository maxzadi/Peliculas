package Modelo;

import java.util.ArrayList;
import Modelo.Sala; 

public class CineControlador {
    public ArrayList<Sala> salas;  
    public ArrayList<Peliculas> peliculas; 
    private int capacidadMaximaSalas;  

    public CineControlador(Integer cantidadSalas) {
        this.capacidadMaximaSalas = cantidadSalas; 
        salas = new ArrayList<>();
        peliculas = new ArrayList<>();
    }

   
    public Boolean crearSala(Integer filas, Integer num, String tipo, Integer numero) {
        if (salas.size() < capacidadMaximaSalas) {
            salas.add(new Sala(filas, num, tipo, numero));  
            return true;
        }
        return false;
    }

    public Boolean crearPelicula(String nombre, String actores, String clasificacion, String director, Integer duracion) {
        peliculas.add(new Peliculas(nombre, actores, clasificacion, director, duracion));
        return true;
    }

    public String verSalas() {
        String reporte = "";
        for (int i = 0; i < salas.size(); i++) {
            reporte += i + ". Sala " + salas.get(i).getNumero() + "\n";
        }
        return reporte;
    }

    public String verPeliculas() {
        String reporte = "";
        for (int i = 0; i < peliculas.size(); i++) {
            reporte += i + ". " + peliculas.get(i).nombre + "\n";
        }
        return reporte;
    }
}

