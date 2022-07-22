import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{

    private boolean beeActive = false;
    private Random random = new Random();
    /**
     * Constructor for objects of class Bee.
     * 
     */
    public Bee()
    {    

        prepare();
    }

    private void prepare()
    {

        setImage("bee.png");


    }

    /**
     * Act - do whatever the bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here

        // a negative value will move backwards
        move(-1);

        if (isAtEdge()) {
            appearOnOtherSide();
        }

    }

    private void appearOnOtherSide() {

        if (getX() == 0) {
            int height = Math.abs(random.nextInt() % getWorld().getHeight() / 2 + 500);
            setLocation(2000, height); 

        }

    }

}
