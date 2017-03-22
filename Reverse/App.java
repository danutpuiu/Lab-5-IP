// Decompiled by DJ v3.10.10.93 Copyright 2007 Atanas Neshkov  Date: 22.03.2017 15:07:59
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   App.java


import java.util.Random;
import java.util.Vector;

public class App
{

    private Game game;

    public App()
    {
    }

    public static void main(String args[])
    {
        Game g1 = Game.newGame("test_name");

        System.out.println("g1 name: " + g1.toString());

        Game g2 = Game.newGame("another_test_name");

        System.out.println("g2 name: " + g2.toString());

        System.out.println("\nHash codes:\n\tg1:\t" + g1.hashCode() + "\n\tg2:\t" + g2.hashCode());

        Vector<Bird> birds = new Vector<>();

        System.out.println("___________________________\nBIRDS:\n");

        Random randGen = new Random();
        for (int i = 0; i < 10; ++i) {
            switch (randGen.nextInt(3)) {
                case 0:
                    birds.addElement(new BlackBird());
                    break;
                case 1:
                    birds.addElement(new RedBird());
                    break;
                case 2:
                    birds.addElement(new YellowBird());
                    break;
                default:
                    break;
            }
        }

        for (Bird b : birds)
            System.out.println(b.toString());
    }

    public String toString() {
        return new String("App instance");
    }
}