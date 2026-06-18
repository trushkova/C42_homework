package homeWork2;

public class Work2 {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        calculateFormula();
        System.out.println("Задача 2");
        calculateSumN();
        System.out.println("Задача 3");
        calculateThreeNumbers();
        System.out.println("Задача 4");
        calculateInteger();
        System.out.println("Задача 5");
        divisionRemainder();
        System.out.println("Задача *");
        switc();
    }

    public static void calculateFormula() {
        int b = 4;
        int c = 5;
        System.out.println("a=" + (4 * (b + c - 1) / 2));
    }
    public static void calculateSumN() {
        int n = 42;
        int a = n / 10;
        int b = n % 10;
        System.out.println("n=" + n +
                "; a+b=" + (a + b) +
                "; a=" + a +
                "; b=" + b);
    }
    public static void calculateThreeNumbers() {
        int n = 123;
        int a = n / 100;
        int b = n / 10 % 10;
        int c = n % 10;
        System.out.println("n=" + n +
                "; a+b+c=" + (a + b + c) +
                "; a=" + a +
                "; b=" + b +
                "; c=" + c) ;
    }
    public static void calculateInteger() {
        float  n = 100.35F;
        float a = (int)n;
        System.out.println(a);
    }
    public static void divisionRemainder() {
        float a = 6;
        float b = 5;
        float c = a / b;
        System.out.println(c);
    }
    public static void switc(){
        int a = 6;
        int b = 11;
        int temp = a;
        a = b;
        b = a;
        System.out.println("a=" + a + "; b=" + b);
    }
}
