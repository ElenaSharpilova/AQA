package hw1;

public class Point implements Movable {
    private int x;
    private int y;

    public void setX(int x){
        this.x=x;
    }
    public void getX(int x){
        this.x=x;
    }

    public void setY(int y){
        this.y=y;
    }
    public void getY(int y){
        this.y=y;
    }

    @Override
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }
    public void displayPosition() {
        System.out.println("Point is at (" + x + ", " + y + ")");
    }
}
