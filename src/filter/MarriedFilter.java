package filter;

import java.util.ArrayList;
import java.util.List;

public class MarriedFilter implements Filter {
    @Override
    public List<Person> filter(List<Person> persons) {
        List<Person> filteredList = new ArrayList<>();
        for(Person person : persons){
            if(person.isMarried()){
                filteredList.add(person);
            }
        }
        return filteredList;
    }
}
