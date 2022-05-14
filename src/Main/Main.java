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

    public static void main(String[] args) throws FileNotFoundException {
       
        String id = "1c";
        String clave = "ac";
        ManejadorUsuarios usarios = new ManejadorUsuarios();
        usarios.comprobarRegistro(id, clave);
     
    }
    
}
