package homeWork9.WorkingPost;

public class Accountant extends Staff implements Post {
    public Accountant(String name, String surname) {
        super(name, surname, "Accountant");
    }
    @Override
    public String printPost() {
        return "Имя: " + getName() +
                "\nФамилия: " + getSurname() +
                "\nДолжность: " + getProfession();
    }
}
