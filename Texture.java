import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Texture extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Texture()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1920, 1080, 1); 
        prepare();

        //classes listed first in the parameter list will appear on top 
        //of all objects of classes listed later
        setPaintOrder(Bee.class,Tree.class,Cloud.class);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        addObject(new Tree(),957,453);
        addObject(new Bee(),0, 800);

        prepareForCloud();
        
    }

    private void prepareForCloud() {
        addObject(new Cloud1(),0,0);
        addObject(new Cloud2(), 0, 150);
        addObject(new Cloud3(), 0, 300);
    }
}
