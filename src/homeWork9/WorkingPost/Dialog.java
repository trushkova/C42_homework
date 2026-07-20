package homeWork9.WorkingPost;

public class Dialog {
    public static void getInfo(Post p) {
        System.out.println(p.printPost());
        System.out.println("День зарплаты");
        p.getSalary();
    }
    public static void getDialog(){
        Director director = new Director("Евгений","Евгеневич");
        Accountant accountant = new Accountant("Масян","Петросян");
        Worker worker = new Worker("Аркадий","Туподувов");
        getInfo(director);
        getInfo(accountant);
        getInfo(worker);
    }
}
