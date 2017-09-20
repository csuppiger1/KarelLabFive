
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends Robot
{
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public int beepers;
    public void findTreasure() {
        beepers = 0;
        while(!nextToABeeper()) {
            move();
        }
        while(nextToABeeper()) {
            pickBeeper();
            beepers++;
        }if (beepers == 1) {
            faceNorth();
        }if (beepers == 2) {
            faceEast();
        }if (beepers == 3) {
            faceSouth();
        }if (beepers == 4) {
            faceWest();
        }if (beepers == 5) {
            turnOff();
        }
        findTreasure();
    }public void faceNorth() {
        while(!facingNorth()) {
            turnLeft();
        }
    }public void faceEast() {
        while(!facingEast()) {
            turnLeft();
        }
    }public void faceSouth() {
        while(!facingSouth()) {
            turnLeft();
        }
    }public void faceWest() {
        while(!facingWest()) {
            turnLeft();
        }
    }
}

