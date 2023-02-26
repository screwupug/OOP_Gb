package sem3;

public class User implements Comparable<User> {
   private String firstName;
   private String lastName;
   private int age;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
       return "My name is " + firstName + ". My lastname is " + lastName + ". My age is " + age + ".";
    }

    @Override
    public int compareTo(User o) {
        return o.age - this.age;
    }
}
