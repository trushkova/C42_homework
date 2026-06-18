package homeWork4;

import java.util.Arrays;

public class Work4{
    public static void main(String[] args) {
        System.out.println("Задача 1");
        showElements();
        System.out.println("Задача 2");
        getMinMaxElements();
        System.out.println("Задача 3");
        getIndexMinMax();
        System.out.println("Задача 4");
        getZeroElements();
        System.out.println("Задача 5");
        getRevers();
        System.out.println("Задача 6");
        determineIncreasingSequence();
        System.out.println("Задача *");
        getLength();
    }
    public static void showElements(){
        int[] table = new int[3];
        table[0] = 1;
        table[1] = 2;
        table[2] = 3;
        System.out.println("В прямом порядке: " + Arrays.toString(table));
        for (int a = 0; a < table.length / 2; a++) {
            int temp = table[a];
            table[a] = table[table.length - 1 - a];
            table[table.length - 1 - a] = temp;
        }
        System.out.println("В обратном порядке: " + Arrays.toString(table));
    }

    public static void getMinMaxElements(){
        double[] numbers = { 5.5, 12.3, 3.14, 99.9, 45.1 };

        double max = numbers[0];
        double min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            max = Math.max(max, numbers[i]);
        }
        for (int i = 1; i > numbers.length; i--) {
            max = Math.min(min, numbers[i]);
        }
        System.out.println("Макс. значение: " + max);
        System.out.println("Мин. значение: " + min);
    }

    public static void getIndexMinMax(){
        int[] table = new int[5];
        table[0] = 3;
        table[1] = 6;
        table[2] = 8;
        table[3] = 3;
        table[4] = 1;
        int minIndex = 0;
        int maxIndex = 0;
        for (int a = 1; a < table.length; a++) {
            if (table[a] < table[minIndex]) {
                minIndex = a; // Нашли новый минимум
            } else if (table[a] > table[maxIndex]) {
                maxIndex = a; // Нашли новый максимум
            }
        }
        System.out.println("Индекс мин. элемента: " + minIndex);
        System.out.println("Индекс макс. элемента: " + maxIndex);
    }

    public static void getZeroElements(){
        int[] table = new int[3];
        table[0] = 2;
        table[1] = 1;
        table[2] = 3;
        int count = 0;
        for (int num : table) {
            if (num == 0) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Количество нулевых элементов: " + count);
        } else {
            System.out.println("Нулевых элементов нет.");
        }
    }

    public static void getRevers(){
        int[] table = new int[5];
        table[0] = 1;
        table[1] = 10;
        table[2] = 0;
        table[3] = 11;
        table[4] = 2;
        for (int num = 0; num < table.length / 2; num++){
            int temp = table[num];
            table[num] = table[table.length - 1 - num];
            table[table.length - 1 - num] = temp;
        }
        System.out.println(Arrays.toString(table));
    }

    public static void determineIncreasingSequence(){
        int [] table = new int[10];
        for (int i = 0; i < table.length; i++) {
            table[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(table));
        boolean flag = true;
        for (int a = 1; a < table.length; a++) {
            if(table[a]<=table[a-1]){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
   }
}
    public static int[] getLength(int[] digits){

            int n = digits.length;

            // Идем с конца массива
            for (int i = n - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                }
                digits[i] = 0;
            }
            int[] result = new int[n + 1];
            result[0] = 1;
            return result;
    }
    public static void getLength() {
        int[] table = new int[3];
        table[0] = 2;
        table[1] = 1;
        table[2] = 3;
        System.out.println(Arrays.toString(getLength(table)));
    }
}
