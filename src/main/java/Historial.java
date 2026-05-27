import java.util.ArrayDeque;
import java.util.Deque;

public class Historial{

    private Deque<String> historial = new ArrayDeque<>();
    private Deque<String> adelante = new ArrayDeque<>();


    public void visitar(String pagina) {
        historial.addLast(pagina);
        adelante.clear();
        System.out.println("Visitar: " + pagina);
    }


    public void retroceder() {
        if (historial.size() > 1) {
            String paginaActual = historial.removeLast();
            adelante.addFirst(paginaActual);

            System.out.println("Retroceder -> Ahora estás en: " + historial.peekLast());
        } else {
            System.out.println("No se puede retroceder más.");
        }
    }


    public void avanzar() {
        if (!adelante.isEmpty()) {
            String paginaSiguiente = adelante.removeFirst();
            historial.addLast(paginaSiguiente);
            System.out.println("Avanzar -> Ahora estás en: " + paginaSiguiente);
        } else {
            System.out.println("No se puede avanzar más.");
        }
    }


    public void mostrarHistorial() {
        System.out.println("Historial actual: " + historial + " | Página actual: " + historial.peekLast());
    }


    public static void main(String[] args) {
        Historial navegador = new Historial();

        // Operaciones solicitadas:
        navegador.visitar("Google");
        navegador.visitar("YouTube");
        navegador.visitar("Moodle");
        navegador.mostrarHistorial(); // Ver cómo quedó

        navegador.retroceder();       // Retroceder
        navegador.avanzar();          // Avanzar
    }
}
