package null_object_patter.with_null_object;

public class PersonRepo {
    public PersonRepo() {
        DatabaseObj.generateDummyData();
    }

    public PersonBase getPersonById(int id){
        for(PersonBase person : DatabaseObj.getList()){
            if(person.id == id) return person;
        }
        return NullPerson.getInstance();
    }
}
