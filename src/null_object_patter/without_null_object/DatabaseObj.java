package null_object_patter.without_null_object;

import java.util.ArrayList;
import java.util.List;

public class DatabaseObj {
    private static List<Person> list= new ArrayList<>();
    public static void generateDummyData(){
        for(int i=1; i<=10; i++){
            list.add(new Person(i, String.valueOf(i), i));
        }
    }
    public static List<Person> getList(){
        return list;
    }
}
