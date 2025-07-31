import Modelo.Asiento;
import Modelo.Sala;
import Modelo.Peliculas;

public class CineControlador {
    public Sala[] salas = new Sala[5];
    public Peliculas[] peliculas = new Peliculas[5];

    public CineControlador(){
        salas[0]=new Sala(50,"Normal",1);
        salas[1]=new Sala(50,"Normal",2);
        salas[2]=new Sala(50,"Normal",3);
        salas[3]=new Sala(50,"Normal",4);
        salas[4]=new Sala(50,"Normal",5);
    }

    
}