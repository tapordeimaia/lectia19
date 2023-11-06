import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(20);
        person.setName("Ion");
        person.setIdnp(123);

        Person person1 = new Person();
        person.setAge(20);
        person.setName("Ion");
        person.setIdnp(123);

        Set<Person> people = new HashSet<>();
        people.add(person);
        people.add(person1);
        System.out.println(people);

        if(person.getIdnp() != person1.getIdnp()){

        }
    }
}