import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Wprowadź imię: ");
        String name = scanner.nextLine();
        System.out.print("Wprowadź nazwisko: ");
        String lastName = scanner.nextLine();
        System.out.print("Wprowadź wiek: ");
        int age = scanner.nextInt();
        System.out.print("Wprowadź PESEL: ");
        int pesel = scanner.nextInt();

        Person person = new Person(name, lastName, age, pesel);

        person.badName();
        person.badLastName();
        person.tooYoung();
        person.toString();

    }
}

