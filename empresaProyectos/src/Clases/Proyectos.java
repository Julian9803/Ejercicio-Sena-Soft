
package Clases;

import java.util.Vector;


public class Proyectos {
    private int idProyectos;
    private String titulo;
    private String descripcion;
    private String fechaInicio;
    private int Duracion;
    private String jefeProyecto;
    private int idIntegrante;
    private int idAdministrador;
    
    
    //Constructor

    public Proyectos(){
        
    }
    
    public Proyectos(int idProyectos, String titulo, String descripcion, String fechaInicio, int Duracion, String jefeProyecto, int idIntegrante, int idAdministrador) {
        this.idProyectos = idProyectos;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.Duracion = Duracion;
        this.jefeProyecto = jefeProyecto;
        this.idIntegrante = idIntegrante;
        this.idAdministrador = idAdministrador;
    }
    
    //Setter and Getter
    public int getIdProyectos() {
        return idProyectos;
    }

    public void setIdProyectos(int idProyectos) {
        this.idProyectos = idProyectos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    public String getJefeProyecto() {
        return jefeProyecto;
    }

    public void setJefeProyecto(String jefeProyecto) {
        this.jefeProyecto = jefeProyecto;
    }

    public int getIdIntegrante() {
        return idIntegrante;
    }

    public void setIdIntegrante(int idIntegrante) {
        this.idIntegrante = idIntegrante;
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }
    
    
    //ArrayToVector
    
    public Vector arrayToVector(){
        Vector lista = new Vector();
        
        lista.add(this.idProyectos);
        lista.add(this.titulo);
        lista.add(this.fechaInicio);
        lista.add(this.Duracion);
        lista.add(this.jefeProyecto);
        lista.add(this.idIntegrante);
        lista.add(this.idAdministrador);
        
        return lista;
        
        
    }
    
    
}
