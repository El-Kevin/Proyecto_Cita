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
public class ManejadorCitas {
    public ManejadorCitas() {
    }
    
    private static String pathCita = 
            FileSystemView.getFileSystemView().getDefaultDirectory().getPath() 
            + "\\CitasMedicas\\data.json";
    
     public static ArrayList<CitaMedica> readField() throws FileNotFoundException{
        // ScoreData is the array where we can read the core from file
        ArrayList <CitaMedica> dataList = new ArrayList<CitaMedica>();
        
        File file = new File(pathCita);
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
             CitaMedica userData = new CitaMedica();
             userData.setDisponibilidad(jsonObject.getInt("Disponibilidad"));
             userData.setEspecialidad(jsonObject.getString("Especialidad"));
             userData.setFechaCita(jsonObject.getString("Fecha Cita"));
             userData.setFechaEmision(jsonObject.getString("Fecha Emision"));
             userData.setNombremedico(jsonObject.getString("Nombre medico"));
             dataList.add(userData);
         }
         return dataList;
    }
}
