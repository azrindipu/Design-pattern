package null_object_patter.without_null_object;

public class PersonRepo {
    public PersonRepo() {
        DatabaseObj.generateDummyData();
    }

    public Person getPersonById(int id){
        for(Person person : DatabaseObj.getList()){
            if(person.getId() == id) return person;
        }
        return null;
    }
}
