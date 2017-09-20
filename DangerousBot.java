
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DangerousBot extends Robot
{
    public DangerousBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    int beepers;
    public void choosePile() {
        while(nextToABeeper()) {
            pickBeeper();
            beepers++;
        }
        if(beepers%2 == 1) {
            turnLeft();
            move();
        } else {
            turnRight();
            move();
        } 
        while(nextToABeeper()) {
                pickBeeper();
        }
    } public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

