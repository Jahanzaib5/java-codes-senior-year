public class Container {
    private int   x1;
    private int   y1;
    private int   x2;
    private int   y2;


    public Container(int x, int y, int width, int height) {
        this.x1=x;
        this.y1 = y;
        this.x2 = x1 + width  - 1;
        this.y2 = y1 - height + 1;
    }


    public void setX(int x) {
        x1 = x;
    }
    public int getX() {
        return x1;
    }


    public void setY(int y) {
        y1 = y;
    }
    public int getY() {
        return y1;
    }


    public void setWidth(int width) {
        x2 = x1 + width - 1;
    }
    public int getWidth() {
        return (x2 - x1 + 1);
    }


    public void setHeight(int height) {
        y2 = y1 + height - 1;
    }
    public int getHeight() {
        return (y2 - y1 + 1);
    }

    public boolean collides(Ball ball)
    {
        if (ball.getX() - ball.getRadius() <= this.x1 ||
                ball.getX() - ball.getRadius() >= this.x2)
        {
            ball.reflectHorizontal();
            return true;
        }

        if (ball.getY() + ball.getRadius() <= this.y1 ||
                ball.getY() + ball.getRadius() >= this.y2)
        {
            ball.reflectVertical();
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Container at " +
                "(" + x1 +
                "," + y1 +
                ") to (" + x2 +
                "," + y2 +
                ')';
    }
}
