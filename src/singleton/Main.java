package singleton;

public class Main {
    public static void main(String[] args){
        Map mapObject;
        for(int i=0; i<100; i++){
            mapObject=Map.getInstance();
        }
    }
}
