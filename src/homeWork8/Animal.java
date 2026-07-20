package homeWork8;

public class Animal {
    public static void main(String[] args) {
        Animal rabbit = new Rabbit();
        System.out.print("Кролик говорит: ");
        rabbit.voice();
        rabbit.eat("трава");
        rabbit.eat("мясо");

        Animal dog = Dog.getDog();
        System.out.print("Собака говорит: ");
        dog.voice();
        dog.eat("Мясо");
        System.out.println();
    }
    public void voice() {
        System.out.println("Животное издает звук.");
    }
    public void eat(String food) {
        System.out.println("Животное ест " + food);
    }
}
