package homeWork9.WorkingPost;

public interface Post {
    String printPost();
    default void getSalary(){
        System.out.println("Получил зарплату");
    }
}
