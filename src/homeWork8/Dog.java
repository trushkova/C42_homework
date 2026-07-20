package homeWork8;

public final class Dog extends Animal{
    private Dog() {}
    @Override
    public void voice() {
        System.out.println("Гав");
    }

    @Override
    public void eat(String food) {
        if ("мясо".equalsIgnoreCase(food)) {
            System.out.println("Собака ест мясо");
        } else {
            System.out.println("Собака не ест " + food);
        }
    }
      public static Dog getDog() {
        return new Dog();
    }
}
