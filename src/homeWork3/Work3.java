package homeWork3;

import java.util.Scanner;

public class Work3 {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        doWork1();
        System.out.println("Задача 2");
        doWork2();
        System.out.println("Задача 3");
        doWork3();
        System.out.println("Задача 4");
        doWork4();
        System.out.println("Задача *");
        doWork5();
    }
    public static void doWork1(){
        Scanner input = new Scanner(System.in);
        System.out.print("Пожалуйста, введите число: ");
        int number = input.nextInt();
        if (number % 2 == 0){
            System.out.println(number + " чётное");
        } else if (number % 2 == 1){
            System.out.println(number + " не чётное");
        } else {
            System.out.println("Введено неверное значение");
        }
    }
    public static void doWork2(){
        Scanner input = new Scanner(System.in);
        System.out.print("Какая температура?: ");
        int temp = input.nextInt();
        if (temp > -5) {
            System.out.println("Warm");
        } else if (temp >= -20) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }
    }
    public static void doWork3(){
        int count = 10;
        while (count <= 20){
            System.out.println(count * count);
            count++;
        }
    }
    public static void doWork4(){
        int count = 0;
        while(count <= 91){
            System.out.println(count = count + 7);
        }
    }
    public static void doWork5(){
        Scanner input = new Scanner(System.in);
        System.out.print("Пожалуйста, введите число: ");
        int number = 0;
        int b = 0;
        if (input.hasNextInt()) {
            number = input.nextInt();
            if (number <= 0) {
                System.out.println("Ошибка: число должно быть больше нуля.");
                return;
            }
        } else {
            System.out.println("Ошибка: требуется целое число.");
            return;
        }
        for(int a = 1; a <= number; a++){
            b += a;
            System.out.println(b);
        }
    }
}
