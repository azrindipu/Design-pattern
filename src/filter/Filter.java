package filter;

import java.util.List;

public interface Filter {
    List<Person> filter(List<Person> persons);
}
