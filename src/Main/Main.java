/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Clases.CitaMedica;
import Clases.ManejadorCitas;
import Clases.ManejadorUsuarios;
import Clases.Paciente;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
    ArrayList<CitaMedica> listaCita = new ArrayList<CitaMedica>();
    ManejadorCitas u = new ManejadorCitas();
         
    listaCita= u.readField();
    for (CitaMedica User : listaCita){
            System.out.println(User.getNombremedico());
        }
 /*
    
    public boolean comprobarRegistro(String Usuario, String password) throws FileNotFoundException{
        ArrayList<Paciente> listaPaciente = new ArrayList<Paciente>();
        listaPaciente = readField();
        
        for (Paciente User : listaPaciente){
            if(User.getNumeroCedula().equalsIgnoreCase(Usuario) && User.getClave().equalsIgnoreCase(password) ){  
                return true;
            }
        }
        return false;
    }
    
    
        CitaMedica c1 = new CitaMedica("asdasd", "asfaf", "asdasd", "asdasdf", 0) {
        };
     //   CitaMedica c2 = new CitaMedica("asbbbdasd", "adfgsfaf", "asda00sd", "asda00sdf", 1) {
       // };
    //Paciente paciente1 = new Paciente("1752331701", "KevinX", "Xaviser", "Quiro", "asnd", "123");
    ArrayList<CitaMedica> listaCita = new ArrayList<CitaMedica>();
    listaCita.add(c1);
    //listaCita.add(c2);
    //listaPaciente.add(paciente1);
    ManejadorCitas u = new ManejadorCitas();
    u.sobreescribirArchivo(listaCita);
    */

    
    
    }
    
}
