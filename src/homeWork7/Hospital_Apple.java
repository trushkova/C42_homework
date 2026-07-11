package homeWork7;

public class Hospital_Apple {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        Clinic();
        System.out.println("Задача *");
        createApple();
    }
    public static void Clinic() {
        HealthPlan plan = new HealthPlan();
        Patient patient = new Patient(plan);
        Therapist therapist = new Therapist();
        therapist.setDoctor(patient);
        System.out.println();
    }
    public static void createApple(){
        Apple apple = new Apple("Красный");
        System.out.println(apple.getColor());
    }
}
