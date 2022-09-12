package filter;

import java.util.ArrayList;
import java.util.List;

public class MaleFilter implements Filter {
    @Override
    public List<Person> filter(List<Person> persons) {
        List<Person> filteredList = new ArrayList<>();
        for(Person person : persons){
            if(person.isMale()){
                filteredList.add(person);
            }
        }
        return filteredList;
    }
}
