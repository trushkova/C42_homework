package homeWork9.WorkingPost;

public class Staff {
    private final String name;
    private final String surname;
    private final String profession;

    public Staff(String name, String surname, String profession){
        this.name = name;
        this.surname = surname;
        this.profession = profession;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getProfession() {
        return profession;
    }
}
