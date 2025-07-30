public class Sala {
    private int asientos;
    private String tipo;
    private int numero;

    Sala(int asientos, String tipo){
        this.asientos=asientos;
        this.tipo=tipo;
    }

    Sala(int asientos, String tipo, int numero){
        this.asientos=asientos;
        this.tipo=tipo;
        this.numero=numero;
    }

    public int cantidadAsientos(){
        return asientos;
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