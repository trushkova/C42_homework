package homeWork7;

public class Hospital {
    public static void main(String[] args) {
        HealthPlan plan = new HealthPlan();
        Patient patient = new Patient(plan);
        Therapist therapist = new Therapist();
        therapist.setDoctor(patient);
        System.out.println();
    }
}
