    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author HOME
 */
public class CitasAgendadas extends CitaMedica{
    int numeroCitasAgendadas;
    ArrayList<CitaMedica> citasAgendadas = new ArrayList<>();

    public CitasAgendadas(int numeroCitasAgendadas) {
        this.numeroCitasAgendadas = numeroCitasAgendadas;
    }

    public CitasAgendadas(int numeroCitasAgendadas, String Especialidad, String FechaEmision, String Nombremedico, String FechaCita, int Disponibilidad) {
        super(Especialidad, FechaEmision, Nombremedico, FechaCita, Disponibilidad);
        this.numeroCitasAgendadas = numeroCitasAgendadas;
    }
    
    public void consultarAgendadas(){
        
    
    }
}
