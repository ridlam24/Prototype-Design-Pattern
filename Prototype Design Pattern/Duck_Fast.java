import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Duck_Fast here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Duck_Fast extends Duck
{   
    private int speed = 10;
    private int rate = 5;
    
    /**
     * Act - do whatever the Duck_Fast wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        walk(speed);
        spawnRandom(rate, new Duck_Fast());
    }
    
    public Duck_Fast() {
        
    }
    
    public Duck_Fast(Duck_Fast duck_fast) {
        
    }
    
    public Duck clone() {
        return new Duck_Fast(this);
    }
}
