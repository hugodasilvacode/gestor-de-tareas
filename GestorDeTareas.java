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
            System.out.println("a) Crear tarea\nb) Borrar tarea\nc) Mostrar tareas\nd)Modificar Prioridad\ne) Asignar fecha limite");

            String opcion = escaner.nextLine();

            switch (opcion) {
                case "a":
                    System.out.println("Nombre");
                    String nombre = escaner.nextLine();
                    System.out.println("Descripcion");
                    String descripcion = escaner.nextLine();
                    System.out.println("Estado");
                    String estado = escaner.nextLine();
                    System.out.println("Fecha limite");
                    String fechaLimite = escaner.nextLine();
                    System.out.println("Prioridad: ");
                    String prioridad = escaner.nextLine();
                    Tarea tareaNew = new Tarea(nombre, descripcion, estado, prioridad, fechaLimite);
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
                                + i.getEstado() + " , Descripcion: " + i.getDescripcion() + "Prioridad: "
                                + i.getPrioridad() + " Fecha limite: "+ i.getFechaLimite());
                    }
                    break;
                case "d":
                    System.out.println("ID tarea");
                    int id_fecha = escaner.nextInt();
                    System.out.println("Nueva fecha limite");
                    String newFechaLimite = escaner.nextLine();
                    for (int i = 0; i <= arrayTareas.size(); i++) {
                        if (arrayTareas.get(i).getId_tarea() == id_fecha) {
                            arrayTareas.get(i).setFechaLimite(newFechaLimite);
                        }
                    }
                    break;
                case "e":
                    System.out.println("ID tarea a borrar");
                    int id_prioridad = escaner.nextInt();
                    System.out.println("Modificar prioridad: ");
                    String newprioridad = escaner.nextLine();

                    for (int i = 0; i <= arrayTareas.size(); i++) {
                        if (arrayTareas.get(i).getId_tarea() == id_prioridad) {
                            arrayTareas.get(i).setPrioridad(newprioridad);
                        }
                    }
                    break;
            }
        }

    }
}