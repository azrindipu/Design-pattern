package builder;

public class Main {
    public static void main(String[] args){
        Person person = new PersonBuilder()
                .setId(1)
                .setName("Azrin")
                .setFatherName("Mannan")
                .setMotherName("Mahmuda")
                .build();
        System.out.println(person.toString());
    }
}
