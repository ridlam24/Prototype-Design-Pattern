import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Duck_Fast here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Duck_Slow extends Duck
{
    private int speed = 1;
    private int rate = 10;
    
    private GreenfootImage image = new GreenfootImage("Duck_Slow.png");
    
    /**
     * Act - do whatever the Duck_Fast wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        walk(speed);
        
        if (((MyWorld) getWorld()).tooManyDucks()) {
            removeDucks();
        }
        
        if (Greenfoot.mouseClicked(this)) {
            int cloneNum = Greenfoot.getRandomNumber(4) + 1;
            for(int i = 0; i < cloneNum; i ++) {
                addDucks(clone());
            }
            getWorld().removeObject(this);
        }
    }
    
    public Duck_Slow() {
        image.scale(image.getWidth()*2, image.getHeight()*2);
        setImage(image);
    }
    
    public Duck_Slow(Duck_Slow duck_slow) {
        setImage(duck_slow.getImage());
    }
    
    public Duck clone() {
        return new Duck_Slow(this);
    }
    
    public void removeDucks() {
        if (Greenfoot.getRandomNumber(100) < 1) {
            ((MyWorld) getWorld()).incrementDucks(-1);
            getWorld().removeObject(this);
        }
    }
}
