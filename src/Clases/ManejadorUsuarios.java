/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.filechooser.FileSystemView;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

/**
 *
 * @author HOME
 */
public class ManejadorUsuarios {
       public ManejadorUsuarios() {
    }
    
    private static String pathUsuarios = 
            FileSystemView.getFileSystemView().getDefaultDirectory().getPath() 
            + "\\Usuarios\\data.json";
    
     public static ArrayList<Paciente> readField() throws FileNotFoundException{
        // ScoreData is the array where we can read the core from file
        ArrayList <Paciente> dataList = new ArrayList<Paciente>();
        
        File file = new File(pathUsuarios);
        // If the file is empty or is not exist return the dataList
         if(!file.exists() || file.length() == 0){
             return dataList;
         }
         // Start to parser
         JSONTokener parser = new JSONTokener(new FileInputStream(file));
         //Initial the JSONArray
         JSONArray jsonList = new JSONArray(parser);
         
         for (int i = 0; i < jsonList.length(); i++){
             JSONObject jsonObject = (JSONObject) jsonList.get(i);
             Paciente userData = new Paciente();
             userData.setNombre(jsonObject.getString("Nombre"));
             userData.setApellido(jsonObject.getString("Apellido"));
             userData.setNumeroCedula(jsonObject.getString("Cedula"));
             userData.setMotivoCita(jsonObject.getString("MotivoCita"));
             userData.setClave(jsonObject.getString("Clave"));
             dataList.add(userData);
         }
         return dataList;
    }
    public void comprobarRegistro(String Usuario, String password) throws FileNotFoundException{
        ArrayList<Paciente> listaPaciente = new ArrayList<Paciente>();
        listaPaciente = readField();
        
        for (Paciente User : listaPaciente){
            if(User.getNumeroCedula().equalsIgnoreCase(Usuario) && User.getClave().equalsIgnoreCase(password) ){  
                System.out.print("Ha ingresado con exito");
                break;
            }
        }
    }
}
