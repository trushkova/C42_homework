package homeWork7;

public class Therapist extends Doctor{
    @Override
    public void heal() {
        System.out.println("Лечение болезни");
    }

    // присваиваем доктора пациенту исходя из плана лечения пациента
    public void setDoctor(Patient patient) {
        // Получаем код
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
                // Обработка всех остальных введенных чисел (от 3 до бесконечности)
                System.out.println("Доктор назначен - Терапевт");
                assignedDoctor = this;
        }
        // Назначаем выбранного доктора
        patient.setDoctor(assignedDoctor);
        //System.out.println("Доктор назначен");
        // Он лечит
        assignedDoctor.heal();

    }
}
