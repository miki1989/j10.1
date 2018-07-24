public class Test {
    public static void main(String[] args) {

        //Person pers1 = PersonCheck.createPerson();
        //System.out.println(pers1.getAge());
        try {
            Person pers2 = PersonCheck.createPerson();
        }
        catch (NameUndefinedException ex) {
            System.out.println("Podaj imię i nazwisko");
        }

        catch (IncorrectAgeException ex){
            if(PersonCheck.createPerson().getAge() < 1){
                System.out.println("Błąd");
            }
        }
    }
}
