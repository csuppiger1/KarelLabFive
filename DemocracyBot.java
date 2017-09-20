
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DemocracyBot extends Robot
{
    public DemocracyBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public int beepers;
    public void fixBallots() {
        move();
        if(nextToABeeper()) {
            beepers++;
            move();
            fixBallots();
        } else {
            checkRooms();
        }
    }public void checkRooms() {
        turnLeft();
        move();
        checkForBeeper();
        turnRight();
        turnRight();
        move();
        move();
        checkForBeeper();
        turnLeft();
        turnLeft();
        move();
        turnRight();
        move();
        fixBallots();
    }public void checkForBeeper() {
        if(nextToABeeper()) {
            pickBeeper();
        }
    }public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
   
}

