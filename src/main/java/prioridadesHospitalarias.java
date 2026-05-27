import java.util.PriorityQueue;
import java.util.Comparator;

class Paciente {
    private String nombre;
    private int prioridad;

    public Paciente(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    public String getNombre() { return nombre; }
    public int getPrioridad() { return prioridad; }

    @Override
    public String toString() {
        String tipo = (prioridad == 1) ? "Emergencia" : (prioridad == 2) ? "Urgente" : "Consulta general";
        return nombre + " (" + tipo + ")";
    }
}

public class prioridadesHospitalarias {
    public static void main(String[] args) {


        PriorityQueue<Paciente> colaHospital = new PriorityQueue<>(
                (p1, p2) -> Integer.compare(p1.getPrioridad(), p2.getPrioridad())
        );

        // Registrar los 6 pacientes
        colaHospital.add(new Paciente("Carlos López", 3));
        colaHospital.add(new Paciente("Ana Martínez", 1));
        colaHospital.add(new Paciente("Juan Pérez", 2));
        colaHospital.add(new Paciente("María Gómez", 1));
        colaHospital.add(new Paciente("Luis Torres", 3));
        colaHospital.add(new Paciente("Sofía Rodríguez", 2));

        System.out.println("=== ORDEN DE ATENCIÓN (Usando Lambdas) ===");

        // Mostrar el orden
        int turno = 1;
        while (!colaHospital.isEmpty()) {
            System.out.println("Turno " + turno + ": " + colaHospital.poll());
            turno++;
        }
    }
}