import java.util.Locale;
import java.util.Scanner;

public class PersonCheck {
    private static Scanner scanner;
    private Person person;

    public PersonCheck(Person person) {
        emptyPerson(person);
        this.person = person;
    }

    public static Person createPerson(){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Podaj imię");
        String firstName = scanner.nextLine();
        if(firstName == null){
            throw new NameUndefinedException();
        }
        System.out.println("Podaj nazwisko");
        String lastName = scanner.nextLine();
        if(lastName == null){
            throw new NameUndefinedException();
        }
        System.out.println("Podaj numer pesel");
        int pesel = scanner.nextInt();
        System.out.println("Podaj wiek");
        int age = scanner.nextInt();
        if(age < 1){
            throw new IncorrectAgeException();
        }

        Person person = new Person(firstName, lastName, pesel,age);
        return person;
    }

    public void emptyPerson(Person person){
        if(person.getFirstName() == null || person.getLastName() == null){
            throw new NameUndefinedException();
        }
        else if(person.getFirstName().length() < 2 || person.getLastName().length()< 2){
            throw new NameUndefinedException();
        }
    }
}
