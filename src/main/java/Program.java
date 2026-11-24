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
            boolean firstNameMatches = person.getFirstName().equalsIgnoreCase(searchName);
            boolean lastNameMatches = person.getLastName().equalsIgnoreCase(searchName);
            if (firstNameMatches || lastNameMatches) { // If first OR last name matches
                matches.add(person);
            }
        }
        System.out.println("\nSearch Results: ");
        if (matches.size() > 0) { // Checks if any matches were found
            for (Person person : matches) {
                System.out.println(person);
            }
        } else {
            System.out.println("No matches found.");
        }
        int totalAge = 0; //Variable to store total age
        int oldestAge = people.get(0).getAge();

        int youngestAge = people.get(0).getAge();
        for (Person person : people) {
            totalAge += person.getAge(); // Adds current person's age to total
            if (person.getAge() > oldestAge); // If this person is older than current person
            {
                oldestAge = person.getAge();
            }
            if (person.getAge() < youngestAge) { // If this person is younger than current youngest
                youngestAge = person.getAge();
            }
        }
        // Calculating average age
        double averageAge = (double) totalAge / people.size();
        // Showing Stats
        System.out.println("\nStatistics");
        System.out.printf("Average Age: %.2f\n", averageAge);
        System.out.println("Oldest Age: " + oldestAge);
        System.out.println("Youngest Age: " + youngestAge);

        read.close();
    }
}