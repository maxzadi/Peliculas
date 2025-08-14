package Modelo;
public class Asiento {
    private boolean ocupado;
    private String codigo;
    private String estado;

    // Constructores
    public Asiento(String codigo) {
        this.codigo = codigo;
        this.ocupado = false; 
        this.estado = "libre"; 
    }

    public Asiento(String codigo, boolean ocupado, String estado) {
        this.codigo = codigo;
        this.ocupado = ocupado;
        this.estado = estado;
    }

    // Métodos
    public void sentarse() {
        this.ocupado = true;
        this.estado = "ocupado";
    }

    public void sentarse(String persona) {
        this.ocupado = true;
        this.estado = "ocupado";
    }

    public void levantarse() {
        this.ocupado = false;
        this.estado = "libre";
    }

    public void levantarse(String persona) {
        this.ocupado = false;
        this.estado = "libre";
    }

    public String mostrarCodigo() {
        return codigo;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public Boolean ocupado(){
        return ocupado;
    }
}
