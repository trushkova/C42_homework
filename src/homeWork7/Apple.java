package homeWork7;

public class Apple {
    private String color = "Зелёный";

    public Apple(String color) {
        System.out.println("до изменения: " + this.color);
        this.color = color;
    }


    public String getColor() {
        System.out.print("после изменения: ");
        return color;
    }
}
