public class MovablePoint implements Movable {
    private int x;
    private int y;

    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        System.out.println("Moving up by "+ySpeed);
        y += ySpeed;
    }

    @Override
    public void moveDown() {
        System.out.println("Moving down by "+ySpeed);
        y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        System.out.println("Moving left by "+xSpeed);
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        System.out.println("Moving right by "+xSpeed);
        x += xSpeed;
    }
}