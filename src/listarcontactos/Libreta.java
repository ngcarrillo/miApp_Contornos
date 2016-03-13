/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listarcontactos;

import javax.swing.JOptionPane;

/**
 *
 * @author ngarciacarrillo
 * @version 1.1
 * @since JDK7
 */
public class Libreta {

    private String datosPropietario;
    /**
     * Definicion de un array de tipo Contacto
     */
    Contacto[] contacto = new Contacto[10];

    public void introducirDatosPropietario() {
        /**
         * @param datosPropietario variable de tipo String que almacena los
         * datos del creador de lalibreta
         */
        datosPropietario = JOptionPane.showInputDialog("Introduce tu nombre y apellidos");

        /**
         * Creación de un array vacio en el que se van almacenar los contactos
         */
        contacto[0] = new Contacto(1);
        contacto[1] = new Contacto(2);
        contacto[2] = new Contacto(3);
        contacto[3] = new Contacto(4);
        contacto[4] = new Contacto(5);
        contacto[5] = new Contacto(6);
        contacto[6] = new Contacto(7);
        contacto[7] = new Contacto(8);
        contacto[8] = new Contacto(9);
        contacto[9] = new Contacto(10);

    }

    /**
     * Método para comprobar que posiciones estan libres
     *
     * @return devuelve el ID (integer) de una posición libre
     */
    public int cualLibre() {
        int ID = -1; //-1 Porque los ID empiezan en 0
        for (Contacto contacto1 : contacto) {
            if (contacto1.getNombre() == null) {
                ID = contacto1.getID();
                break;
            }
        }
        return ID;

    }

    /**
     * Método que no devuelve nada, añade un contacto comprobando anteriormente
     * si existe una posición libre
     */
    public void engadir() {
        if (cualLibre() < 0) {
            JOptionPane.showMessageDialog(null, "Tu agenda está llena. Si quieres añadir otro contacto borra uno anterior");
        } else {
            int ID = cualLibre();
            for (Contacto contacto1 : contacto) {
                if (ID == contacto1.getID()) {
                    contacto1.setNombre(JOptionPane.showInputDialog("Introduzca el nombre del contacto:"));
                    contacto1.setApellido(JOptionPane.showInputDialog("Introduzca el apellido del contacto:"));
                    contacto1.setTelefono(JOptionPane.showInputDialog("Introduzca el número del contacto:"));
                    contacto1.setEmail(JOptionPane.showInputDialog("Introduzca el email del contacto:"));
                    JOptionPane.showMessageDialog(null, "Contacto creado");

                }
            }
        }
    }

    /**
     * Método que lista todos los contactos creados en el array contacto.
     */
    public void listar() {
        for (Contacto contacto1 : contacto) {
            String nombre = contacto1.getNombre();
            if (nombre != null) {
                JOptionPane.showMessageDialog(null, contacto1.toString());
            }
        }
    }

    /**
     * Método que edita un objeto del array contacto. Pide por pantalla cual es
     * el contacto a modificar El parametro por el que se buscara es el nombre
     * Este método también comrpueba la existencia del contacto
     */
    public void editar() {
        String nombreEditar = JOptionPane.showInputDialog("¿Que contacto quieres modificar? Escribe el nombre");
        boolean encontrado = false;
        for (Contacto contacto1 : contacto) {

            if (nombreEditar.equalsIgnoreCase(contacto1.getNombre())) {
                contacto1.setNombre(JOptionPane.showInputDialog("Introduzca el nombre del contacto:"));
                contacto1.setApellido(JOptionPane.showInputDialog("Introduzca el apellido del contacto:"));
                contacto1.setTelefono(JOptionPane.showInputDialog("Introduzca el número del contacto:"));
                contacto1.setEmail(JOptionPane.showInputDialog("Introduzca el email del contacto:"));
                encontrado = true;
            }

        }
        if (encontrado != true) {
            JOptionPane.showMessageDialog(null, "El contacto que intentas modificar no exite");
        }
    }

    /**
     * Método que elimina un objeto del array contacto. Pide por pantalla cual
     * es el contacto a eliminar En realidad no elimina el contacto sino que
     * pone todos sus valores en NULL El parametro por el que se buscara es el
     * nombre Este método también comprueba la existencia del contacto
     */
    public void eliminar() {
        String nombreBorrar = JOptionPane.showInputDialog("¿Que contacto quieres eliminar? Escribe el nombre");
        boolean encontrado = false;
        for (Contacto contacto1 : contacto) {
            if (nombreBorrar.equalsIgnoreCase(contacto1.getNombre())) {
                contacto1.setNombre(null);
                contacto1.setApellido(null);
                contacto1.setTelefono(null);
                contacto1.setEmail(null);
                JOptionPane.showMessageDialog(null, "El contacto se ha borrado");
                encontrado = true;
            }

        }
        if (encontrado != true) {
            JOptionPane.showMessageDialog(null, "El contacto que intentas borrar no exite");
        }
    }

}
