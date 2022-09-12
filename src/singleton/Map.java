package singleton;

public class Map {
    private static Map mapObject;

    private void Map(){

    }

    public static synchronized Map getInstance(){
        if(mapObject == null){
            System.out.println("Creating the object");
            mapObject = new Map();
        }
        System.out.println("Returning the object");
        return mapObject;
    }
}
