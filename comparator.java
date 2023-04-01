import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Ivan", 32));
        persons.add(new Person("Anton", 40));
        persons.add(new Person("Roman", 35));

        // сортировка по имени (name)
        Comparator<Person> nameComparator = Comparator.comparing(Person::getName);
        Collections.sort(persons, nameComparator);
        System.out.println(persons); // вывод на консоль -> [Anton, 40, Ivan, 32, Roman, 35]

        // сортировка по возрасту (age)
        Comparator<Person> ageComparator = Comparator.comparing(Person::getAge);
        Collections.sort(persons, ageComparator);
        System.out.println(persons); // вывод на консоль -> [Ivan, 32, Roman, 35, Anton, 40]
    }
}
class Person {
    private final String name;
    private final int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String toString(){
        return String.format("%s, %d", getName(), getAge());
    }
}
