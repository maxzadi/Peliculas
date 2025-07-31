import Modelo.Asiento;
import Modelo.Sala;
import Modelo.Peliculas;

public class CineControlador {
    public Sala[] salas;
    public Integer cantidadSalas;
    public Integer cantidadPeliculas;
    public Peliculas[] peliculas;

    public CineControlador(Integer uno, Integer dos){
        this.cantidadSalas=uno;
        this.cantidadPeliculas=dos;
    }

    public Boolean crearSala(Integer espacio, String tipo, Integer numero){
        if(salas.length-cantidadSalas!=0){
            return false;
        }
        salas[cantidadSalas]= new Sala(espacio,tipo,numero);
        return true;
    }

    public Boolean crearPelicula(String nombre,String actores,String clasificacion,String director,Integer duracion){
        if(peliculas.length-cantidadPeliculas!=0){
            return false;
        }
        peliculas[cantidadPeliculas]= new Peliculas(nombre,actores,clasificacion,director,duracion);
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
            reporte+=i.toString()+". "+peliculas[i].nombre+"\n";
        }       
        return reporte;
    }

}