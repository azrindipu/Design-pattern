package null_object_patter.with_null_object;

import java.util.ArrayList;
import java.util.List;

public class DatabaseObj {
    private static List<PersonBase> list= new ArrayList<>();
    public static void generateDummyData(){
        for(int i=1; i<=10; i++){
            list.add(new PersonReal(i, String.valueOf(i), i));
        }
    }
    public static List<PersonBase> getList(){
        return list;
    }
}
