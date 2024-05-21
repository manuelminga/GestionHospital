public class ExpedienteMedico {
    private Paciente paciente; // Composición con Persona
    private boolean historialMedico;
    private String diagnosticos;
    private String tratamientos;
    private String prescripciones;
    private Doctor doctorAsociado; // Asociación con Doctor

    public ExpedienteMedico(Paciente paciente, boolean historialMedico, String diagnosticos, String tratamientos, String prescripciones, Doctor doctorAsociado) {
        this.paciente = paciente;
        this.historialMedico = historialMedico;
        this.diagnosticos = diagnosticos;
        this.tratamientos = tratamientos;
        this.prescripciones = prescripciones;
        this.doctorAsociado = doctorAsociado;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public boolean isHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(boolean historialMedico) {
        this.historialMedico = historialMedico;
    }

    public String getDiagnosticos() {
        return diagnosticos;
    }

    public void setDiagnosticos(String diagnosticos) {
        this.diagnosticos = diagnosticos;
    }

    public String getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(String tratamientos) {
        this.tratamientos = tratamientos;
    }

    public String getPrescripciones() {
        return prescripciones;
    }

    public void setPrescripciones(String prescripciones) {
        this.prescripciones = prescripciones;
    }

    public Doctor getDoctorAsociado() {
        return doctorAsociado;
    }

    public void setDoctorAsociado(Doctor doctorAsociado) {
        this.doctorAsociado = doctorAsociado;
    }
}
