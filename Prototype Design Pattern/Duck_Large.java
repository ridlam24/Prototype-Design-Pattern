import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Duck_Fast here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Duck_Large extends Duck
{
    private int grow = 2;
    private int rate = 2;
    private GreenfootImage image = getImage();
    
    /**
     * Act - do whatever the Duck_Fast wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        grow();
        spawnRandom(rate, new Duck_Large());
    }
    
    public Duck_Large() {
        
    }
    
    public Duck_Large(Duck_Large duck_large) {
        
    }
    
    public Duck clone() {
        return new Duck_Large(this);
    }
    
    private void grow() {
        image.scale(image.getWidth()*grow, image.getHeight()*grow);
    }
}
