package sem3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Staff implements Iterable<User> {
    private List<User> users = new ArrayList<>();

    public Staff(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

    @Override
    public Iterator<User> iterator() {
        return new Iterator<User>() {
            private int index;
            @Override
            public boolean hasNext() {
                return index < users.size();
            }

            @Override
            public User next() {
                return users.get(index++);
            }
        };
    }
}
