/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Clases.ManejadorUsuarios;
import java.io.FileNotFoundException;

/**
 *
 * @author HOME
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        String id = "1c";
        String clave = "abc";
        ManejadorUsuarios usarios = new ManejadorUsuarios();
        usarios.comprobarRegistro(id, clave);
    }
}
