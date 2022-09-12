package null_object_patter.with_null_object;

public class PrintPerson {
    public void print(PersonBase person){
        System.out.println("Id: "+person.id);
        System.out.println("Name: "+person.name);
        System.out.println("Age: "+person.age);
    }
}
