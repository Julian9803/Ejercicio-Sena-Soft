
package Clases;

import java.util.Vector;


public class Integrante {
    
    int idIntegrante; 
    String documento;
    String nombre;
    String apellidos;
    String fechaNacimiento;
    String email;
    String numeroContacto;
    String direccion;
    String user;
    String password;
    String rol;
    int idAdministrador;

    public int getIdIntegrante() {
        return idIntegrante;
    }

    public void setIdIntegrante(int idIntegrante) {
        this.idIntegrante = idIntegrante;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public Integrante(int idIntegrante, String documento, String nombre, String apellidos, String fechaNacimiento, String email, String numeroContacto, String direccion, String user, String password, String rol, int idAdministrador) {
        this.idIntegrante = idIntegrante;
        this.documento = documento;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.numeroContacto = numeroContacto;
        this.direccion = direccion;
        this.user = user;
        this.password = password;
        this.rol = rol;
        this.idAdministrador = idAdministrador;
    }
    
    
    public Integrante(){
        
    }
    
    public Vector arrayToVector(){
        Vector lista = new Vector();
        lista.add(this.idIntegrante);
        lista.add(this.nombre);
        lista.add(this.documento);
        lista.add(this.apellidos);
        lista.add(this.fechaNacimiento);
        lista.add(this.email);
        lista.add(this.numeroContacto);
        lista.add(this.direccion);
        lista.add(this.user);
        lista.add(this.password);
        lista.add(this.rol);
        lista.add(this.idAdministrador);
        
        return lista;
    }
    
    
}
