import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {  
    World world = new World();
    World world1 = new World(true);
    World world2 = new World(800, 800);
    World world3 = new World(500,500);
   
     
    Turtle yertle = new Turtle(world);

    yertle.setBodyColor(Color.red);
    yertle.setPenColor(Color.black);
    yertle.setPenWidth(10);
    yertle.polygon(8,35);
    yertle.setName("Roger");
    // Add your code here

  
    // //world.setVisible(true);

    // World world2 = new World(true);
   
     
    Turtle yertle2 = new Turtle(50, 150, world1);
    // // Add your code here
    yertle2.setName("Greg");
    yertle2.setBodyColor(Color.green);
    yertle2.setPenColor(Color.blue);
    yertle2.setPenWidth(5);
    yertle2.setWidth(100);
    yertle2.setHeight(100);
    yertle2.star(50,5);
    
  
    //world.setVisible(true);
    Turtle yertle3 = new Turtle(10, 200, world2);
    yertle3.setName("Sarah");
    yertle3.setHeight(25);
    yertle3.setPenColor(Color.orange);
    yertle3.setColor(Color.cyan);
    yertle3.square(50);

    Turtle yertle4 = new Turtle(300, 200, world3);
    yertle4.setPenColor(Color.green);
    yertle4.setColor(Color.pink);
    yertle4.setWidth(24);
    yertle4.setHeight(24);
    yertle4.setName("Tux");
    yertle4.circle(15);

    System.out.println("Yertle: " + "name: " + yertle.getName() + " distance from 0,0: " + yertle.getDistance(0, 0) + " shape drawn: octagon" + " pen color: " + yertle.getPenColor());
    System.out.println("Yertle2: " + "name: " + yertle2.getName() + " distance from 0,0: " + yertle2.getDistance(0, 0) + " shape drawn: star" + " pen color: " + yertle2.getPenColor());
    System.out.println("Yertle3: " + "name: " + yertle3.getName() + " distance from 0,0: " + yertle3.getDistance(0, 0) + " shape drawn: square" + " pen color: " + yertle3.getPenColor());
    System.out.println("Yertle4: " + "name: " + yertle4.getName() + " distance from 0,0: " + yertle4.getDistance(0, 0) + " shape drawn: circle" + " pen color: " + yertle4.getPenColor());
  }
}
