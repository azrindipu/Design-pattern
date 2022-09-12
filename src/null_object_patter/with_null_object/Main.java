package null_object_patter.with_null_object;

public class Main {
    public static void main(String[] args){
        PrintPerson printPerson = new PrintPerson();
        PersonRepo personRepo = new PersonRepo();
        printPerson.print(personRepo.getPersonById(1));
        printPerson.print(personRepo.getPersonById(10));
        printPerson.print(personRepo.getPersonById(20));
    }
}
