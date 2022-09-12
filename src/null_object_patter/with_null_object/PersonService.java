package null_object_patter.with_null_object;

public class PersonService {
    private PersonRepo personRepo = new PersonRepo();
    public PersonBase getPersonById(int id){
        return personRepo.getPersonById(id);
    }
}
