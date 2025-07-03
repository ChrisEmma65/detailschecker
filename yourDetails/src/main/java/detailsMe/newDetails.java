package detailsMe;

import java.util.Scanner;

public class newDetails {
     /*
     * Examples of operators:
     * +,-,*,<<,>>
     */

/*
* Personal details app
* Provide your personal details
* */

public static void main(String[] args) {
    // Declare variables
    String firstName = null;
    String lastName = null;
    String location = null;
    int birthYear = 0;

    // Create Scanner to read user input
    Scanner scan = new
            Scanner(System.in);

    // Ask for first name
    System.out.println(" First name: ");
    firstName = scan.nextLine();

    // Ask for last name
    System.out.println("last name: ");
    lastName = scan.nextLine();

    // Ask for location
    System.out.println("What do you live?: ");
    location = scan.nextLine();

    // Ask for year of birth
    System.out.println("What year were you born? (e.g. 1990): ");
    birthYear = scan.nextInt();

    // Calculate age
    int currentYear = 2025;
    int age = currentYear - birthYear;

    // Display final message
    System.out.println(firstName + " " + lastName + ", lives at " + location + ", born in " + birthYear + " is currently " + age + "years old.");


}

}
