package factorymethod;

public class Main {
    public static void main(String[] args){
        ObstacleFactory factory = new ObstacleFactoryImpl();
        Obstacle obstacle01 = factory.createObstacle(1,1,1);
        Obstacle obstacle02 = factory.createObstacle(2,2,2);
        System.out.println("For obstacle 01");
        System.out.println("Level : "+obstacle01.getLevel());
        System.out.println("Velocity : "+obstacle01.getVelocity());
        System.out.println("Size : "+obstacle01.getSize());

        System.out.println("For obstacle 02");
        System.out.println("Level : "+obstacle02.getLevel());
        System.out.println("Velocity : "+obstacle02.getVelocity());
        System.out.println("Size : "+obstacle02.getSize());
    }
}
