package null_object_patter.without_null_object;

public class PrintPerson {
    public void print(Person person){
        if(person != null){
            System.out.println("Id: "+person.getId());
            System.out.println("Name: "+person.getName());
            System.out.println("Age: "+person.getAge());
        }
    }
}
