import java.util.Date;

public class CitasMedicas {
    private Date fecha;
    private Date hora;
    private Estado estado; // Asociación con la enumeración Estado
    private Doctor doctor; // Agregación con Doctor
    private Paciente paciente; // Agregación con Paciente
    private GestionCitas gestionCitas; // Composición con GestionCitas

    public CitasMedicas(Date fecha, Date hora, Estado estado, Doctor doctor, Paciente paciente, GestionCitas gestionCitas) {
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
        this.doctor = doctor;
        this.paciente = paciente;
        this.gestionCitas = gestionCitas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public GestionCitas getGestionCitas() {
        return gestionCitas;
    }

    public void setGestionCitas(GestionCitas gestionCitas) {
        this.gestionCitas = gestionCitas;
    }
}
