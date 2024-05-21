public class ExpedienteMedico {
    private Paciente paciente;
    private boolean historialMedico;
    private String diagnosticos;
    private String tratamientos;
    private String prescripciones;

    public ExpedienteMedico(Paciente paciente, boolean historialMedico, String diagnosticos, String tratamientos, String prescripciones) {
        this.paciente = paciente;
        this.historialMedico = historialMedico;
        this.diagnosticos = diagnosticos;
        this.tratamientos = tratamientos;
        this.prescripciones = prescripciones;
    }

    // Getters y setters
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

}