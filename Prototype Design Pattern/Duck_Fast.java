import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Duck_Fast here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Duck_Fast extends Duck
{   
    private int speed = 2;
    private int rate = 5;
    
    private GreenfootImage image = new GreenfootImage("Duck_Fast.png");
    
    /**
     * Act - do whatever the Duck_Fast wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        walk(speed);
        
        if (Greenfoot.mouseClicked(this)) {
            int cloneNum = Greenfoot.getRandomNumber(4) + 1;
            for(int i = 0; i < cloneNum; i ++) {
                clone();
            }
        }
        
        if (((MyWorld) getWorld()).tooManyDucks()) {
            removeDucks();
        }
    }
    
    public Duck_Fast() {
        image.scale(image.getWidth()*2, image.getHeight()*2);
        setImage(image);
    }
    
    public Duck_Fast(Duck_Fast duck_fast) {
        setImage(duck_fast.getImage());
    }
    
    public Duck clone() {
        Duck_Fast duck = new Duck_Fast(this);
        
        int xPos = Greenfoot.getRandomNumber(getWorld().getWidth());
        int yPos = Greenfoot.getRandomNumber(getWorld().getHeight());
        
        getWorld().addObject(duck, xPos, yPos);
        ((MyWorld) getWorld()).incrementDucks(1);
        //getWorld().removeObject(this);
        return duck;
    }
    
    public void removeDucks() {
        if (Greenfoot.getRandomNumber(100) < 1) {
            ((MyWorld) getWorld()).incrementDucks(-1);
            getWorld().removeObject(this);
        }
    }
}
