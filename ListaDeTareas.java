
import java.util.ArrayList;
import java.util.List;

public class ListaDeTareas {
    private List<Tarea> tareas;

    public ListaDeTareas() {
        tareas = new ArrayList<>();
    }

    public void agregarTarea(String descripcion) {
        Tarea tarea = new Tarea(descripcion);
        tareas.add(tarea);
    }

    public void eliminarTarea(int index) {
        if (index >= 0 && index < tareas.size()) {
            tareas.remove(index);
        } else {
            System.out.println("Índice de tarea inválido.");
        }
    }

    public void mostrarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas pendientes.");
        } else {
            for (int i = 0; i < tareas.size(); i++) {
                System.out.println((i + 1) + ". " + tareas.get(i).getDescripcion());
            }
        }
    }
}
