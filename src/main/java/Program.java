import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //Creating list to hold person objects
        List<Person> people = new ArrayList<>();

        //Adding people to list
        people.add(new Person("Andres", "Asencios", 27));
        people.add(new Person("Sama", "Durani", 26));
        people.add(new Person("Jofre", "Aguana", 28));
        people.add(new Person("Will", "Concepcion", 26));
        people.add(new Person("Ron", "Bautista", 27));
        people.add(new Person("Fana", "Bsrat", 26));
        people.add(new Person("Michael", "Trevino", 24));
        people.add(new Person("Ashley", "Taylor", 36));
        people.add(new Person("Christopher", "Anderson", 22));
        people.add(new Person("Amanda", "Thomas", 61));

        // Scanner to read input
        Scanner read = new Scanner(System.in);
        // Asking for user input
        System.out.println("Enter a first or last name to search: ");
        String searchName = read.nextLine();

        // New list to store matches
        List<Person> matches = new ArrayList<>();
        for (Person person : people) {

        }
    }
}
