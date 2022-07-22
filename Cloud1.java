import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cloud1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cloud1 extends Cloud
{
    int x;
    int y;
    
    /**
     * Act - do whatever the Cloud1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(1);
        x = getX();
        y = getY();
        if (isAtEdge()) {
            if (getX() == getWorld().getWidth() -1 ) {
                setLocation(0,0);
            }
        }
    }

}
