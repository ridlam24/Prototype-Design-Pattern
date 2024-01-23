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
        // Add your action code here.
    }
    
    public abstract Duck clone();
    
    public void walk(int speed) {
        move(speed);
    }
    
    public void spawnRandom(int rate, Duck duck) {
        if (Greenfoot.getRandomNumber(20) < rate) {
            getWorld().addObject(duck, Greenfoot.getRandomNumber(getWorld().getWidth()), Greenfoot.getRandomNumber(getWorld().getHeight()));
        }
    }
}
