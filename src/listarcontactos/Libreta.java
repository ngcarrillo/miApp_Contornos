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
 */
public class Libreta {

    private String datosPropietario;
    Contacto[] contacto = new Contacto[10];

    public void introducirDatosPropietario() {
        datosPropietario = JOptionPane.showInputDialog("Introduce tu nombre y apellidos");

    }

    public int cualLibre() {
        int ID = -1; //-1 Porque los ID empiezan en 0
        for (int i = 0; i < 10; i++) {
            if (contacto[i].getNombre() == null) {
                ID = contacto[i].getID();
            }
        }
        return ID;

    }

    public void engadir() {
        if (cualLibre() < 0) {
            JOptionPane.showMessageDialog(null, "Tu agenda está llena. Si quieres añadir otro contacto borra uno anterior");
        } else {
            int id = -1;
            for (int i = 0; i < contacto.length; i++) {
                if (id == cualLibre()) {
                    contacto[id].setNombre(JOptionPane.showInputDialog("Introduzca el nombre del contacto:"));
                    contacto[id].setApellido(JOptionPane.showInputDialog("Introduzca el apellido del contacto:"));
                    contacto[id].setTelefono(JOptionPane.showInputDialog("Introduzca el número del contacto:"));
                    contacto[id].setEmail(JOptionPane.showInputDialog("Introduzca el email del contacto:"));
                    JOptionPane.showMessageDialog(null, "Contacto creado");
                    break;
                }
            }

        }
    }
