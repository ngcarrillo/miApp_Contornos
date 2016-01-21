/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listarcontactos;

/**
 *
 * @author ngarciacarrillo
 */
public class Contacto {
    private String nombre;
    private String Apellido;
    private String email;
    private String telefono;
    private int ID;

    public Contacto() {
    }

    public Contacto(String nombre, String Apellido, String email, String telefono, int ID) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.email = email;
        this.telefono = telefono;
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", Apellido=" + Apellido + ", email=" + email + ", telefono=" + telefono + ", ID=" + ID + '}';
    }
    
    
}
    