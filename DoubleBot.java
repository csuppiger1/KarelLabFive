


import kareltherobot.*;

/**
 * Write a description of class Template here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoubleBot extends Robot
{
    // instance variables - replace the example below with your own
    public int beepers;

    /**
     * Constructor for objects of class Template
     */
     public DoubleBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }

    public void doubleBeepers()
    {
        move();
        int beepers = 0;
        while(nextToABeeper()) {
            pickBeeper();
            beepers++;
        }
        int i;
        for(i = 0; i <= beepers; i++) {
            putBeeper();
        }
        move();
        for(i = 0; i <= (beepers*2)+1; i++) {
            putBeeper();
        }
        move();
        
    }
}
