package Banco;
import java.util.ArrayList;

public class Cliente extends Persona{
    protected int saldo;
    protected ArrayList<PaqueteDeAcciones> acciones;

    public Cliente(String Nombre, String DNI, int saldo) {
        super(Nombre, DNI);
        this.saldo = saldo;
        this.acciones = new ArrayList<PaqueteDeAcciones>();
    }

    public Cliente(String Nombre, String DNI, int saldo, PaqueteDeAcciones accion){
        super(Nombre, DNI);
        this.saldo = saldo;
        this.acciones = new ArrayList<PaqueteDeAcciones>();
        acciones.add(accion);
    }

    public void add_accion (PaqueteDeAcciones accion){
        acciones.add(accion);
    }

    public void Imprime (){
        System.out.print("Nombre: " + this.nombre + " " + "DNI: " + this.DNI + " " + "Saldo: " + this.saldo + " ");
        // FALTA TRATAMIENTO EXCEPCIONES , COLOCADO AQUI PARA ENCAPSULACION
        for (PaqueteDeAcciones a : acciones) {
            int v = a.ValorTotal();
            System.out.print("Valor de accion " + a.getNombre() + " :" + v + " ");
        }
        System.out.println();
    }

}
