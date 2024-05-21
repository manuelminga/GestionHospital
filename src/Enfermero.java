import java.util.Date;

public class Enfermero extends Persona implements Contrato {
    private String especialidad;
    private String tipoContrato;

    public Enfermero(String nombre, String apellido, String dni, int edad, Date fechaNacimiento, String direccion, String especialidad, String tipoContrato) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.especialidad = especialidad;
        this.tipoContrato = tipoContrato;
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