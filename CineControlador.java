import Modelo.Sala;

import java.util.ArrayList;

import Modelo.Peliculas;

public class CineControlador {
    public Sala[] salas;
    public Integer cantidadSalas;
    public Integer cantidadPeliculas=0;
    public ArrayList<Peliculas> peliculas;

    public CineControlador(Integer uno){
        this.cantidadSalas=uno;
        salas= new Sala[this.cantidadSalas];
    }

    public Boolean crearSala(Integer filas, Integer num,String tipo,Integer numero){
        if(salas.length-cantidadSalas!=0){
            return false;
        }
        salas[cantidadSalas]= new Sala(filas,num,tipo,numero);
        return true;
    }

    public Boolean crearPelicula(String nombre,String actores,String clasificacion,String director,Integer duracion){
        peliculas.add( new Peliculas(nombre,actores,clasificacion,director,duracion));
        return true;
    }

    public String verSalas(){
        String reporte="";
        for(Integer i=0;i<cantidadSalas;i++){
            reporte+=i.toString()+". Sala "+salas[i].numero+"\n";
        }       
        return reporte;
    }
    public String verPeliculas(){
        String reporte="";
        for(Integer i=0;i<cantidadPeliculas;i++){
            reporte+=i.toString()+". "+peliculas.get(i).nombre+"\n";
        }       
        return reporte;
    }

}