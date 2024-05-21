import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear objetos de prueba
        Especialidad cardiologia = Especialidad.CARDIOLOGIA;
        Especialidad dermatologia = Especialidad.DERMATOLOGIA;
        Especialidad pediatria = Especialidad.PEDIATRIA;

        Persona paciente1 = new Paciente("Juan", "Perez", "12345678", 30, new Date(), "Calle 123");
        Persona paciente2 = new Paciente("Maria", "Gonzalez", "87654321", 25, new Date(), "Avenida 456");

        Doctor doctor1 = new Doctor("Carlos", "Lopez", "98765432", 40, new Date(), "Avenida 789", null, null, null, null, null);
        Doctor doctor2 = new Doctor("Ana", "Martinez", "23456789", 35, new Date(), "Calle 012", null, null, null, null, null);

        Enfermero enfermero1 = new Enfermero("Pedro", "Gomez", "34567890", 28, new Date(), "Avenida 135", "Enfermería", "Contrato1", doctor1);
        Enfermero enfermero2 = new Enfermero("Luisa", "Sanchez", "45678901", 26, new Date(), "Calle 246", "Enfermería", "Contrato2", doctor2);

        GestionCitas gestionCitas1 = new GestionCitas(true, true, true, true);
        GestionCitas gestionCitas2 = new GestionCitas(false, true, false, true);

        CitasMedicas cita1 = new CitasMedicas(new Date(), new Date(), Estado.PROGRAMADA, doctor1, (Paciente) paciente1, gestionCitas1);
        CitasMedicas cita2 = new CitasMedicas(new Date(), new Date(), Estado.CANCELADA, doctor2, (Paciente) paciente2, gestionCitas2);

        ExpedienteMedico expediente1 = new ExpedienteMedico((Paciente) paciente1, true, "Diagnóstico1", "Tratamiento1", "Prescripciones1", doctor1);
        ExpedienteMedico expediente2 = new ExpedienteMedico((Paciente) paciente2, false, "Diagnóstico2", "Tratamiento2", "Prescripciones2", doctor2);

        // Asignar especialidades a los doctores
        doctor1.setEspecialidades(List.of(cardiologia, dermatologia));
        doctor2.setEspecialidades(List.of(pediatria));

        // Asignar pacientes a los doctores
        doctor1.setPacientes(List.of((Paciente) paciente1));
        doctor2.setPacientes(List.of((Paciente) paciente2));

        // Asignar enfermeros a los doctores
        doctor1.setEnfermeros(List.of(enfermero1));
        doctor2.setEnfermeros(List.of(enfermero2));

        // Mostrar información de prueba
        System.out.println("Información de la cita médica 1:");
        System.out.println("Fecha: " + cita1.getFecha());
        System.out.println("Hora: " + cita1.getHora());
        System.out.println("Estado: " + cita1.getEstado());
        System.out.println("Doctor: " + cita1.getDoctor().getNombre() + " " + cita1.getDoctor().getApellido());
        System.out.println("Paciente: " + cita1.getPaciente().getNombre() + " " + cita1.getPaciente().getApellido());
        System.out.println();

        System.out.println("Información del expediente médico 1:");
        System.out.println("Paciente: " + expediente1.getPaciente().getNombre() + " " + expediente1.getPaciente().getApellido());
        System.out.println("Historial médico: " + expediente1.isHistorialMedico());
        System.out.println("Diagnósticos: " + expediente1.getDiagnosticos());
        System.out.println("Tratamientos: " + expediente1.getTratamientos());
        System.out.println("Prescripciones: " + expediente1.getPrescripciones());
    }
}
