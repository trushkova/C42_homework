package homeWork8;

public final class Tiger extends Animal{
    @Override
    public void voice() {
          System.out.println("Рык");
    }

    @Override
    public void eat(String food) {
        if ("мясо".equalsIgnoreCase(food)) {
            System.out.println("Тигр ест мясо");
        } else {
            System.out.println("Тигр не ест " + food + "!»");
        }
    }
}
