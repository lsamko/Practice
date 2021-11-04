package streams.intro;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Task {

    List<User> findByFavoriteColor(String color, List<User> users) {
        return users.stream()
            .filter(c -> Objects.equals(c.getFavoriteColor(), color))
            .collect(Collectors.toList());
    }

    List<User> findByAge(int age, List<User> users) {
        return users.stream()
            .filter(p -> p.getAge() == age)
            .collect(Collectors.toList());
    }

    List<User> findByAgeLessThan(int age, List<User> users) {
        return users.stream()
            .filter(p -> p.getAge() < age)
            .collect(Collectors.toList());
    }

    List<User> findByAgeMoreThan(int age, List<User> users) {
        return users.stream()
            .filter(p -> p.getAge() > age)
            .collect(Collectors.toList());
    }

    List<User> sortUsersBy(Comparator<User> userComparator, List<User> users) {
        return users.stream()
            .sorted(userComparator)
            .collect(Collectors.toList());
    }
}
