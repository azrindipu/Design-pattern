package filter;

import java.util.ArrayList;
import java.util.List;

public class PersonBuilder {
    private static List<Person> persons;

    public PersonBuilder() {
        persons = new ArrayList<>();
    }

    public static void generatePersons(){
        for(int i=1; i<=100; i++){
            if(i%2 == 0 && i%5 == 0){
                persons.add(new Person(String.valueOf(i), false, false));
            }
            else if(i%2 == 0){
                persons.add(new Person(String.valueOf(i), true, false));
            }
            else if(i%5 == 0){
                persons.add(new Person(String.valueOf(i), true, true));
            }else{
                continue;
            }
        }
    }

    public static List<Person> getList(){
        return persons;
    }

    public static void printList(List<Person> persons){
        for(Person person : persons){
            System.out.println("Name: "+person.getName());
            System.out.println("Male: "+person.isMale());
            System.out.println("Married: "+person.isMarried());
        }
    }
}
