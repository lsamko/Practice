package streams.intro;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Task task = new Task();

        List<User> users = Arrays.asList(
            new User(1, "Toni", "Stark", 35, "red"),
            new User(2, "Bruce", "Wayne", 25, "black"),
            new User(3, "Gal", "Gadot", 23, "red")
        );

        String color = "red";
        List<User> favoriteColor = task.findByFavoriteColor(color, users);
        System.out.println("Found user by favorite color " + color + ": " + favoriteColor);

        int userAge = 25;
        List<User> age = task.findByAge(userAge, users);
        System.out.println("Found user by age " + userAge + ": " + age);

        int userAgeLessThan = 30;
        List<User> ageLessThan = task.findByAgeLessThan(userAgeLessThan, users);
        System.out.println("Found user by age less than " + userAgeLessThan + ": " + ageLessThan);

        int userAgeMoreThan = 28;
        List<User> ageMoreThan = task.findByAgeMoreThan(userAgeMoreThan, users);
        System.out.println("Found user by age more than " + userAgeMoreThan + ": " + ageMoreThan);

       UserComparator ageComparator = new UserComparator();
        List<User> sortByAge = task.sortUsersBy(ageComparator, users);
        System.out.println("Users are sorted by age: " + sortByAge);


        Comparator<User> userNameComparator
            = Comparator.comparing(User::getName);
        List<User> sortByName = task.sortUsersBy(userNameComparator, users);

        System.out.println("Users are sorted by name: " + sortByName);

        Comparator<User> userId = Comparator.comparingInt(User::getId).reversed();
        List<User>sortById = task.sortUsersBy(userId, users);
        System.out.println("Users are sorted reverse by id: " +sortById);


    }

}
