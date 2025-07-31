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
        for(Integer i=0;i<asientos;i++){
            this.asientos[i]=new Asiento(i.toString(),false,"limpio");
        }
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

    public boolean comprarAsientos(Integer cantidad){
        if(espacio-cantidad<0){
            return false;
        }
        while (cantidad>0) {
            asientos[asientos.length-espacio].sentarse();
            espacio-=1;
            cantidad-=1;
        }
        return true;
    }

}