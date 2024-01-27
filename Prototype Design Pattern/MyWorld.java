import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int duckCount = 0;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 400, 1); 
        setBackground(new GreenfootImage("pond.jpg"));
    }
    
    public void act() {
        if (!tooManyDucks() && Greenfoot.getRandomNumber(100) < 10) {
            spawnDucks();   
        }
        display();
    }
    
    public void spawnDucks() {
        int num = Greenfoot.getRandomNumber(100);
        int xPos = Greenfoot.getRandomNumber(getWidth());
        int yPos = Greenfoot.getRandomNumber(getHeight());
        
        if (num < 5) {
            addObject(new Duck_Fast(), xPos, yPos);
            incrementDucks(1);
        }
        
        else if (num < 10) {
            addObject(new Duck_Slow(), xPos, yPos);
            incrementDucks(1);
        }
    }
    
    public void display() {
        showText("Ducks: " + duckCount, 50, 20);
    }
    
    public void incrementDucks(int num) {
        duckCount+=num;
    }
    
    public boolean tooManyDucks() {
        if (duckCount > 50) {
            return true;
        }
        return false;
    }
}
