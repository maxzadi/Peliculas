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

    public boolean comprarAsientos(int cantidad) {
        if (cantidad > espacio) {
            return false; 
        }

        int filas = asientos.length;
        int columnas = asientos[0].length;

        for (int i = 0; i < filas && cantidad > 0; i++) {
            if (!asientos[i][0].ocupado()) {
                for (int j = 0; j < columnas && cantidad > 0; j++) {
                    if (!asientos[i][j].ocupado()) {
                        asientos[i][j].sentarse();
                        espacio--;
                        cantidad--;
                    }
                }
            }
            
            else if (!asientos[i][columnas - 1].ocupado()) {
                for (int j = columnas - 1; j >= 0 && cantidad > 0; j--) {
                    if (!asientos[i][j].ocupado()) {
                        asientos[i][j].sentarse();
                        espacio--;
                        cantidad--;
                    }
                }
            }
        }

        return cantidad == 0; 
    }

}