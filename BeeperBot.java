
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void runRace() {
        while(frontIsClear()) {
            collectBeepers();
            collectBeepers();
        }
    }
   public void collectBeepers() {
       faceEast();
       findBeeperColumn();
       collectColumn();
       returnToFloor();
    }
    public void faceEast() {
        while(!facingEast()) {
            turnLeft();
        }
    }
    public void findBeeperColumn() {
        while(!nextToABeeper()) {
            move();
        }
    }
    public void collectColumn() {
        faceNorth();
        while(nextToABeeper()) {
            pickBeeper();
            move();
        }
    }
    public void faceNorth() {
        while(!facingNorth()) {
            turnLeft();
        }
    }
    public void returnToFloor() {
        faceSouth();
        while(frontIsClear()) {
            move();
        }
        turnLeft();
    }
    public void faceSouth() {
        while(!facingSouth()) {
            turnLeft();
        }
    }
  
}