/**
 * Tarea
 */
public class Tarea {

    public static int id = 0;

    private int id_tarea;
    private String nombre;
    private String comentario;
    private String estado;

    public Tarea(String nombre, String comentario, String estado) {
        this.id_tarea = id++;
        this.nombre = nombre;
        this.comentario = comentario;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getComentario() {
        return comentario;
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

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}