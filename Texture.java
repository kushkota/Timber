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
    }
    
    

    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Tree tree = new Tree();
        addObject(tree,957,453);

        Bee bee = new Bee();
        addObject(bee,0, 800);
        
        
        Cloud cloud1 = new Cloud();
        Cloud cloud2 = new Cloud();
        Cloud cloud3 = new Cloud();
        addObject(cloud1, 0, 0);
        addObject(cloud2, 0, 250);
        addObject(cloud3, 0, 500);
        
    }
}
