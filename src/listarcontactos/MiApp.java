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
public class MiApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /** Se crea un objeto de la clase libreta llamado miLibreta */
        Libreta miLibreta = new Libreta();
       
       
        int opcion;
        int seguir;
        int engadirMas;
        JOptionPane.showMessageDialog(null, "Bienvenido a tu agenda");
        
        /**Se llama al metodo introducirDatosPropietarios de la clase Libreta
         Se solicita los datos del creador de la libreta
         Este método tambien crea el Array de contactos vacios*/
        miLibreta.introducirDatosPropietario();
        
        
        do {
            /**             MENU OPCIONES                       */
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Elige que deseas hacer \n   Opcion1: Agregar nuevo contacto\n "
                    + " Opcion2: Ver los contactos ya creados\n  Opcion3:Editar un contacto \n "
                    + " Opcion 4:Eliminar unc contacto\n "));
            
            switch (opcion) {
                case 1:
                    /**Añadir contacto */
                    miLibreta.engadir();
                    
                    break;
                case 2:
                    /** visualizar contactos creado*/
                    miLibreta.listar();
                    break;
                case 3:
                    /** Editar un contacto ya creado*/
                    miLibreta.editar();
                    break;
                case 4:
                    /** Eliminar un contacto(pondrá todos los campos en NULL)*/
                    miLibreta.eliminar();
                    break;
                    
                default:
                    /**Opción por defecto cuando la opcion elegida no existe */
                    JOptionPane.showMessageDialog(null,"Tienes que elegir una opcion entre 1 y 5");
                   break;

            }
            /** @param seguir parametro que si es 1 vuelve a comenzar el Menú, sino se finaliza */
          seguir = Integer.parseInt(JOptionPane.showInputDialog("¿Deseas continuar? si deseas continuar presiona 1, sino cualquier otra numero para salir"));
          if(seguir != 1 ){
          JOptionPane.showMessageDialog(null, "Gracias por haber usado MiAPP");
          }
        }while(seguir == 1);
    
        
        
    }
    
}
