import java.util.Date;

// Importar las clases necesarias
import java.util.ArrayList;
import java.util.List;

// Clase Doctor que hereda de Persona e implementa Contrato
public class Doctor extends Persona implements Contrato {
    // Atributos específicos de Doctor
    private String numeroColegiado;
    private String tipoContrato;

    // Asociaciones
    private List<CitasMedicas> citasMedicas; // Agregación con CitasMedicas
    private Especialidad especialidad; // Asociación con Especialidad
    private List<Paciente> pacientesAsignados; // Asociación con Paciente
    private List<Enfermero> enfermerosAsignados; // Asociación con Enfermero
    private GestionCitas gestionCitas; // Dependencia de la clase GestionCitas

    // Constructor
    public Doctor(String nombre, String apellido, String dni, int edad, Date fechaNacimiento, String direccion, String numeroColegiado, String tipoContrato) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.numeroColegiado = numeroColegiado;
        this.tipoContrato = tipoContrato;
        this.citasMedicas = new ArrayList<>();
        this.pacientesAsignados = new ArrayList<>();
        this.enfermerosAsignados = new ArrayList<>();
    }

    // Métodos getter y setter para los atributos específicos de Doctor
    public String getNumeroColegiado() {
        return numeroColegiado;
    }

    public void setNumeroColegiado(String numeroColegiado) {
        this.numeroColegiado = numeroColegiado;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    // Métodos getter y setter para las asociaciones
    public List<CitasMedicas> getCitasMedicas() {
        return citasMedicas;
    }

    public void setCitasMedicas(List<CitasMedicas> citasMedicas) {
        this.citasMedicas = citasMedicas;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public List<Paciente> getPacientesAsignados() {
        return pacientesAsignados;
    }

    public void setPacientesAsignados(List<Paciente> pacientesAsignados) {
        this.pacientesAsignados = pacientesAsignados;
    }

    public List<Enfermero> getEnfermerosAsignados() {
        return enfermerosAsignados;
    }

    public void setEnfermerosAsignados(List<Enfermero> enfermerosAsignados) {
        this.enfermerosAsignados = enfermerosAsignados;
    }

    public GestionCitas getGestionCitas() {
        return gestionCitas;
    }

    public void setGestionCitas(GestionCitas gestionCitas) {
        this.gestionCitas = gestionCitas;
    }

    // Implementación de los métodos de la interfaz Contrato
    @Override
    public String getTipoContrato() {
        return tipoContrato;
    }

    @Override
    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    // Otros métodos específicos de Doctor
}

