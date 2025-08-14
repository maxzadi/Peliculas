package Modelo;
public class Sala {
    public Asiento[][] asientos;
    public int espacio;
    public int espacioTotal;
    public String tipo;
    public int numero;

    public Sala(int filas, int num, String tipo, Integer numero){
        this.espacio=filas*num;
        this.espacioTotal=filas*num;
        this.tipo=tipo;
        this.asientos= new Asiento[filas][num];
        this.numero=numero;
        for(Integer i=0;i<filas;i++){
            for(Integer j=0;j<num;j++){

            this.asientos[i][j]=new Asiento(i.toString()+"-"+j.toString(),false,"limpio");
            }
        }
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
        
        while (cantidad>0 && (i+1)*(j+1)!=espacioTotal) {
            if(asientos[i][j])
            asientos[asientos.length-espacio].sentarse();
            espacio-=1;
            cantidad-=1;
        }
        return true;
    }

}