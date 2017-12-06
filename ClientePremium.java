package Banco;

import java.util.ArrayList;

public class ClientePremium extends Cliente{
    private Gestor gestor;

    public ClientePremium(String Nombre, String DNI, int saldo, Gestor gestor){
        super(Nombre, DNI, saldo);
        this.gestor = gestor ;
        this.acciones = new ArrayList<PaqueteDeAcciones>();
    }

    public ClientePremium(String Nombre, String DNI, int saldo, Gestor gestor, PaqueteDeAcciones accion){
        super(Nombre, DNI, saldo);
        this.gestor = gestor ;
        this.acciones = new ArrayList<PaqueteDeAcciones>();
        acciones.add(accion);
    }


}
