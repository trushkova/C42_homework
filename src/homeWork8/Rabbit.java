package homeWork8;

public final class Rabbit extends Animal{
    @Override
    public void voice() {
        System.out.println("не издаёт звуков");
    }

    @Override
    public void eat(String food) {
        if ("трава".equalsIgnoreCase(food)) {
            System.out.println("Кролик ест капусту");
        } else {
            System.out.println("Кролик не ест " + food);
        }
    }
}
