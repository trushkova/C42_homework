package homeWork2;

public class Work2 {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        calculate1();
        System.out.println("Задача 2");
        calculate2();
        System.out.println("Задача 3");
        calculate3();
        System.out.println("Задача 4");
        calculate4();
        System.out.println("Задача 5");
        calculate5();
        System.out.println("Задача *");
        calculate6();
    }

    public static void calculate1() {
        int b = 4;
        int c = 5;
        System.out.println("a=" + (4 * (b + c - 1) / 2));
    }
    public static void calculate2() {
        int n = 42;
        int a = n / 10;
        int b = n % 10;
        System.out.println("n=" + n +
                "; a+b=" + (a + b) +
                "; a=" + a +
                "; b=" + b);
    }
    public static void calculate3() {
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
    public static void calculate4() {
        float  n = 100.35F;
        float a = (int)n;
        System.out.println(a);
    }
    public static void calculate5() {
        float a = 6;
        float b = 5;
        float c = a / b;
        System.out.println(c);
    }
    public static void calculate6(){
        int a = 6;
        int b = 11;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a=" + a + "; b=" + b);
    }
}
