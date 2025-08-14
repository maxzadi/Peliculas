package Modelo;
import java.util.ArrayList;

public class Sala {
    public ArrayList<ArrayList<Asiento>> asientos;
    public int espacio;
    public int espacioTotal;
    public String tipo;
    public int numero;

    public Sala(int filas, int num, String tipo, Integer numero) {
        this.espacio = filas * num;
        this.espacioTotal = filas * num;
        this.tipo = tipo;
        this.numero = numero;
        
        asientos = new ArrayList<>();
        for (int i = 0; i < filas; i++) {
            ArrayList<Asiento> fila = new ArrayList<>();
            for (int j = 0; j < num; j++) {
                fila.add(new Asiento(i + "-" + j, false, "limpio"));
            }
            asientos.add(fila);
        }
    }

    public int cantidadAsientos() {
        return espacio;
    }

    public String tipoFuncion() {
        return tipo;
    }

    public void actualizar(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public void actualizar(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public boolean comprarAsientos(int cantidad) {
        if (cantidad > espacio) {
            return false;
        }

        for (int i = 0; i < asientos.size() && cantidad > 0; i++) {
            ArrayList<Asiento> fila = asientos.get(i);
            for (int j = 0; j < fila.size() && cantidad > 0; j++) {
                Asiento asiento = fila.get(j);
                if (!asiento.ocupado()) {
                    asiento.sentarse();
                    espacio--;
                    cantidad--;
                }
            }
        }

        return cantidad == 0;
    }
}
