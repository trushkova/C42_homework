package homeWork9.WorkingPost;

public class Director extends Staff implements Post {
    public Director(String name, String surname) {
        super(name, surname, "Director");
    }
    @Override
    public String printPost() {
        return "Имя: " + getName() +
                "\nФамилия: " + getSurname() +
                "\nДолжность: " + getProfession();
    }
}
