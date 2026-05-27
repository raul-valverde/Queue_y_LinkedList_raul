import java.util.LinkedList;
import java.util.Queue;

public class GestionBanco {
    public static void main(String[] args) {
        Queue<String> ColaClientes =  new LinkedList<>();

        ColaClientes.add("Ana");
        ColaClientes.add("José");
        ColaClientes.add("Hendrix");
        ColaClientes.add("Kellys");
        ColaClientes.add("Raúl");
        ColaClientes.add("Marco");
        ColaClientes.add("Nora");
        ColaClientes.add("Manuel");

        while(!ColaClientes.isEmpty()){
            System.out.println("En espera :"+ColaClientes.peek());

            String ClienteAtendido = ColaClientes.poll();
            System.out.println("Cliente atendido:" +ClienteAtendido);

            System.out.println("Clientes restantes: "+ ColaClientes.size());
        }
    }
}
