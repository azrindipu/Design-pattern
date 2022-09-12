package null_object_patter.without_null_object;

public class PersonService {
    private PersonRepo personRepo = new PersonRepo();
    public Person getPersonById(int id){
        Person person = personRepo.getPersonById(id);
        if(person != null) return person;
        return null;
    }
}
