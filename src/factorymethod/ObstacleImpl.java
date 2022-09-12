package factorymethod;

public class ObstacleImpl implements Obstacle {

    private int level;
    private int velocity;
    private int size;

    public ObstacleImpl(int level, int velocity, int size) {
        this.level = level;
        this.velocity = velocity;
        this.size = size;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getVelocity() {
        return this.velocity;
    }

    @Override
    public int getSize() {
        return this.size;
    }
}
