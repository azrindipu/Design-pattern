package filter;

import java.util.ArrayList;
import java.util.List;

public class MarriedAndMale implements Filter {
    private Filter married;
    private Filter male;

    public MarriedAndMale(Filter married, Filter male) {
        this.married = married;
        this.male = male;
    }

    @Override
    public List<Person> filter(List<Person> persons) {
        List<Person> filteredList = new ArrayList<>();
        List<Person> temp = new ArrayList<>();
        temp.addAll(male.filter(persons));
        filteredList.addAll(married.filter(temp));
        return filteredList;
    }
}
