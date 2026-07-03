package homeWork7;

import java.util.Scanner;

public class HealthPlan {
    private int healthCode;

    public HealthPlan() {
        Scanner input = new Scanner(System.in);
        System.out.print("Пожалуйста, введите число: \n");
        System.out.print("1 - Хирург \n"
                + "2 - Дантист \n"
                + "3 - Терапевт \n");
        this.healthCode = input.nextInt();
       // this.healthCode = healthCod;
    }

    public int getCode() {
        return healthCode;
    }

    public void setCode(int healthCode) {
        this.healthCode = healthCode;
    }
}
