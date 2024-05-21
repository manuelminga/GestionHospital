import java.util.Date;

public class Enfermero extends Persona implements Contrato {
    private String especialidad;
    private String tipoContrato;
    private Doctor doctorAsociado; // Asociación con Doctor

    public Enfermero(String nombre, String apellido, String dni, int edad, Date fechaNacimiento, String direccion, String especialidad, String tipoContrato, Doctor doctorAsociado) {
        super(nombre, apellido, dni, edad, fechaNacimiento, direccion);
        this.especialidad = especialidad;
        this.tipoContrato = tipoContrato;
        this.doctorAsociado = doctorAsociado;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public Doctor getDoctorAsociado() {
        return doctorAsociado;
    }

    public void setDoctorAsociado(Doctor doctorAsociado) {
        this.doctorAsociado = doctorAsociado;
    }

    @Override
    public String getTipoContrato() {
        return tipoContrato;
    }

    @Override
    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
}
