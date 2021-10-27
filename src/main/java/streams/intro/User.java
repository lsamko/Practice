package streams.intro;

public class User {

    private final int id;
    private final String name;
    private final String surname;
    private final int age;
    private final String favoriteColor;

    public User(int id, String name, String surname, int age, String favoriteColor) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.favoriteColor = favoriteColor;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", age=" + age +
            ", favoriteColor='" + favoriteColor + '\'' +
            '}';
    }
}
