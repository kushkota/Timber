import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cloud3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cloud3 extends Cloud
{
    int x;
    int y;

    /**
     * Act - do whatever the Cloud3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(6);

        x = getX();
        y = getY();
        if (isAtEdge()) {
            if (getX() == getWorld().getWidth() -1 ) {
                setLocation(0, 300);
            }
        }
    }
}
