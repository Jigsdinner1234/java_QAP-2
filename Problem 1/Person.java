public class Person {
    private final String lastName;
    private final String firstName;
    private final Address home;

    public Person(String lastName,
                  String firstName,
                  Address home)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.home = home;
    }

    @Override
    public String toString()
    {
        return firstName + " " + lastName +
               ", " + home.toString();
    }
}