import processing.core.PApplet;

import java.util.ArrayList;

public class Obstacle {
    private int x, y;
    private int xSpeed;
    private int xSize;
    private int ySize;

    public Obstacle(int initX, int initY, int xspeed, int xsize, int ysize){
        this.x = initX;
        this.y = initY;
        this.xSpeed = xspeed;
        this.xSize = xsize;
        this.ySize = ysize;
    }

    public void draw(PApplet window) {
        window.fill(0,0,0);
        window.ellipse(x,y, xSize, ySize);
    }

    public void movement (){
        x = x - xSpeed;
    }

    public int getter(){
        return x;
    }

}
