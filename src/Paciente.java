import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Paciente extends Persona {
    private String numeroHistorial;
    private String grupoSanguineo;
    private ExpedienteMedico expedienteMedico;
    private List<CitasMedicas> citasMedicas;
    private List<Doctor> doctoresAsociados;

    public Paciente(String nombre, String apellido, String dni, int edad, Date fechaNacimiento, String direccion, String numeroHistorial, String grupoSanguineo, ExpedienteMedico expedienteMedico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.numeroHistorial = numeroHistorial;
        this.grupoSanguineo = grupoSanguineo;
        this.expedienteMedico = expedienteMedico;
        this.citasMedicas = new ArrayList<>();
        this.doctoresAsociados = new ArrayList<>();
    }

    // Getters y setters
    public String getNumeroHistorial() {
        return numeroHistorial;
    }

    public void setNumeroHistorial(String numeroHistorial) {
        this.numeroHistorial = numeroHistorial;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public ExpedienteMedico getExpedienteMedico() {
        return expedienteMedico;
    }

    public void setExpedienteMedico(ExpedienteMedico expedienteMedico) {
        this.expedienteMedico = expedienteMedico;
    }

    public List<CitasMedicas> getCitasMedicas() {
        return citasMedicas;
    }

    public void setCitasMedicas(List<CitasMedicas> citasMedicas) {
        this.citasMedicas = citasMedicas;
    }

    public List<Doctor> getDoctoresAsociados() {
        return doctoresAsociados;
    }

    public void setDoctoresAsociados(List<Doctor> doctoresAsociados) {
        this.doctoresAsociados = doctoresAsociados;
    }
}
