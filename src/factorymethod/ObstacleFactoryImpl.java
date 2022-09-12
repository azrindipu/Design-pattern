package factorymethod;

public class ObstacleFactoryImpl implements ObstacleFactory {

    public ObstacleFactoryImpl() {

    }
    @Override
    public Obstacle createObstacle(int level, int velocity, int size) {
        return new ObstacleImpl(level, velocity, size);
    }
}
