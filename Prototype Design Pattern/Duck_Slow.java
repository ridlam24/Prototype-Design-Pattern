import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Duck_Fast here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Duck_Slow extends Duck
{
    private int speed = 5;
    private int rate = 10;
    
    /**
     * Act - do whatever the Duck_Fast wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        walk(speed);
        spawnRandom(rate, new Duck_Slow());
    }
    
    public Duck_Slow() {
        
    }
    
    public Duck_Slow(Duck_Slow duck_slow) {
        
    }
    
    public Duck clone() {
        return new Duck_Slow(this);
    }
}
