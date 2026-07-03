package homeWork7;

public class Therapist extends Doctor{
    @Override
    public void heal() {
        System.out.println("Лечение болезни");
    }
    public void setDoctor(Patient patient) {
        int code =patient.getHealthPlan().getCode();
        Doctor assignedDoctor;
        switch (code) {
            case 1:
                System.out.println("Доктор назначен - Хирург");
                assignedDoctor = new Surgeon();
                break;
            case 2:
                System.out.println("Доктор назначен - Дантист");
                assignedDoctor = new Dentist();
                break;
            default:
                System.out.println("Доктор назначен - Терапевт");
                assignedDoctor = this;
        }
        patient.setDoctor(assignedDoctor);
        assignedDoctor.heal();
    }
}
