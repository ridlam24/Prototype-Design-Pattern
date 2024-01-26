import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Duck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Duck extends Actor implements Prototype
{
    /**
     * Act - do whatever the Duck wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here
    }
    
    public abstract Duck clone();
    public abstract void removeDucks();
    
    public void walk(int speed) {
        move(speed);
        if (Greenfoot.getRandomNumber(100) < 5) {
            turn(Greenfoot.getRandomNumber(180)-90);
        }
        
        if (isAtEdge()) {
            turn(180);
            move(2);
        }
    }
}
