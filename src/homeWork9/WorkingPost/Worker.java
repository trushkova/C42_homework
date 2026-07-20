package homeWork9.WorkingPost;

public class Worker extends Staff implements Post {
    public Worker(String name, String surname) {
        super(name, surname, "Worker");
    }

    @Override
    public String printPost() {
        return "Имя: " + getName() +
                "\nФамилия: " + getSurname() +
                "\nДолжность: " + getProfession();
    }
}
