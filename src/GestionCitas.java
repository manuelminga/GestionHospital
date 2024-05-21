public class GestionCitas {
    // Atributos para gestionar las acciones sobre las citas médicas
    private boolean programar;
    private boolean cancelar;
    private boolean realizar;
    private boolean reprogramar;

    // Constructor
    public GestionCitas(boolean programar, boolean cancelar, boolean realizar, boolean reprogramar) {
        this.programar = programar;
        this.cancelar = cancelar;
        this.realizar = realizar;
        this.reprogramar = reprogramar;
    }

    // Getters y setters para los atributos
    public boolean isProgramar() {
        return programar;
    }

    public void setProgramar(boolean programar) {
        this.programar = programar;
    }

    public boolean isCancelar() {
        return cancelar;
    }

    public void setCancelar(boolean cancelar) {
        this.cancelar = cancelar;
    }

    public boolean isRealizar() {
        return realizar;
    }

    public void setRealizar(boolean realizar) {
        this.realizar = realizar;
    }

    public boolean isReprogramar() {
        return reprogramar;
    }

    public void setReprogramar(boolean reprogramar) {
        this.reprogramar = reprogramar;
    }
}
