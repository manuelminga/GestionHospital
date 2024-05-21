import java.util.Date;
import java.util.List;

public class Doctor extends Persona {
    private GestionCitas gestionCitas; // Dependencia de la clase GestionCitas
    private List<CitasMedicas> citasMedicas; // Agregación con CitasMedicas
    private List<Especialidad> especialidades; // Asociación con Especialidad
    private List<Paciente> pacientes; // Asociación con Paciente
    private List<Enfermero> enfermeros; // Asociación con Enfermero

    public Doctor(String nombre, String apellido, String dni, int edad, Date fechaNacimiento, String direccion, GestionCitas gestionCitas, List<CitasMedicas> citasMedicas, List<Especialidad> especialidades, List<Paciente> pacientes, List<Enfermero> enfermeros) {
        super(nombre, apellido, dni, edad, fechaNacimiento, direccion);
        this.gestionCitas = gestionCitas;
        this.citasMedicas = citasMedicas;
        this.especialidades = especialidades;
        this.pacientes = pacientes;
        this.enfermeros = enfermeros;
    }

    public GestionCitas getGestionCitas() {
        return gestionCitas;
    }

    public void setGestionCitas(GestionCitas gestionCitas) {
        this.gestionCitas = gestionCitas;
    }

    public List<CitasMedicas> getCitasMedicas() {
        return citasMedicas;
    }

    public void setCitasMedicas(List<CitasMedicas> citasMedicas) {
        this.citasMedicas = citasMedicas;
    }

    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public List<Enfermero> getEnfermeros() {
        return enfermeros;
    }

    public void setEnfermeros(List<Enfermero> enfermeros) {
        this.enfermeros = enfermeros;
    }
}

