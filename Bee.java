import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{

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
        move(1);
        
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
        
    }
}
