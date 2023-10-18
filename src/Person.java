import processing.core.PApplet;

public class Person {
    private int xSpeed;
    private int xSize;
    private int ySize;
    public int xLocation;
    public int yLocation;

    public Person(){
         xSpeed = 1;
         xSize = 50;
         ySize = 100;
         xLocation=20;
         yLocation =225;
    }
    public int getYLocation(){
        return yLocation;
    }

    public int getXLocation(){
        return xLocation;
    }
    public int getXSize(){
        return xSize;
    }
    public int getYSize(){
        return ySize;
    }

    public void draw(PApplet window) {
        window.fill(255,0,0);
        window.ellipse(xLocation, yLocation, xSize, ySize);
    }
    public int moveForward(int xLocation){
        xLocation+=1;
        return xLocation;
    }

    public int moveDown(){
        if(yLocation+175<=500) {
            yLocation += 175;
        }
            return yLocation;

    }
    public int moveUp(){
        if(yLocation-75>=0) {
            yLocation -= 175;
        }
            return yLocation;

    }
    public boolean isHitting(Obstacle thingy){
       if(Math.abs(xLocation-thingy.getter())<53 ){
           return false;

        }
           return true;
    }


}
