package homeWork7;

public class Hospital {
    public static void main(String[] args) {
        //Создаем пациента с планом, и терапевта
        HealthPlan plan = new HealthPlan();
        Patient patient = new Patient(plan);

        Therapist therapist = new Therapist();
        // Назначаем доктора пациенту
        therapist.setDoctor(patient);
        System.out.println();
    }
}
