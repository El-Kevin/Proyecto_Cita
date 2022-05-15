package Clases;

/**
 *
 * @author HOME
 */
public abstract class CitaMedica {
    private String Especialidad;
    private String FechaEmision;
    private String Nombremedico;
    private String FechaCita;
    private int Disponibilidad;

    public CitaMedica() {
    }
    

    public CitaMedica(String Especialidad, String FechaEmision, String Nombremedico, String FechaCita, int Disponibilidad) {
        this.Especialidad = Especialidad;
        this.FechaEmision = FechaEmision;
        this.Nombremedico = Nombremedico;
        this.FechaCita = FechaCita;
        this.Disponibilidad = Disponibilidad;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public String getFechaEmision() {
        return FechaEmision;
    }

    public void setFechaEmision(String FechaEmision) {
        this.FechaEmision = FechaEmision;
    }

    public String getNombremedico() {
        return Nombremedico;
    }

    public void setNombremedico(String Nombremedico) {
        this.Nombremedico = Nombremedico;
    }

    public String getFechaCita() {
        return FechaCita;
    }

    public void setFechaCita(String FechaCita) {
        this.FechaCita = FechaCita;
    }

    public int getDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(int Disponibilidad) {
        this.Disponibilidad = Disponibilidad;
    }
    
}
