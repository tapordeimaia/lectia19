import java.util.Objects;

public class Person {
    private int age;
    private String name;

    private int idnp;

    public int getIdnp() {
        return idnp;
    }

    public void setIdnp(int idnp) {
        this.idnp = idnp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", idnp=" + idnp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Person person = (Person) o;
        return idnp == person.idnp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idnp);
    }
}
