// Decompiled by DJ v3.10.10.93 Copyright 2007 Atanas Neshkov  Date: 22.03.2017 15:08:43
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Game.java


public class Game
{

    private String name;
    private static Boolean instantiated = false;
    private static Game instance;
    public LevelManager levelManager;

    private Game(String name) {
        this.name = name;
    }

    public static Game newGame(String name) {
        if (instantiated == false) {
            instance = new Game(name);
            instantiated = true;
        }
        else {
            System.out.println("WARNING: Instantiating singleton more than once. Using the initial instance.");
        }
        return instance;
    }

    public String toString () {
        return name;
    }

    public void init()
    {
    }

    public void run()
    {
    }

}