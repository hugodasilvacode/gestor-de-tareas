import java.util.ArrayList;
import java.util.Scanner;

/**
 * GestorDeTareas
 */
public class GestorDeTareas {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        ArrayList<Tarea> arrayTareas = new ArrayList<Tarea>();

        while (true) {
            System.out.println("a) Crear tarea\nb) Borrar tarea\nc) Mostrar tareas\nd)Modificar Prioridad");
            String opcion = escaner.nextLine();

            switch (opcion) {
                case "a":
                    System.out.println("Nombre");
                    String nombre = escaner.nextLine();
                    System.out.println("Descripcion");
                    String descripcion = escaner.nextLine();
                    System.out.println("Estado");
                    String estado = escaner.nextLine();
                    System.out.println("prioridad: ");
                    String prioridad = escaner.nextLine();
                    Tarea tareaNew = new Tarea(nombre, descripcion, estado, prioridad);
                    arrayTareas.add(tareaNew);
                    break;
                case "b":
                    System.out.println("ID tarea a borrar");
                    int id = escaner.nextInt();
                    for (int i = 0; i <= arrayTareas.size(); i++) {
                        if (arrayTareas.get(i).getId_tarea() == id) {
                            arrayTareas.remove(arrayTareas.get(i));
                        }
                    }
                    break;
                case "c":
                    for (Tarea i : arrayTareas) {
                        System.out.println("ID: " + i.getId_tarea() + " , Nombre: " + i.getNombre() + " , Estado: "
                                + i.getEstado() + " , Descripcion: " + i.getDescripcion());
                    }
                    break;

                case "d":
                    System.out.println("ID tarea a borrar");
                    int id_prioridad = escaner.nextInt();
                    System.out.println("Modificar prioridad: ");
                    String newprioridad = escaner.nextLine();

                    for (int i = 0; i <= arrayTareas.size(); i++) {
                        if (arrayTareas.get(i).getId_tarea() == id_prioridad) {
                            arrayTareas.get(i).setprioridad(newprioridad);
                        }
                    }
                    break;

            }
        }

    }
}