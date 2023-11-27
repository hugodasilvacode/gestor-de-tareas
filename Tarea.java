/**
 * Tarea
 */
public class Tarea {

    public static int id = 0;

    private int id_tarea;
    private String nombre;
    private String descripcion;
    private String estado;
    private String prioridad;

    public Tarea(String nombre, String descripcion, String estado, String prioridad) {
        this.id_tarea = id++;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.prioridad = prioridad;
    }

    public String getprioridad() {
        return prioridad;
    }

    public void setprioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public int getId_tarea() {
        return id_tarea;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}