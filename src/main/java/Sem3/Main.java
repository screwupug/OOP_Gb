package Sem3;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Staff staff = new Staff
                (
                        List.of
                                (
                                        new User("Kirill", "Grigorev", 27),
                                        new User("Vasya", "Petrov", 34),
                                        new User("Alex", "Sapronov", 28),
                                        new User("Daniil", "Ivanov", 48)
                                )
                );
        for (User item : staff) {
            System.out.println(item);
        }
        List<User> list = staff.getUsers();
        Collections.sort(list);
    }
}
