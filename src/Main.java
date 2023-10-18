import processing.core.PApplet;

import java.util.ArrayList;

public class Main extends PApplet {
    Person a;
    public ArrayList<Obstacle> obstacles = new ArrayList<>();
    int line;
    int yLineLocation;
    int timer;


    public void settings(){
        size(600,600);
    }

    public void setup(){
        a = new Person();
        timer = 60;

    }



    public void draw(){
        background(255);
        timer--;
        // ****** draw background *********//
        fill(200, 0, 0);
        rect(0, 100, 600, 50);
        fill(250, 250, 250);
        rect(0, 275, 600, 50);
        fill(0, 0, 200);
        rect(0, 450, 600, 50);

        fill(0);
        if(timer == 0) {
            line = (int) (Math.random() * 3);
            if (line == 0) {
                yLineLocation = 420;
            } else if (line == 1) {
                yLineLocation = 245;
            } else if (line == 2) {
                yLineLocation = 70;
            }
            Obstacle thing = new Obstacle(400, yLineLocation, 1, 65, 65);
            obstacles.add(thing);


            timer = 60;
        }
        for (Obstacle o : obstacles) {
            o.draw(this);
            o.movement();
        }
        if(a.isHitting(obstacles)==false){
            fill(0);
            rect(0, 0, 600, 600);
        }



        a.draw(this);
        //rect(a.getXLocation(), a.getYLocation(), a.getXSize(), a.getYSize());

    }

public void keyReleased(){

        if (key == 'w') {
            a.moveUp();

        }
        if (key == 's') {
            a.moveDown();
        }


}

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}
