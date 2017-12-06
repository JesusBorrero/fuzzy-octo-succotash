package Bolsa;

import java.util.ArrayList;

public class BolsaDeValores {
    private String nombre;
    private ArrayList<Empresa> empresas ;

    public BolsaDeValores(String nombre) {
        this.nombre = nombre;
        this.empresas = new ArrayList<Empresa>();
    }

    public void AñadirEmpresa(Empresa e){
        this.empresas.add(e);
    }

    public void EliminarEmpresa(Empresa e){this.empresas.remove(e);}

}
