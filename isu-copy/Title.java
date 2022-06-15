import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends World
{
    //Game start and exit buttons
    private Button startButton = new Button(new GreenfootImage("Play-button.png"));
    private Button exitButton = new Button(new GreenfootImage("ExitButton.png"));
    
    // Background music and sound effects
    public static GreenfootSound bgm = new GreenfootSound("Music.mp3");
    public static GreenfootSound cursor = new GreenfootSound("Cursor.mp3");
    public static GreenfootSound click = new GreenfootSound("Click.mp3");
    public static GreenfootSound winSound = new GreenfootSound("win-sound.mp3");
    public static GreenfootSound loseSound = new GreenfootSound("lose-sound.mp3");
    public static GreenfootSound cashSound = new GreenfootSound("cash-sound.mp3");
    // Music On/Off buttons
    private Button musicOn = new Button(new GreenfootImage("musicon.png"));
    private Button musicOff = new Button(new GreenfootImage("musicoff.png"));
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 540, 1); 
    }
}
