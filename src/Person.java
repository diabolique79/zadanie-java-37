import java.util.Scanner;

public class Person {

    String firstName;
    String lastName;
    int age;
    int pesel;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public Person(String firstName, String lastName, int age, int pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    public String toString() {

        return "Imię: " + firstName + ", nazwisko: " + lastName + ", wiek: " + age + ", pesel: " + pesel;

    }

    public String badName() {

        if (firstName == null || firstName.length()<= 2){

            throw new NameUndefinedException("Błąd wyświetlania imienia.");
        }

        else return firstName;
    }

    public String badLastName() {

        if (lastName == null || lastName.length() <= 2){

            throw new NameUndefinedException("Błąd wyświetlania nazwiska.");

        }
        else return lastName;
    }

    public int tooYoung() {

        if (age < 1){

            throw new IncorrectAgeException("Błędnie podany wiek");
        }
        else return age;
    }
}
