import java.util.Scanner;

public abstract class Input {

    //W jaki sposób można połączyć klasę do wprowadzania danych z klasą Person?
    public static void inData(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Wprowadź imię: ");
        String name = scanner.nextLine();
        System.out.print("Wprowadź nazwisko: ");
        String lastName = scanner.nextLine();
        System.out.print("Wprowadź wiek: ");
        int age = scanner.nextInt();
        System.out.print("Wprowadź PESEL: ");
        int pesel = scanner.nextInt();
    }

    public static String toString(Person person){

        return "Imię: " + person.getFirstName() + ", nazwisko: " + person.getLastName() + ", wiek: " + person.getLastName() + ", pesel: " + person.getPesel();
    }
}
