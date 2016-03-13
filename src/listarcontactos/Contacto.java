package listarcontactos;

/**
 *
 * @author ngarciacarrillo
 * @version 1.1
 * @since JDK7
 */
public class Contacto {

    /**
     * Variables privadas que van hacer referenia a los datos necesarios para
     * crear un contacto nombre, apeelido, email, telefono y un identificador
     * llamado ID
     */
    private String nombre;
    private String Apellido;
    private String email;
    private String telefono;
    private int ID;

    /**
     * constructor de la clase con parameto ID. Es necesario para diferenciar
     * cada elemento del array Para poder establecer que elemento esta libre y
     * cuales son NULL
     *
     * @param ID
     */
    public Contacto(int ID) {
        this.ID = ID;

    }

    /**
     * constructor de la clase Contacto
     *
     * @param nombre
     * @param Apellido
     * @param email
     * @param telefono
     */
    public Contacto(String nombre, String Apellido, String email, String telefono) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.email = email;
        this.telefono = telefono;

    }

    /**
     * Getter del atributo Nombre
     *
     * @return string nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter para modificar el atributo nombre
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter del atributo Apellido
     *
     * @return string apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * Setter para modificar el atributo apellido
     *
     * @param Apellido
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    /* Getter del atributo email
     @return String email*/

    public String getEmail() {
        return email;
    }

    /**
     * Setter para modificar el atributo Email
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter del atributo telefono
     *
     * @return string telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Setter para modificar el atributo telefono
     *
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    /* Getter del atributo ID
     @return un Int ID*/

    public int getID() {
        return ID;
    }

    /**
     * *Setter para modificar el atributo ID
     *
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * Metódo toString que sobreescribe el metodo
     *
     * @return devuelve todos los parametros de la clase contacto con sus
     * valores en una cadena de caracteres
     */
    @Override
    public String toString() {
        return "Contacto " + "Nombre: " + nombre + ", Apellido: " + Apellido + ", email: " + email + ", telefono: " + telefono + ", ID: " + ID;
    }

}
