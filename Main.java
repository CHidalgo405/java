
public class Main {}import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaDeTareas listaDeTareas = new ListaDeTareas();
                String opcion;

        do {
            System.out.println("\n1. Agregar tarea");
            System.out.println("2. Eliminar tarea");
            System.out.println("3. Mostrar tareas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Ingrese la descripción de la tarea: ");
                    String descripcion = scanner.nextLine();
                    listaDeTareas.agregarTarea(descripcion);
                    break;
                case "2":
                    listaDeTareas.mostrarTareas();
                    System.out.print("Ingrese el número de la tarea a eliminar: ");
                    int index = Integer.parseInt(scanner.nextLine()) - 1;
                    listaDeTareas.eliminarTarea(index);
                    break;
                case "3":
                    listaDeTareas.mostrarTareas();
                    break;
                case "4":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida, por favor intente de nuevo.");
                    break;
            }
        } while (!opcion.equals("4"));
    }
}
