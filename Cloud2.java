import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cloud2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cloud2 extends Cloud
{

    /**
     * Act - do whatever the Cloud2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(3);

        if (isAtEdge()) {
            if (getX() == getWorld().getWidth() -1 ) {
                setLocation(0, 150);
            }
        }
    }
}
