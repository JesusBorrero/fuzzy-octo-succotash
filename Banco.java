package Banco;

import java.util.ArrayList;

public class Banco {
    private String nombre;
    private ArrayList<Cliente> clientes;
    private AgenteDeInversiones broker;

    public Banco(String nombre, AgenteDeInversiones broker) {
        this.nombre = nombre;
        this.broker = broker;
        this.clientes = new ArrayList<Cliente>();
    }

    public Banco(String nombre) {
        this.nombre=nombre;
        this.clientes = new ArrayList<Cliente>();
    }

    public void AñadirCliente (Cliente c) {
        this.clientes.add(c);
    }

    public void EliminarCliente (Cliente c) {
        this.clientes.remove(c);
    }

    public void ImprimirClientes() {  // FALTA EXCEPCIONES
        for (Cliente c : clientes){
            c.Imprime();
        }
    }

    public void CopiaSeguridad() {

    }

    public void RestauraCopiaSeguridad() {

    }
}
