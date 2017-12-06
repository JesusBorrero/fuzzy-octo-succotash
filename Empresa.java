package Bolsa;

public class Empresa {
    private String nombre;
    private int valor;
    private int valorPrevio;

    public int calculo_diferencia () {
        int r = this.valor - this.valorPrevio;
        return r;
    }
}
