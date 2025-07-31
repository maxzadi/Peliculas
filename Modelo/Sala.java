package Modelo;
public class Sala {
    public Asiento[] asientos;
    public int espacio;
    public String tipo;
    public int numero;

    public Sala(int asientos, String tipo){
        this.espacio=asientos;
        this.tipo=tipo;
        this.asientos= new Asiento[asientos];
    }

    public Sala(int espacio, String tipo, int numero){
        this.espacio=espacio;
        this.tipo=tipo;
        this.numero=numero;
    }

    public int cantidadAsientos(){
        return espacio;
    }

    public String tipoFuncion(){
        return tipo;
    }

    public void actualizar(int numero, String tipo){   
        this.numero=numero;
        this.tipo=tipo;
    }

    public void actualizar(int numero){
        this.numero=numero;
    }

    public int getNumero(){
        return numero;
    }

}