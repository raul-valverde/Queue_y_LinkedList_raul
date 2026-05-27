import java.util.Deque;
import java.util.LinkedList;

public class GestionTareas {
    public static void main(String[] args) {

        // REQUISITO: Crear un Deque<String> usando LinkedList
        Deque<String> tareas = new LinkedList<>();

        // REQUISITO: Agregar tareas según su prioridad
        // Tareas normales van al final -> offerLast()
        // Tareas urgentes van al inicio -> offerFirst()

        tareas.offerLast("Normal: Revisar correos");
        tareas.offerLast("Normal: Recoger mangos de la casa");

        // Al usar offerFirst, estas se meten al frente de la fila empujando a las normales
        tareas.offerFirst("Urgente: Realizar tareas de mis clases UAM");
        tareas.offerFirst("Urgente: Resolver caída del sistema");
        tareas.offerFirst("Urgente: APRENDER A INTEGRAR");

        // REQUISITO: Mostrar el orden de ejecución
        System.out.println("=== LISTA DE TAREAS ORGANIZADAS ===");
        System.out.println(tareas);
        System.out.println();

        // REQUISITO: Procesar tareas una por una usando pollFirst()
        System.out.println("=== PROCESANDO TAREAS ===");

        while (!tareas.isEmpty()) {
            // pollFirst() saca siempre la que está al principio de la fila
            String tareaActual = tareas.pollFirst();
            System.out.println("Ejecutando -> " + tareaActual);
            System.out.println("Finalizaste todas las tareas");
        }
    }
}