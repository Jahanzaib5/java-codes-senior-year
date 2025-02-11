package Point;

public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public MovablePoint(){};

    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float[] getSpeed(){
        return new float[]{getXSpeed(), getYSpeed()};
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format("speed=(%f,%f", getXSpeed(), getYSpeed());
    }

    public MovablePoint move(){
        return new MovablePoint(getX()+getXSpeed(), getY()+getYSpeed(), getXSpeed(), getYSpeed());
    }
}
