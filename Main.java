import Banco.*;

public class Main {

    public static void main(String[] args) {
        Banco b = new Banco ("Bankia");
        Cliente c1 = new Cliente("Paula", "068789G", 200);
        Cliente c2 = new Cliente("Pilo","9898989v", 8977);
        Cliente c3 = new Cliente("Tosto", "7387878", 789);
        b.AñadirCliente(c1);
        b.AñadirCliente(c2);
        b.AñadirCliente(c3);
        b.ImprimirClientes();
        b.EliminarCliente(c1);
        b.ImprimirClientes();
    }
}
