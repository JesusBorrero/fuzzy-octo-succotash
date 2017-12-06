package Banco;

public class PaqueteDeAcciones {
    private String nombre;
    private int valor;
    private int cantidad;
    private int valor_total;

    public PaqueteDeAcciones(String nombre, int valor, int cantidad) {
        this.nombre = nombre;
        this.valor = valor;
        this.cantidad = cantidad;
        this.valor_total = this.ValorTotal();
    }

    public int ValorTotal(){
        int total = this.valor* this.cantidad ;
        return total;
    }

    public String getNombre() {
        return nombre;
    }
}
