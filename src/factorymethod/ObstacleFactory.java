package factorymethod;

public interface ObstacleFactory {
    Obstacle createObstacle(int level, int velocity, int size);
}
